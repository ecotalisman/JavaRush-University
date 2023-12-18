package ua.javarush.task.jdk13.task43.task4303;

/* 
Нам шаблони не потрібні

Якщо тобі набрид типовий формат рядка, що повертається методом toString, сьогодні твій щасливий день.

Твоє завдання полягає в тому, щоб у перевизначеному методі toString класу Person створити власний стиль обробки рядка
за допомогою двох конкретних класів пакету org.apache.commons.lang3.builder бібліотеки apache commons.

Щоб досягти такого результату, у методі toString класу Person тобі потрібно:

1. Використовуючи один із методів класу StandardToStringStyle, вимкнути використання імені класу.
2. Використовуючи один із методів класу StandardToStringStyle, вимкнути використання хешкода класу.
3. Використовуючи один із методів класу StandardToStringStyle, встановити початок рядка як "This person's ".
4. Використовуючи один із методів класу StandardToStringStyle, встановити роздільник " is " між ім'ям змінних та їх значеннями.
5.Використовуючи один із методів класу StandardToStringStyle, вказати роздільник "; " між парами змінна+значення.
6. Використовуючи один із методів класу StandardToStringStyle, вказати крапку "." наприкінці рядка.
7. Для виведення рядка в бажаному форматі потрібно використовувати статичний метод reflectionToString класу ToStringBuilder.

Очікуємо на таке виведення на екран у класі Solution:

This person's name is Bob; age is 33; weight is 80; height is 179; sex is male.
This person's name is Mary; age is 35; weight is 60; height is 165; sex is female.
P.S. Для вирішення цього завдання бажано використовувати бібліотеку apache commons lang3 версії 3.9.

Requirements:
1. Не змінюй клас Solution.
2. Не змінюй змінні класу Person.
3. Не змінюй конструктор класу Person та не створювай нових.
4. Метод toString класу Person повинен повертати рядок у форматі, зазначеному в умовах.
5. Метод main класу Solution повинен виводити два рядки згідно з умовами.
*/

public class Solution {

    public static void main(String[] args) {
        Person person1 = new Person("Bob", 33, 80, 179,"male");
        Person person2 = new Person("Mary", 35, 60, 165, "female");

        System.out.println(person1);
        System.out.println(person2);
    }
}