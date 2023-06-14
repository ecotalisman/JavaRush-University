package ua.javarush.task.pro.task15.task1533;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
Заміна потоку
Потрібно відрефакторити метод writeData: замість запису у файл запиши отримані дані у ByteArrayOutputStream і поверни отриманий потік.

Requirements:
1. Метод writeData повинен мати тип значення ByteArrayOutputStream, що повертається.
2. Метод writeData повинен повертати потік з тими самими даними, які раніше записувалися у файл.
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        writeData("Justinian", "Justinian@mega.city.one", 41, 391);

        // See what writing in console:
//        ByteArrayOutputStream baos = writeData("Justinian", "Justinian@mega.city.one", 41, 391);
//        System.out.println(baos.toString());
    }

    public static ByteArrayOutputStream writeData(String name, String email, int level, int rating) throws IOException {

        // It was a condition:
//        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\temp.txt")) {
//            fos.write(("Ім'я: " + name + "\n").getBytes(StandardCharsets.UTF_8));
//            fos.write(("Пошта: " + email + "\n").getBytes(StandardCharsets.UTF_8));
//            fos.write(("Рівень: " + level + "\n").getBytes(StandardCharsets.UTF_8));
//            fos.write(("Рейтинг: " + rating + "\n").getBytes(StandardCharsets.UTF_8));
//        }

        // Change code:
        ByteArrayOutputStream stream = new ByteArrayOutputStream();

        try (stream) {
            stream.write(("Ім'я: " + name + "\n").getBytes());
            stream.write(("Пошта: " + email + "\n").getBytes());
            stream.write(("Рівень: " + level + "\n").getBytes());
            stream.write(("Рейтинг: " + rating + "\n").getBytes());
        }
        return stream;
    }
}
