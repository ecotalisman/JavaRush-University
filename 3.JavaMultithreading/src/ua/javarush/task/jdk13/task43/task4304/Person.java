package ua.javarush.task.jdk13.task43.task4304;

/* 
Нам null-и не страшні

Твоє завдання – перевизначити стандартний метод порівняння двох об'єктів compareTo() і зробити його null-safe
за допомогою статичного методу compare() класу StringUtils бібліотеки apache commons.

Метод compareTo() повинен порівнювати об'єкти на ім'я (перший параметр конструктора). В результаті роботи програми
в консолі повинне з'явитися виведення двох чисел: 14 та -1.

P.S. Для вирішення цього завдання бажано використовувати бібліотеку apache commons lang3 версії 3.9.

Requirements:
1. Не змінюй змінні name та age.
2. Не змінюй поточний конструктор та не додавай нових.
3. Клас Person має імплементувати інтерфейс Comparable.
4. Не змінюй метод main.
5. Метод compareTo повинен повертати результат роботи методу compare класу StringUtils, відповідно до умов.
6. Програма повинна виводити числа 14 та -1 у консолі.
*/

import org.apache.commons.lang3.StringUtils;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 55);
        Person person2 = new Person("Jane", 55);
        Person person3 = new Person(null, 55);

        System.out.println(person1.compareTo(person2));
        System.out.println(person3.compareTo(person2));
    }

    @Override
    public int compareTo(Person o) {
        //напишіть тут ваш код
        return StringUtils.compare(this.name, o.name);
    }
}
