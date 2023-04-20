package ua.javarush.task.pro.task07.task0706;

/* 
Дивне ділення
У методі main виклич метод div() із таким аргументом, щоб у консоль було виведено "NaN".
Код методу div() змінювати не можна.

Requirements:
1. У методі main() потрібно викликати метод div().
2. У результаті виклику методу div() у консоль має бути виведено "NaN".
3. Не змінюй код методу div().
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        div(0.0, 0.0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
