package ua.javarush.task.pro.task15.task1501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Скорочуємо try
Програма читає з консолі рядок і виводить його на екран у нижньому регістрі. Не змінюючи функцій програми, перепиши
код із використанням try-with-resources. Візьми в круглі дужки створення об'єктів із зовнішніми ресурсами. Не забудь
видалити непотрібні виклики методу close().

Requirements:
1. Програма має зчитати з консолі рядок і вивести його на екран у нижньому регістрі.
2. У програмі має використовуватися оператор try-with-resources згідно з умовою.
3. У об'єктів із зовнішніми ресурсами не має бути явних викликів методу close().
*/

public class Solution {
    public static void main(String[] args) {

        // Write code here:

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }


        // It was a condition:
//        try {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String line = reader.readLine();
//            System.out.println(line.toLowerCase());
//            reader.close();
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }
    }
}
