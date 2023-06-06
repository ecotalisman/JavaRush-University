package ua.javarush.task.pro.task15.task1503;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Коли ресурсів багато
Програма зчитує з консолі шлях до файлу, читає рядки з файлу й виводить їх на екран.
Перепиши код програми з використанням try-with-resources: візьми в круглі дужки створення об'єктів із зовнішніми ресурсами.
Не забудь видалити непотрібний блок finally й виклики методу close().

Requirements:
1. Програма має зчитати з консолі шлях до файлу, потім прочитати рядки з файлу й вивести їх на екран.
2. У програмі має використовуватися оператор try-with-resources згідно з умовою.
3. Оператор try-with-resources не повинен містити блок finally.
4. У об'єктів із зовнішніми ресурсами не має бути явних викликів методу close().
5. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = null;
        BufferedReader bufferedReader = null;
        try {
            scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            bufferedReader = Files.newBufferedReader(Path.of(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }
}

