package ua.javarush.task.jdk13.task13.task1313;

import java.awt.*;

/* 
Компіляція програми
Виправ класи Fox та BigFox таким чином, щоб програма компілювалася.
У рішенні цієї задачі не потрібно створювати екземпляри базового класу.
Метод main не змінюй.

Requirements:
1. Інтерфейс Animal потрібно реалізувати в класі Fox.
2. У класі Fox потрібно реалізувати лише один метод — getName().
3. В інтерфейсі Animal потрібно оголосити метод getColor().
4. Клас BigFox має бути нащадком Fox.
5. Клас Fox повинен бути абстрактним.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        @Override
        public Color getColor() {
            return Color.RED;
        }
    }

}
