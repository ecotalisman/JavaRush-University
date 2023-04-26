package ua.javarush.task.pro.task11.task1108;

/* 
Утилітний калькулятор
Виконай рефакторинг коду: вилучи з нього утилітні методи й перенеси їх в окремий клас.
Для цього створи внутрішній статичний (вкладений) клас Calculator й перенеси в нього методи add, subtract, multiply і divide.
Не забудь підправити виклики цих методів.


Requirements:
1. У класі Solution потрібно створити вкладений (static nested) клас Calculator.
2. Методи add, subtract, multiply і divide потрібно перенести до класу Calculator.
3. Метод main має містити виклики методів add, subtract, multiply і divide класу Calculator.
*/

public class Solution {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;

        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);

//      It was condition:
//        add(a, b);
//        subtract(a, b);
//        multiply(a, b);
//        divide(a, b);
    }

    static class Calculator {
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }


//    It was condition:

//    public static void add(int a, int b) {
//        System.out.println(a + " + " + b + EQUAL + (a + b));
//    }
//
//    public static void subtract(int a, int b) {
//        System.out.println(a + " - " + b + EQUAL + (a - b));
//    }
//
//    public static void multiply(int a, int b) {
//        System.out.println(a + " * " + b + EQUAL + (a * b));
//    }
//
//    public static void divide(int a, int b) {
//        System.out.println(a + " / " + b + EQUAL + (a / b));
//    }
}
