package ua.javarush.task.pro.task15.task1524;

import java.io.*;
import java.util.Scanner;

/*
Переплутані байти
Напиши програму, яка зчитує з консолі шлях до файлу1 та шлях до файлу2. Далі всі байти з файла1 записує файл2, але при
цьому змінює їх місцями за таким принципом: перший із другим, третій із четвертим і так далі.

Якщо останній байт у файле1 непарний, пишемо його у файл2 як є. Для читання та запису файлів використовуй FileInputStream
і FileOutputStream.

Requirements:
1. Програма повинна зчитувати з консолі шляхи до файлів.
2. Програма повинна переписувати байти з одного файлу в інший відповідно до умови.
3. Для читання та запису файлів мають бути використані FileInputStream і FileOutputStream.
4. Потоки для читання та запису мають бути закриті.
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);

        // ми використовуємо рядкове представлення адреси файлу inputFile для визначення розміру буферу. У цьому випадку
        // inputFile - це просто рядок, а не об'єкт файлу, тому ви не можете викликати метод length() для отримання розміру файлу.
        // Замість цього вам потрібно створити об'єкт File з цього рядка, а потім викликати метод length()
        // byte[] buffer = new byte[(int) inputFile.length()];

        // correct create object
        String inputFile = scanner.nextLine();
        File f1 = new File(inputFile);

        String f2 = scanner.nextLine();

        // Check how it's work in file:
//        File f1 = new File("1.JavaSyntax\\src\\ua\\javarush\\task\\pro\\task15\\task1524\\input.txt");
//        File f2 = new File("1.JavaSyntax\\src\\ua\\javarush\\task\\pro\\task15\\task1524\\output.txt");

        try (FileInputStream input = new FileInputStream(f1);
             FileOutputStream output = new FileOutputStream(f2)) {
            byte[] buffer = new byte[(int) f1.length()];
            int bytesRead;

            while ((bytesRead = input.read(buffer)) > 0) {
                for (int i = 0; i < buffer.length - 1; i += 2) {
                    byte temp = buffer[i];
                    buffer[i] = buffer[i + 1];
                    buffer[i + 1] = temp;
                }

                // Write the bytes
                output.write(buffer, 0, bytesRead);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}