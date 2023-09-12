package ua.javarush.task.jdk13.task20.task2002;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* 
Як серіалізувати JavaRush?
Зроби так, щоб серіалізація класу JavaRush була можливою.

Requirements:
1. Клас JavaRush має існувати всередині класу Solution.
2. Клас JavaRush має бути статичним.
3. Клас JavaRush має бути публічним.
4. Серіалізація класу JavaRush повинна бути можливою.
*/

public class Solution {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) {

    }
}
