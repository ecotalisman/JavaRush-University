package ua.javarush.task.pro.task11.task1104;

/* 
Конвертер рядка
У методі main перетвори рядок string на тип double за допомогою статичного методу parseDouble класу Double.
Потім округли отримане значення за допомогою статичного методу round класу Math.
Результат виведи на екран.


Requirements:
1. У методі main потрібно викликати метод parseDouble класу Double.
2. У методі main потрібно викликати метод round класу Math.
3. У консоль має бути виведено число 13.
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        //напишіть тут ваш код
        System.out.println(Math.round(Double.parseDouble(string)));
    }
}
