package ua.javarush.task.pro.task12.task1204;

/* 
Сплата за рахунками
У класі Solution є поле balance, яке описує баланс коштів на банківському рахунку. Під час оголошення проініціалізуй його значенням Integer.MAX_VALUE.
Реалізуй метод processPayment(String), який приймає чек і здійснює списання коштів з рахунку згідно з чеком.
Метод main у перевірці не використовується.


Requirements:
1. Поле balance має ініціалізуватися значенням Integer.MAX_VALUE під час оголошення.
2. Метод processPayment(String) має зменшувати поле balance на значення переданого аргументу.
*/

public class Solution {
    public static Integer balance = Integer.MAX_VALUE;

    // It was condition
//    public static Integer balance;


    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Поточний баланс : " + balance);
        processPayment(bill);
        System.out.println("Поточний баланс : " + balance);
    }

    public static void processPayment(String bill) {
        //напишіть тут ваш код
        balance -= Integer.parseInt(bill);
    }
}
