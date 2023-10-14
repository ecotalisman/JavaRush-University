package ua.javarush.task.jdk13.task20.task2009;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.ArrayList;

/* 
Десеріалізація котів
НЕОБХІДНО: підключені бібліотеки jackson-databind та jackson-dataformat-xml версії 2.13.1.

До методу getFromXml першим параметром надходить xml-рядок, який містить один XML об'єкт. Другим параметром надходить
ім'я класу, об'єкт якого знаходиться в рядку.

Метод getFromXml повинен перетворити об'єкт з XML та повернути його.

Використай метод readValue з параметрами (File, Class) або (Reader, Class).

Requirements:
1. У методі getFromXml потрібно створити об'єкт типу XmlMapper за допомогою конструктора без параметрів.
2. Об'єкт, що повертається методом getFromXml, потрібно отримати за допомогою метода readValue(String, Class)
класу ObjectMapper.
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Cat cat = getFromXml("<Cat><name>Матроскін</name><cats><cats><name>кіт1</name><cats/></cats><cats><name>кіт2</name><cats/></cats><cats><name>кіт3</name><cats/></cats></cats></Cat>", Cat.class);
        System.out.println(cat);
    }

    public static <T> T getFromXml(String xmlString, Class<T> clazz) throws IOException {
        //напишіть тут ваш код
        ObjectMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xmlString, clazz);
    }

    static class Cat {
        public String name;
        public ArrayList<Cat> cats = new ArrayList<>();

        public Cat() {
        }

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", cats=" + cats +
                    '}';
        }
    }
}

