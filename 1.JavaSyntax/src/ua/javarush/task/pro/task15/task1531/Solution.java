package ua.javarush.task.pro.task15.task1531;

import java.io.*;
import java.util.Base64;

/* 
Закрити не можна залишити
Спробуй запустити програму. Як бачиш, метод fromString працює нормально, якщо передати у нього валідний рядок. Але якщо
передати у нього порожній рядок, то виникає виняток, і у об’єкта MyStream не відпрацьовує метод close.

Внеси виправлення у метод fromString так, щоб у об’єкта MyStream викликався метод close, навіть якщо у fromString був
переданий порожній рядок.

Requirements:
1. Функціонал методу fromString не повинен змінитися, якщо в нього передано валідний рядок.
2. Метод fromString повинен прокидати далі винятки, що виникають (не перехоплювати).
3. Метод fromString повинен викликати метод close у об'єкта MyStream, якщо у fromString був переданий порожній рядок.
*/

public class Solution {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            String string = toString(new MyClass("З'їж ще цих м'яких французьких булочок."));
            System.out.printf("Об'єкт у вигляді рядка: %s\n", string);

            MyClass myClass = (MyClass) fromString(string);
            System.out.println("Відновлений об'єкт: " + myClass);

            System.out.println();
            fromString("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String toString(Serializable o) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(o);
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        }
    }

    public static Object fromString(String s) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(s);
        MyStream ms = new MyStream(data);
        try (ObjectInputStream ois = new ObjectInputStream(ms)) {
            Object o = ois.readObject();
            return o;
        }
        // add code here following condition:
        finally {
            ms.close();
        }
    }
}
