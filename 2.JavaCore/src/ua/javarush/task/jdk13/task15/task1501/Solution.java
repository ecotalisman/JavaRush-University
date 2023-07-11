package ua.javarush.task.jdk13.task15.task1501;

/* 
Щось зайве
Видали реалізації всіх зайвих методів, щоб програма виводила таке:
Це double
Це Object
Це double
Це Integer
Це double

Requirements:
1. У класі Solution повинен лишитися метод print() з одним параметром типу Integer.
2. У класі Solution повинен лишитися метод print() з одним параметром типу Object.
3. У класі Solution повинен лишитися метод print() з одним параметром типу double.
4. Виведення на екран має бути відповідним до умови завдання.
*/

public class Solution {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("Це Integer");
    }

//    public static void print(int i) {
//        System.out.println("Це Integer");
//    }
//
//    public static void print(Short i) {
//        System.out.println("Це Object");
//    }

    public static void print(Object i) {
        System.out.println("Це Object");
    }

    public static void print(double i) {
        System.out.println("Це double");
    }

//    public static void print(Double i) {
//        System.out.println("Це double");
//    }
//
//    public static void print(float i) {
//        System.out.println("Це Double");
//    }
}
