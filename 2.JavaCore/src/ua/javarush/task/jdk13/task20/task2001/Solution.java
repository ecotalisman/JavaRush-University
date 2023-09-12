package ua.javarush.task.jdk13.task20.task2001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Як серіалізувати?
Зроби так, щоб серіалізація класу Human була можливою.

Requirements:
1. Клас Human має існувати всередині класу Solution.
2. Клас Human має бути статичним.
3. Клас Human має бути публічним.
4. Клас Human має підтримувати інтерфейс Serializable.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human implements Serializable {
        public String name;
        public List<String> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, String... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }
    }
}
