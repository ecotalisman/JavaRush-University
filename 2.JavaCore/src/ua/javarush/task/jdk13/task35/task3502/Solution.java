package ua.javarush.task.jdk13.task35.task3502;

import java.util.List;

/* 
Знайомство з дженериками
Параметризируй класи SomeClass і Solution таким чином:
1. SomeClass повинен працювати з типами, які успадковуються від Number;
2. Solution повинен працювати з типами, які успадковуються від List, який, в свою чергу, параметризується типом SomeClass.

Requirements:
1. Клас SomeClass повинен працювати з типами, які успадковуються від Number.
2. Клас Solution повинен працювати з типами, які успадковуються від List, який, в свою чергу, параметризується типом SomeClass.
3. Клас SomeClass має бути публічним.
4. Клас SomeClass має бути статичним.
5. Клас SomeClass має знаходитися всередині класу Solution.
*/

public class Solution<T extends List<Solution.SomeClass>> {
    public static void main(String[] args) {

    }

    public static class SomeClass<N extends Number> {
    }
}
