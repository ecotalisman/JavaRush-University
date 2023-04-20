package ua.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заповнюємо масив
Реалізуй статичний метод main(String[]), який заповнює масив array значеннями valueStart і valueEnd.
Якщо значення довжини масиву парне, то першу половину масиву слід заповнити значеннями valueStart, а другу — valueEnd.
Якщо значення довжини масиву непарне, то більшу частину заповнити значеннями valueStart, меншу — valueEnd. Для
заповнення масиву використовуй метод Arrays.fill(int[], int, int, int).
Значення полів класу Solution під час тестування будуть різними, зваж на це.

Requirements:
1. Реалізуй метод main(String[]) згідно з умовою.
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишіть тут ваш код
        if (array.length % 2 == 0) {
            int endIndex = array.length / 2;
            Arrays.fill(array, 0, endIndex, valueStart);
            Arrays.fill(array, endIndex, array.length, valueEnd);
        } else if (array.length % 2 != 0) {
            int endIndex = array.length /2 + 1;
            Arrays.fill(array, 0, endIndex, valueStart);
            Arrays.fill(array, endIndex, array.length, valueEnd);
        }
// У коді нижче ми використовуємо лише один блок Arrays.fill() для кожного значення,
// valueStart та valueEnd. Ми обчислюємо endIndex, який залежить від того, чи є довжина
// масиву парною чи непарною. За допомогою цього підходу код стає коротшим та простішим
// для читання.

//        int endIndex = array.length / 2 + (array.length % 2);
//        Arrays.fill(array, 0, endIndex, valueStart);
//        Arrays.fill(array, endIndex, array.length, valueEnd);

        System.out.println(Arrays.toString(array));
    }
}

/*

Поділ оператора % у Java використовується для обчислення цілочисельного залишку, а не десяткового дробу. Коли ми
використовуємо array.length % 2, ми знаходимо залишок від ділення довжини масиву на 2. Це відрізняється від ділення
з десятковими дробами.

Наприклад:

Якщо довжина масиву дорівнює 20 (парне число), то 20 % 2 = 0 (без залишку).
Якщо довжина масиву дорівнює 21 (непарне число), то 21 % 2 = 1 (залишок 1).
Тому, коли ми ділимо 21 на 2, ми отримуємо цілочисельний результат 10 і залишок 1

Для ділення 21 на 2, ми можемо розділити 21 на дві рівні частини, які складаються з 10 одиниць кожна. Проте, після
того, як ми розділили 21 на 2, у нас залишається ще одна одиниця, яка не може бути розділена на дві рівні частини.
Отже, залишок від ділення 21 на 2 становить 1.

Можна представити це як наступне:
21 = 2 * 10 + 1

У цьому виразі, 21 - це число, яке ми ділимо; 2 - це дільник; 10 - це частка (результат ділення без залишку);
і 1 - це залишок від ділення.
*/
