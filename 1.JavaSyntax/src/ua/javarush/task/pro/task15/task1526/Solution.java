package ua.javarush.task.pro.task15.task1526;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/* 
Фейсконтроль
Напиши програму, яка зчитує з консолі ім’я текстового файлу, далі читає символи з цього файлу (використовуй FileReader)
і виводить на екран все, крім точки, коми та пробілу.

Requirements:
1. Програма повинна зчитати з консолі шлях до файлу.
2. Програма повинна вивести в консолі вміст файлу відповідно до умови.
3. Для читання символів із файлу має бути використаний FileReader.
4. Потік читання FileReader має бути закритим.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код

        try (Scanner scanner = new Scanner(System.in);
             var reader = new FileReader(scanner.nextLine())) {
            int data;
            while ((data = reader.read()) != -1) {
                char symbol = (char) data;
                if (symbol != '.' && symbol != ',' && symbol != ' ') {
                    System.out.print(symbol);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*

FileReader є класом, що входить до стандартної бібліотеки Java в пакеті java.io. Він є підкласом InputStreamReader
і представляє з себе клас для читання символьних файлів. FileReader читає тексти, використовуючи стандартну системну кодування.

Для більш детального контролю над кодуванням можна використовувати InputStreamReader, що є більш універсальним,
а FileReader використовується для більш простих випадків, коли вам просто потрібно прочитати текстовий файл з системною кодуванням.

*/