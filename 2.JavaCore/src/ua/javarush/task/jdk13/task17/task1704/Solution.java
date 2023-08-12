package ua.javarush.task.jdk13.task17.task1704;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронізовані нотатки 2
Клас Note буде використовуватися потоками. Тому зроби так, щоб усі методи були синхронізовані.

Requirements:
1. Метод addNote() має додавати нотатки до списку notes.
2. Метод removeNote() повинен видаляти нотатку зі списку notes.
3. Метод addNote() повинен бути синхронізований.
4. Метод removeNote() повинен бути синхронізований.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public synchronized void addNote(int index, String note) {
            System.out.println("Зараз буде додано нотатку [" + note + "] На позицію " + index);
            notes.add(index, note);
            System.out.println("Вже додано нотатку [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("Зараз буде видалено нотатку з позиції " + index);
            String note = notes.remove(index);
            System.out.println("Вже видалено нотатку [" + note + "] з позиції " + index);
        }
    }
}
