package ua.javarush.task.pro.task15.task1508;

import java.io.*;
import java.util.Scanner;

/* 
Читаємо з консолі
Програма зчитує з консолі рядок і виводить його на екран, чергуючи регістр символів: перший символ — у нижньому регістрі,
другий — у верхньому, третій — у нижньому і т. д.
Не змінюючи функцій програми, перепиши код із використанням BufferedReader для читання з консолі.

Requirements:
1. Програма має зчитати з консолі рядок і ввести його на екран, чергуючи регістр символів.
2. Для читання з консолі в програмі слід використати BufferedReader замість Scanner.
*/

public class Solution {
    public static void main(String[] args) {
        // It was a condition:
//        try (InputStream stream = System.in;
//             Scanner console = new Scanner(stream)) {
//            String line = console.nextLine();
//            char[] chars = line.toCharArray();
//            for (int i = 0; i < chars.length; i++) {
//                if (i % 2 == 1) {
//                    System.out.print(String.valueOf(chars[i]).toUpperCase());
//                } else {
//                    System.out.print(String.valueOf(chars[i]).toLowerCase());
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }

        // Change a code:
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

