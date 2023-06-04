package ua.javarush.task.pro.task14.task1409;

/* 
Пропускаємо крізь себе
Зроби так, щоб програма компілювалася, не використовуючи try-catch.


Requirements:
1. Метод main не повинен містити блок try-catch.
2. Метод main має кидати виняток.
3. Метод main має викликати метод generateLuckyNumber().
4. Метод generateLuckyNumber змінювати не можна.
*/

public class Solution {

//    It was a condition:
//    public static void main(String[] args) {
//        generateLuckyNumber();
//    }

    // Write code here:
    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не пощастило");
        }
        System.out.println("твоє щасливе число: " + luckyNumber);
    }
}
