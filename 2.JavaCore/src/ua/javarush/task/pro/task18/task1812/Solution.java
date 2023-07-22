package ua.javarush.task.pro.task18.task1812;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/* 
Рейтинг мов програмування
Клас Language — це модель мови програмування. У цьому класі є два поля: name — назва мови програмування,
ranking — рейтинг використання мови програмування станом на вересень 2020 року, згідно з TIOBE.
Потрібно, щоб публічний статичний метод sortByRanking(ArrayList<Language>) сортував отриманий список мов програмування
за спаданням рейтингу й повертав відсортований потік даних (Stream<Language>).

Підказка:
Оскільки поле рейтингу має тип Double, для сортування потрібно використовувати статичний метод compare(Double, Double)
класу Double або метод compareTo(Double) об'єкта типу Double.

Метод main() під час тестування не перевіряється.

Requirements:
1. Метод sortByRanking(ArrayList<Language>) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<>();
        Collections.addAll(languages,
                new Language("С#", 4.58),
                new Language("JavaScript", 2.54),
                new Language("Python", 10.47),
                new Language("C++", 7.11),
                new Language("Go", 1.46),
                new Language("R", 2.37),
                new Language("Java", 13.48),
                new Language("C", 15.95),
                new Language("Swift", 1.38),
                new Language("PHP", 2.49));

        Stream<Language> languageStream = sortByRanking(languages);
        languageStream.forEach(System.out::println);
    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languages) {
        //напишіть тут ваш код - It was a condition:
//        return Stream.empty();

        // Change code here using Functional Interface Comparator:
        Stream<Language> languageStream = languages.stream()
                .sorted((o1, o2) -> Double.compare(o2.getRanking(), o1.getRanking()));

        return languageStream;
    }
}

/*
I. Варіант

Stream<T> sorted(Comparator<? super T> comparator);

Ось, що означають різні частини цього методу:
1) Stream<T>: Це тип повернення. Цей метод повертає потік, що містить елементи того ж типу, що й вихідний потік.
2) sorted: Це ім'я методу.
3) Comparator<? super T> comparator: Це параметр методу. Comparator - це функціональний інтерфейс, який використовується
для визначення порядку елементів. <? super T> означає, що компаратор може бути для типу T або будь-якого його надкласу.

використано лямбда-вираз, що представляє компаратор, замість створення анонімного внутрішнього класу або іншої
реалізації Comparator. Ось що цей код виглядає з явним Comparator:

Stream<Language> sortedStream = languages.stream()
    .sorted(new Comparator<Language>() {
        @Override
        public int compare(Language language1, Language language2) {
            return Double.compare(language2.getRanking(), language1.getRanking());
        }
    });

Але лямбда-вирази набагато скорочують і спрощують цей код:
        Stream<Language> languageStream = languages.stream()
                .sorted((o1, o2) -> Double.compare(o2.getRanking(), o1.getRanking()));


II. Варіант

Метод compareTo() є частиною інтерфейсу Comparable, який реалізується рядом класів в Java, включаючи клас Double.
Цей метод порівнює поточний об'єкт із заданим об'єктом. Результатом виклику compareTo() є від'ємне ціле число, нуль або
додатне ціле число, якщо поточний об'єкт менше, рівний або більше, ніж об'єкт, переданий в якості аргументу відповідно.

У випадку з типом Double ви можете використовувати метод compareTo() для порівняння значень. Ось приклад:

Double value1 = 1.0;
Double value2 = 2.0;

int result = value1.compareTo(value2);
У цьому прикладі, result буде від'ємним числом, тому що value1 менше за value2.

У контексті завдання, ми могли б використати compareTo() так:

Stream<Language> sortedStream = languages.stream()
    .sorted((language1, language2) -> language2.getRanking().compareTo(language1.getRanking()));

Цей код створить потік, який відсортований за спаданням рейтингу.
*/