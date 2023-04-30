package ua.javarush.task.pro.task12.task1203;

/* 
Порівняння чисел
У класі Solution є три поля з однаковими значеннями. У методі main виконується їх порівняння з виведенням результату в консоль.
Додай використання методу equals() в методі main стільки разів, скільки необхідно для виведення в консоль такого результату:
true
true
true

Requirements:
1. Поля класу Solution змінювати не можна.
2. Результат виведення має відповідати умові.
3. Додай використання методу equals() мінімальну кількість разів.
*/

public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {

        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);


        // it was condition:
//        System.out.println(first == second);
//        System.out.println(third == second);
//        System.out.println(third == first);
    }
}
