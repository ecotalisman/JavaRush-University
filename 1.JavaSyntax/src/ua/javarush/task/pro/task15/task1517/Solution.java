package ua.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файлові операції
Напиши програму, яка зчитуватиме з клавіатури два шляхи до файлу.

Якщо за першим шляхом файлу немає, його потрібно створити.
Якщо за першим шляхом файл є, його потрібно перемістити на другий шлях, але тільки за умови, що за другим шляхом файлу немає.
Якщо такий файл є, потрібно просто видалити файл за першим шляхом.
Використай відповідні методи класу Files: createFile(), move(), delete(), exists()/notExists().

Requirements:
1. Програма має зчитувати з консолі два шляхи.
2. У програмі потрібно використати відповідні методи класу Files: createFile(Path.class), move(Path, Path), delete(Path),
exists(Path)/notExists(Path).
3. Програма має обробляти введені шляхи згідно з умовою.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());

        //напишіть тут ваш код
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        } else if (Files.exists(filePath) && !Files.exists(fileNewPath)) {
            Files.move(filePath, fileNewPath);
        } else if (Files.exists(filePath) && Files.exists(fileNewPath)) {
            Files.delete(filePath);
        }
    }
}

