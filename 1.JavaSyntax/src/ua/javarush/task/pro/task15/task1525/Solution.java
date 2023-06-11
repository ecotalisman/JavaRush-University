package ua.javarush.task.pro.task15.task1525;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/* 
Щось не копіюється...
Є програма, яка зчитує з консолі шлях до файлу1 та шлях до файлу2 і копіює вміст файла1 у файл2.
Але вона не працює коректно. Знайди та виправ помилки у коді, щоб програма запрацювала як потрібно.

Requirements:
1. Програма повинна зчитувати з консолі шляхи до файлів.
2. Програма повинна переписувати вміст із одного файлу в інший.
3. Для читання із файлів повинен бути використаний метод read() об'єкта FileInputStream.
4. Для запису у файл повинен бути використаний метод write() об'єкта FileOutputStream.
5. Потоки для читання та запису мають бути закриті.
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(scanner.nextLine());
             FileOutputStream fos = new FileOutputStream(scanner.nextLine())) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (fis.available() > 0) {

                // It was a condition:
//                int read = fis.read();
//                fos.write(buffer, size, read);

                // change a code line:
                int read = fis.read(buffer);
                fos.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}