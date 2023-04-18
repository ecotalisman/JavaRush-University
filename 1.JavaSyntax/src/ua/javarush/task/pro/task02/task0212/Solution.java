package ua.javarush.task.pro.task02.task0212;

/* 
Прошу регістр на мене не підвищувати!
У методі main на екран виводяться три рядки.
Зміни код так, щоб усі літери в цих рядках стали великими.


Requirements:
1. Не змінюй значення змінних caps і usa.
2. Для трьох рядків, переданих у метод println, виклич метод toUpperCase.
3. Програма повинна виводити три рядки.
*/

public class Solution {

    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";

        //напишіть тут ваш код
        System.out.println(usa.toUpperCase());
        System.out.println("Вінні-Пух".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
}
