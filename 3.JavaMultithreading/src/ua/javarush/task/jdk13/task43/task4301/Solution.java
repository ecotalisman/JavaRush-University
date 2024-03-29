package ua.javarush.task.jdk13.task43.task4301;

/* 
Порівняй кандидатів

Працівнику трудового агентства потрібно написати програму, яка швидко порівнює двох кандидатів за специфічними критеріями.

За запитом роботодавця потрібно знайти двох кандидатів чоловічої статі з 15-річним стажем.

Для вирішення цього завдання тобі потрібно перевизначити метод equals у класі Candidate. Метод equals повинен повертати
результат роботи методу reflectionEquals класу EqualsBuilder, до параметрів якого має передаватися наступне:

1. поточний та новий об'єкт
2. дозвіл обробляти transient змінні
3. заборона використовувати рефлексію для суперкласу
4. виключення порівняння полів name, age, height та weight

P.S. Для вирішення цього завдання бажано використовувати бібліотеку apache commons lang3 версії 3.9.

Requirements:
1. Не змінюй клас Solution.
2. Не змінюй змінні класу Candidate.
3. Не змінюй поточний конструктор із параметрами класу Candidate та не додавай нових конструкторів.
4. Метод equals класу Candidate має працювати відповідно до умов.
5. Результат порівняння двох кандидатів має дорівнювати true.
*/

public class Solution {

    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("John", 38, "male", 185, 81, 15);
        Candidate candidate2 = new Candidate("Omar", 44, "male", 175, 75, 15);

        System.out.println(candidate1.equals(candidate2));
    }
}
