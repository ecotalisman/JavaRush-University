package ua.javarush.task.pro.task15.task1532;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* 
Шифр
Зашифруй повідомлення — перепиши із String змінної (параметра методу encrypt) байти в ByteArrayOutputStreamutputStream
за певним правилом:

перший, останній, другий, передостанній, третій, ....

Requirements:
1. Метод encrypt повинен повертати потік, що містить усі байти, з рядка message.
2. У поверненому потоці байти мають бути перемішані відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {
        //напишіть тут ваш код

        try (ByteArrayOutputStream stream = new ByteArrayOutputStream()) {
            byte[] bytes = message.getBytes();
            for (int i = 0; i < bytes.length / 2; i++) {
                // index First byte: i
                // index Last byte: bytes.length - 1 - i
                stream.write(bytes[i]);
                stream.write(bytes[bytes.length - 1 - i]);
            }
            if (bytes.length % 2 != 0) {
                stream.write(bytes[bytes.length / 2]);
            }

            return stream;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*

Ситуація, коли у нас непарна кількість байтів, після циклу додано код, який перевіряє,
чи є у вас непарна кількість байтів, і якщо так, додає середній байт:

if (bytes.length % 2 != 0) {
    stream.write(bytes[bytes.length / 2]);
}

*/
