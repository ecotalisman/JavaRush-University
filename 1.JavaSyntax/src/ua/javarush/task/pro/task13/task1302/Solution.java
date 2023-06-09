package ua.javarush.task.pro.task13.task1302;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Перевірка наявності
У класі Solution є метод checkWords(String), який має перевіряти наявність переданого слова в множині words.
Якщо слово є, то виводимо в консоль:
Слово [передане слово] є в множині
Якщо слова немає:
Слова [передане слово] немає в множині

Метод main у перевірці не використовується.

Приклад виведення:
Слово Java є в множині


Requirements:
1. Клас Solution має містити публічне статичне поле words типу HashSet<String>.
2. Клас Solution має містити публічний статичний метод checkWords(String), який не повертає жодного значення (тип void).
3. Метод checkWords(String) має працювати згідно з умовою.
*/

public class Solution {

    // It was wrong, cause have "," after 'Java'
//    public static HashSet<String> words = new HashSet<>(asList("Якби мене попросили вибрати мову взамін на Java, я б не вибирав".split(" ")));
    public static HashSet<String> words = new HashSet<>(asList("Якби мене попросили вибрати мову взамін на Java, я б не вибирав".replaceAll("[,.]", "").split(" ")));

    public static void checkWords(String word) {
        //напишіть тут ваш код

        if (words.contains(word)) {
            System.out.println("Слово " + word + " є в множині");
        } else {
            System.out.println("Слова " + word + " немає в множині");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}

/*
replaceAll та split - це два методи, які використовуються для роботи з рядками в Java.

1) replaceAll: Цей метод замінює всі входження певного шаблону в рядку на вказаний рядок. Він приймає два аргументи:

- перший аргумент - регулярний вираз, який визначає шаблон, який потрібно знайти у рядку
- другий аргумент - рядок, на який потрібно замінити знайдені входження шаблону
У нашому випадку ми використовуємо replaceAll("[,.]", ""). Тут [,.] - регулярний вираз, який шукає коми та крапки, а
другий аргумент - порожній рядок "". Це означає, що ми замінюємо всі коми та крапки на порожній рядок, тобто видаляємо їх.

2) split: Цей метод розділяє рядок на масив підрядків за вказаним розділювачем. Він приймає один аргумент - регулярний вираз,
який використовується як розділювач.

У нашому випадку ми використовуємо split(" "). Тут " " - регулярний вираз, який відповідає пробілу. Метод розділяє
вхідний рядок на масив підрядків, розділяючи його за пробілами.

Отже, в нашому прикладі, спочатку ми видаляємо коми та крапки з рядка, використовуючи replaceAll("[,.]", ""), а потім
розділяємо отриманий рядок на масив слів за пробілами, використовуючи split(" ").
*/