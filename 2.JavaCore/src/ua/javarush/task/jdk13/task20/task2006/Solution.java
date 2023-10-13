package ua.javarush.task.jdk13.task20.task2006;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Серіалізация в XML
НЕОБХІДНО: підключені бібліотеки jackson-databind та jackson-dataformat-xml версії 2.13.1.

Реалізуй метод getXmlString. Він повинен серіалізувати отриманий об'єкт в XML рядок і повернути його.
Рядок має легко читатися:

<ArrayList>
<item>
<name>Мурка</name>
<age>5</age>
<weight>3</weight>
</item>
<item>
<name>Полкан</name>
<age>8</age>
<owner>Білли Бонс</owner>
</item>
</ArrayList>
Тобто в ній повинні бути перенесення рядків та відступи, як у прикладі. Для цього потрібно скористатися
SerializationFeature.INDENT_OUTPUT.

Requirements:
1. Метод getXmlString повинен повертати об'єкт, що отримав, у вигляді XML рядка, який легко читається.
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Мурка";
        cat.age = 5;
        cat.weight = 3;

        Dog dog = new Dog();
        dog.name = "Полкан";
        dog.age = 8;
        dog.owner = "Біллі Бонс";

        List<Pet> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);

        System.out.println(getXmlString(pets));
    }

    public static String getXmlString(Object object) throws IOException {
        //напишіть тут ваш код
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String xmlObject = xmlMapper.writeValueAsString(object);
        return xmlObject;
    }

    public static class Pet {
        public String name;
    }

    public static class Cat extends Pet {
        public int age;
        public int weight;
    }

    public static class Dog extends Pet {
        public int age;
        public String owner;
    }
}

