package ua.javarush.task.pro.task14.task1408;

/* 
Проковтуємо виняток
Перехопи виняток у методі main, щоб програма компілювалася.
У разі виникнення винятку потрібно вивести на екран рядок errorMessage.

Requirements:
1. У метод main потрібно додати блок try-catch.
2. Метод main не повинен кидати винятки, що перевіряються.
3. Метод main має викликати метод generateLuckyNumber.
4. Метод generateLuckyNumber змінювати не можна.
5. У разі виникнення винятку в методі main потрібно вивести на екран рядок errorMessage.
*/

public class Solution {

    public static String errorMessage = "не пощастило";

    public static void main(String[] args) {
        // It was a condition:
//        generateLuckyNumber();

        try {
            generateLuckyNumber();
        } catch (Exception e) {
            System.out.println(errorMessage);
        }
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твоє щасливе число: " + luckyNumber);
    }
}
