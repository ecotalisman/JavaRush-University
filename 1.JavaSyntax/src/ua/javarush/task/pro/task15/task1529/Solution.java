package ua.javarush.task.pro.task15.task1529;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* 
Пишемо символи у файл
Є програма, яка зчитує з консолі шлях до файлу і записує в цей файл послідовність символів, попередньо перетворюючи символи у байти.
Твоє завдання – прибрати з програми це непотрібне перетворення. Тобто переписати код так, щоб у файл записувалися одразу символи.

Як ти вже знаєш, для запису символів у файл потрібно використовувати FileWriter.

Requirements:
1. Програма повинна зчитувати з консолі шлях до файлу.
2. Програма повинна переписувати символи у файлу.
3. Для запису символів потрібно використовувати FileWriter.
4. Потік для запису має бути закритим.
*/

public class Solution {
    public static void main(String[] args) {
        // It was a condition:
//        try (Scanner scanner = new Scanner(System.in);
//             FileOutputStream output = new FileOutputStream(scanner.nextLine())) {
//            char[] chars = new char[]{'j', 'a', 'v', 'a'};
//            for (char aChar : chars) {
//                output.write((byte)aChar);
//            }
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }

        // change code:
        try (Scanner scanner = new Scanner(System.in);
             FileWriter writer = new FileWriter(scanner.nextLine())) {
            char[] chars = new char[]{'j', 'a', 'v', 'a'};
            writer.write(chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}