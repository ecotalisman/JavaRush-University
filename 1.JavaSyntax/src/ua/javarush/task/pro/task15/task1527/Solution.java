package ua.javarush.task.pro.task15.task1527;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Пропускаємо не всіх
Напиши програму, яка зчитує з консолі ім’я текстового файлу, далі читає рядки з цього файлу (використовуй
BufferedReader) і виводить їх на екран через один, починаючи з першого.


Requirements:
1. Програма повинна зчитати з консолі шлях до файлу.
2. Програма повинна вивести в консолі вміст файлу відповідно до умови.
3. Для читання рядків із файлу повинен бути використаний BufferedReader.
4. Потік читання BufferedReader має бути закритим.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        try (Scanner scanner = new Scanner(System.in);
             FileReader fileReader = new FileReader(scanner.nextLine());
             BufferedReader reader = new BufferedReader(fileReader)) {

            int lineNumber = 1;
            String line;
            while ((line = reader.readLine()) != null) {
                if (lineNumber % 2 != 0) {
                    System.out.println(line);
                }
                lineNumber++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}