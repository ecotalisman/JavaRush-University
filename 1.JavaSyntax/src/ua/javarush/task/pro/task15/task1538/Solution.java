package ua.javarush.task.pro.task15.task1538;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Використання Paths
У методі main ініціалізуй поле rpmLogPath абсолютним ім’ям файлу rpm.log, який знаходиться у папці /usr/lib/rpm.

Для створення об’єкта Path використовуй метод get з одним параметром типу URI класу Paths.

Requirements:
1. Метод main повинен ініціалізувати поле rpmLogPath абсолютним шляхом до файлу rpm.log у папці /usr/lib/rpm.
2. Метод main повинен використовувати метод Paths.get() з одним параметром типу URI для створення об'єкта Path.
*/

public class Solution {

    public static Path rpmLogPath;

    public static void main(String[] args) {
        //напишіть тут ваш код
        URI uri = URI.create("file:///usr/lib/rpm/rpm.log");
        rpmLogPath = Paths.get(uri);
    }
}
