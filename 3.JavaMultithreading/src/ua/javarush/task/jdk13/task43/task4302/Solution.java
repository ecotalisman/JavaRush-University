package ua.javarush.task.jdk13.task43.task4302;

/* 
Порівнюємо котів

Співробітникам ветеринарного центру була потрібна програма для порівняння котів. Для економії коштів найняли місцевого
"програміста", який написав програму лише наполовину.

Твоє завдання – дописати програму: додати до класу Cat метод hashCode, який повертатиме результат роботи об'єкта
HashCodeBuilder. Метод hashCode повинен використовувати лише змінні age та breed класу Cat для порівняння об'єктів.

У вирішенні не можна використовувати статичний метод reflectionHashCode класу HashCodeBuilder.

P.S. Для вирішення цього завдання бажано використовувати бібліотеку apache commons lang3 версії 3.9.

Requirements:
1. Не змінюй клас Solution.
2. Не змінюй змінні класу Cat.
3. Не змінюй конструктор класу Cat та не додавай нові.
4. Не змінюй метод equals класу Cat.
5. Реалізуй метод hashCode класу Cat згідно з умовами.
*/

public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Bonya", 5, 4, "Devon Rex");
        Cat cat2 = new Cat("Ginger", 5, 6, "Devon Rex");

        System.out.println(cat1.equals(cat2));
    }
}
