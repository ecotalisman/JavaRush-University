package ua.javarush.task.pro.task09.task0904;

/* 
Символьні літерали
У класі Solution оголошено чотири публічних символьних поля. Їм присвоєно певні значення. Проте програма не
компілюється. Це потрібно виправити, не змінюючи значень символів.
Усі поля статичні (static) — це потрібно для того, щоб отримати до них доступ у методі main().
Побачити результат можна, якщо запустити метод main(). Він у тестуванні не використовується.


Requirements:
1. Змінній first слід присвоїти значення '\u004A'.
2. Змінній second слід присвоїти значення 'a'.
3. Змінній third слід присвоїти значення '\u0076'.
4. Змінній fourth слід присвоїти значення 'a'.
*/

public class Solution {
    public static char first = '\u004A';
    public static char second = 'a';
    public static char third = '\u0076';
    public static char fourth = 'a';

    public static void main(String[] args) {
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
    }
}
