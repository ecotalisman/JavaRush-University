package ua.javarush.task.jdk13.task43.task4307;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Objects;

/* 
Шило на мило
Твоє завдання — змінити код методів printFirstNonNull, printDefaultValueIfNullObject та printIfAllNotNull класу Solution,
щоб у вирішенні замість методів класу ObjectUtils бібліотеки apache commons використовувалися методи класів Objects та Strings:

1. Метод printFirstNonNull повинен виводити на екран перший не null елемент масиву, що передається йому як параметр.
Рішення має використовувати методи isNull (для перевірки вхідного масиву) та nonNull (для пошуку не null елемента)
класу Objects. Намагайся максимально зберегти функціонал методу.

2. Метод printDefaultValueIfNullObject повинен виводити на екран елементи масиву, що йому передався, замінюючи null-елементи
на рядок, який передається через змінну defaultValue.
Рішення має використовувати метод requireNonNullElse класу Objects.

3. Під час запуску методу main виведення в консолі має залишитися таким:

hello
----------
oops
hello
ok
oops
bye

Requirements:
1. Не змінюй метод main класу Solution.
2. Метод printFirstNonNull потрібно змінити відповідно до умов.
3. Метод printDefaultValueIfNullObject потрібно змінити відповідно до умов.
4. Виведення на екран не повиннне змінюватися.
*/

public class Solution {

    public static void main(String[] args) {
        String[] array1 = {null, "hello", "ok", null, "bye"};

        printFirstNonNull(array1);
        System.out.println("----------");
        printDefaultValueIfNullObject(array1, "oops");
    }

    public static void printFirstNonNull(final String... values) {
        if (Objects.isNull(values)) {
            return;
        }

        for (String value : values) {
            if (Objects.nonNull(value)) {
                System.out.println(value);
                return;
            }
        }

        // It was a condition:
//        System.out.println(ObjectUtils.firstNonNull(values));
    }

    public static void printDefaultValueIfNullObject(final String[] values, final String defaultValue) {
        for (String value : values) {
            System.out.println(Objects.requireNonNullElse(value, defaultValue));
        }

        // It was a condition:
//        for (String o : values) {
//            System.out.println(ObjectUtils.defaultIfNull(o, defaultValue));
//        }
    }
}
