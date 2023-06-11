package ua.javarush.task.pro.task15.task1528;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/* 
Пишемо байти у файл
У тебе є програма, яка зчитує з консолі шлях до файлу і записує в цей файл послідовність байтів, але в ній є помилка.
Як ти вже знаєш, Writer «не працює» з байтами: для запису байтів у файл потрібно використовувати FileOutputStream.

Твоє завдання — виправити програму.

Requirements:
1. Програма повинна зчитувати з консолы шлях до файлу.
2. Програма повинна переписувати байти у файл.
3. Для запису байтів потрібно використовувати FileOutputStream.
4. Потік для запису має бути закритим.
*/

public class Solution {
    public static void main(String[] args) {
        // It was a condition:
//        try (Scanner scanner = new Scanner(System.in);
//             Writer writer = new FileWriter(scanner.nextLine())) {
//            byte[] bytes = new byte[]{106, 97, 118, 97};
//            writer.write(bytes);
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }

        // change a code:
        try (Scanner scanner = new Scanner(System.in);
             FileOutputStream outputStream = new FileOutputStream(scanner.nextLine())) {
            byte[] bytes = new byte[]{106, 97, 118, 97};
            outputStream.write(bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}