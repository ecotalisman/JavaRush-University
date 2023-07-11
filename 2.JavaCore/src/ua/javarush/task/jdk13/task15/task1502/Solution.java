package ua.javarush.task.jdk13.task15.task1502;

/* 
ООП - Перевантаження - прибрати зайве
Подивися на реалізації методу print() у коді та визнач, який з них потрібно викликати.
Видали всі зайві реалізації методу print().

Requirements:
1. У класі Solution, окрім методу main, повинен лишитися один метод - print (із правильним параметром).
2. Метод print() повинен бути публічним.
3. Метод print() повинен бути статичним.
4. Програма повинна виводити на екран рядок "Я буду Java прогером!".
*/

public class Solution {
    public static void main(String[] args) {
        print(1);
    }

//    public static void print(byte b) {
//        System.out.println("Я буду Java прогером!");
//    }
//
//    public static void print(double d) {
//        System.out.println("Я буду Java прогером!");
//    }

    public static void print(long l) {
        System.out.println("Я буду Java прогером!");
    }

//    public static void print(float f) {
//        System.out.println("Я буду Java прогером!");
//    }
//
//    public static void print(char c) {
//        System.out.println("Я буду Java прогером!");
//    }
}
