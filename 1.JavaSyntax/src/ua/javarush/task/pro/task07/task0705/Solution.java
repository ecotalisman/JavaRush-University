package ua.javarush.task.pro.task07.task0705;

/* 
Нескінченність — не межа
У методі main виклич метод div() двічі. Перший раз — із такими аргументами, щоб у консоль було виведено "Infinity", а другий — "-Infinity".
Код методу div() змінювати не можна.

Requirements:
1. У методі main() потрібно двічі викликати метод div().
2. У результаті двох викликів методу div() у консоль має бути виведено "Infinity" й "-Infinity".
3. Не змінюй код методу div().
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        div(0.0, 1.0);
        div(0.0, -1.0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
