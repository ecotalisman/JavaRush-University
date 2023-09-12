package ua.javarush.task.jdk13.task20.task2004;

import java.io.Serializable;

/* 
Як серіалізувати static?
Зроби так, щоб серіалізація класу ClassWithStatic була можливою.

Requirements:
1. Клас ClassWithStatic має існувати всередині класу Solution.
2. Клас ClassWithStatic повинен бути статичним.
3. Клас ClassWithStatic повинен бути публічним.
4. Клас ClassWithStatic повинен підтримувати інтерфейс Serializable.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }
}
