package ua.javarush.task.jdk13.task20.task2005;

import java.io.Serializable;

/* 
Як серіалізувати щось своє?
Зробіть так, щоб серіалізація класу Object була можливою.
Підказка: для серіалізації об'єкту потрібно, щоб усі його поля підтримували серіалізацію.
Для багатьох класів з JRE це вже зроблено. Але якщо клас написаний тобою, потрібно цю властивість додати вручну.

Requirements:
1. Клас Object має існувати всередині класу Solution.
2. Клас Solution.Object повинен бути статичним.
3. Клас Solution.Object повинен бути публічним.
4. Клас Solution.Object повинен підтримувати інтерфейс Serializable.
5. Клас Solution.String повинен підтримувати інтерфейс Serializable.
*/

public class Solution {
    public static int stringCount;

    public static void main(String[] args) {

    }

    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }
}
