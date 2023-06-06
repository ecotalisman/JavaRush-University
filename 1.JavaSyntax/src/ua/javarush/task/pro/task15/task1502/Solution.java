package ua.javarush.task.pro.task15.task1502;

import java.util.Scanner;

/* 
Повернення до витоків
Програма читає з консолі рядок і виводить його на екран у нижньому регістрі. Однак, виявляється, вона не працюватиме
на старих версіях Java (нижче 7-ї версії). Не змінюючи функцій програми, заміни блок try-with-resources на звичайний try-catch.
Не забудь про виклик методу close() для об'єктів із зовнішніми ресурсами.

Requirements:
1. Програма має зчитати з консолі рядок і вивести його на екран у верхньому регістрі.
2. У програмі має використовуватися блок try-catch без ресурсів.
3. У об'єктів із зовнішніми ресурсами потрібно викликати метод close() у блоці finally.
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            scanner.close();
        }

        // It was a condition:
//        try (Scanner scanner = new Scanner(System.in)) {
//            String line = scanner.nextLine();
//            System.out.println(line.toUpperCase());
//        } catch (Exception e) {
//            System.out.println("Something went wrong : " + e);
//        }
    }
}
