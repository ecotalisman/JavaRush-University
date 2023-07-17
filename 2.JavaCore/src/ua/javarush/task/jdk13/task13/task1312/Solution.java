package ua.javarush.task.jdk13.task13.task1312;

import java.awt.*;

/* 
Один метод у класі
Реалізуй інтерфейс Animal у класі Fox.
Зміни код таким чином, щоб у класі Fox був лише один метод - getName.
Врахуй, що методи видаляти не можна.

Requirements:
1. Інтерфейс Animal потрібно реалізувати в класі Fox.
2. У класі Fox потрібно реалізувати лише один метод — getName.
3. Інтерфейс Animal змінювати не можна.
4. Додаткові класи чи інтерфейси створювати не можна.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
