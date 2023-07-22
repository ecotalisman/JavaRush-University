package ua.javarush.task.pro.task18.task1815;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Перетворення даних
Обліковий запис (клас Account) має ім'я (поле name) і електронну скриньку (поле email). Потрібно, щоб метод
getEmails(ArrayList<Account>) у класі Solution повертав потік електронних скриньок усіх облікових записів зі списку,
отриманого як вхідний аргумент.

Підказка:
Для перетворення потоку даних одного типу на інший використовуй метод map() об'єкта типу Stream<Account>.

Метод main() під час тестування не перевіряється.

Requirements:
1. У публічному статичному методі getEmails(ArrayList<Account>) потрібно викликати метод map() об'єкта типу Stream<Account>.
2. Метод getEmails(ArrayList<Account>) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var accounts = new ArrayList<Account>();
        Collections.addAll(accounts,
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));

        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        //напишіть тут ваш код - It was a condition:
//        return Stream.empty();

        // Change code here:
        return accounts.stream().map(Account::getEmail);
    }
}

/*

Ми використовуємо метод map(), щоб перетворити потік Account у потік String, витягуючи поле електронної пошти з
кожного об'єкта Account.

Тут Account::getEmail є методом посиланням на екземпляр, який викликає метод getEmail для кожного об'єкта Account в потоці.

Після виконання цього коду, ми отримаємо потік String'ів, який складається із електронних скриньок кожного об'єкта Account.

*/