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

/*
1) InputStream.read():
Коли цей метод повертає значення, він повертає int. Однак, він зчитує лише один байт даних. int
у Java має розмір 4 байти, тому коли ми читаємо лише один байт, три інші байти (старші байти) фактично не використовуються,
а значення зчитаного байта знаходиться в молодшому байті int.

2) OutputStream.write(int b):
Цей метод приймає int як вхідний параметр, але він записує лише один байт в потік. Тому молодший
байт int записується в потік, а старші три байта ігноруються (відкидаються).

3) Writer.write(int b):
Цей метод записує один символ в потік, враховуючи лише молодші два байти int (тому що char в
Java має розмір 2 байти). Старші два байта ігноруються.

4) Reader.read():
Цей метод читає один символ з потоку і повертає його як int. Це розширення символу до int означає, що
старші два байта int завжди будуть 0, тому що символ в Java має розмір 2 байти.

Отже, коли говорять про відкидання байтів або нульових байтів, це просто означає, що вони не використовуються у контексті цієї операції.
*/
