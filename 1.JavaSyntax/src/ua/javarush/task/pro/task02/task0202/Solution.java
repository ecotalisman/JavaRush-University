package ua.javarush.task.pro.task02.task0202;

/* 
Повнометражна картина
У змінній centimeters записана кількість сантиметрів.
У змінну meters потрібно записати кількість повних метрів, яка міститься в centimeters (1 метр = 100 см).
Для обчислення використовуй змінну centimeters і оператор ділення.
Для оголошення та ініціалізації змінної meters використовуй одну команду.


Requirements:
1. Не змінюй значення змінної centimeters.
2. Для обчислення meters потрібно використовувати centimeters і оператор ділення.
3. Програма повинна виводити на екран значення змінної meters.
*/

public class Solution {

    public static void main(String[] args) {
        int centimeters = 243;

        int meters = centimeters / 100; //напишіть тут ваш код

        System.out.println(meters);
    }
}