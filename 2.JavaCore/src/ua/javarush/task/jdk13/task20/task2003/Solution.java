package ua.javarush.task.jdk13.task20.task2003;

import java.io.*;

/* 
Як серіалізувати Singleton?
Два десеріалізованих об'єкти singleton та singleton1 мають різні посилання в пам'яті, а повинні мати однакові.
Синглтоном (Singleton) називають клас, у якого екземпляр створюється лише один раз. Трохи більше інформації про
синглтон можеш знайти в статті.
До класу Singleton додай приватний метод Object readResolve(), щоб після десеріалізації посилання на об'єкти були рівні.
Метод main не бере участі в тестуванні.

Requirements:
1. Клас Solution.Singleton має підтримувати інтерфейс Serializable.
2. У класі Solution.Singleton повинен бути реалізований метод readResolve без параметрів.
3. Метод readResolve повинен повертати синглтон (ourInstance).
4. Метод readResolve повинен бути приватним.
5. У класі Solution повинен бути публічний статичний метод serializeSingletonInstance.
6. Після десеріалізації посилання на об'єкти повинні бути рівні.
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();

        ByteArrayOutputStream byteArrayOutputStream = serializeSingletonInstance(instance);

        Singleton singleton = deserializeSingletonInstance(byteArrayOutputStream);
        Singleton singleton1 = deserializeSingletonInstance(byteArrayOutputStream);

        System.out.println("Перевірка ourInstance : " + singleton.getInstance());
        System.out.println("Перевірка ourInstance : " + singleton1.getInstance());
        System.out.println("=========================================================");
        System.out.println("Перевірка singleton : " + singleton);
        System.out.println("Перевірка singleton1 : " + singleton1);
    }

    public static ByteArrayOutputStream serializeSingletonInstance(Singleton instance) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
        oos.writeObject(instance);
        oos.close();

        return byteArrayOutputStream;
    }

    public static Singleton deserializeSingletonInstance(ByteArrayOutputStream byteArrayOutputStream) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
        Singleton singleton = (Singleton) ois.readObject();
        ois.close();

        return singleton;
    }

    public static class Singleton implements Serializable {
        private static Singleton ourInstance;

        public static Singleton getInstance() {
            if (ourInstance == null) {
                ourInstance = new Singleton();
            }
            return ourInstance;
        }

        private Singleton() {
        }

        // Add code here:
        private Object readResolve() {
            if (ourInstance == null) {
                ourInstance = new Singleton();
            }
            return ourInstance;
        }
    }
}
