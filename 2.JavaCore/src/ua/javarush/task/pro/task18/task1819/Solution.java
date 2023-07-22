package ua.javarush.task.pro.task18.task1819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* 
Як бути, якщо в списку є елемент null
Призначення методу printList(List<String>) — вивести в консоль усі елементи списку, отриманого як параметр, у тому
самому порядку. Але є нюанс: список може містити елементи, які дорівнюють null.

Твоє завдання — вивести всі елементи списку в консоль, а замість null — фразу: Цей елемент дорівнює null
У методі printList(List<String>) не можна використовувати цикли, оператор if/else і тернарний оператор.
Для перевірки рівності рядка значенню null і заміни цього рядка на інший є метод orElse об'єкта типу Optional<String>.

Метод main() під час тестування не перевіряється.

Requirements:
1. У публічному статичному методі printList(List<String>) потрібно викликати метод orElse() об'єкта типу Optional<String>.
2. Метод printList(List<String>) потрібно реалізувати згідно з умовою.
3. У методі printList(List<String>) не слід використовувати цикли, оператор if/else і тернарний оператор.
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Цей елемент дорівнює null";
        //напишіть тут ваш код
        list.stream()
                .map(Optional::ofNullable)
                .forEach(str -> System.out.println(str.orElse(text)));
    }
}

/*

I. Варіант:

        list.stream()
                .map(Optional::ofNullable)
                .forEach(str -> System.out.println(str.orElse(text)));

Метод map у стрімах використовується для перетворення (мапування) кожного елемента потоку. Він приймає функцію
(в даному випадку Optional::ofNullable), яка виконується на кожному елементі стріму.

У коді map(Optional::ofNullable) конвертує кожний елемент стріму (String) в Optional<String>.
Optional - це контейнерний клас, що може містити або не містити значення, і допомагає в обробці значень null.

Таким чином, коли ми працюємо зі значеннями null в потоці, Optional::ofNullable створює Optional об'єкт, що може бути
порожнім (null у вихідному потоці) або містити значення (non-null у вихідному потоці). Це полегшує роботу з
можливими null значеннями.

Потім, з допомогою forEach, ми проходимо кожен Optional<String> в потоці, і для кожного такого об'єкта викликаємо
метод orElse(text), який повертає значення Optional, якщо воно присутнє, або заданий резервний рядок (text)
в іншому випадку.


II. Варіант:

        for (String s : list) {
            String orElse = Optional.ofNullable(s).orElse(text);
            System.out.println(orElse);
        }

Метод printList проходить по всіх елементах у списку list, використовуючи цикл for-each. Для кожного елемента списку s,
створюється об'єкт Optional, який може містити s (якщо s не дорівнює null) або бути порожнім (якщо s дорівнює null).

String toPrint = Optional.ofNullable(s).orElse(text); - в цьому рядку коду, Optional.ofNullable(s) створює об'єкт
Optional, що може містити значення s або бути порожнім, якщо s дорівнює null. Далі, викликається метод orElse(text),
який повертає значення в Optional (якщо воно є), або text (якщо Optional порожній).

Таким чином, toPrint буде містити або значення s (якщо s не дорівнює null), або рядок text (якщо s дорівнює null).
На кожному кроці циклу, це значення потім виводиться в консоль.

*/