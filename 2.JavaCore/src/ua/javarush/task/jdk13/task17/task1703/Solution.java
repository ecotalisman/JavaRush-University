package ua.javarush.task.jdk13.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронізовані нотатки
1. Клас Note буде використовуватися потоками. Тому зроби так, щоб звернення до списку notes блокували м'ютекс notes, не this
2. Усі System.out.println не повинні бути заблоковані (синхронізовані), тобто не повинні знаходитися в блоці synchronized

Requirements:
1. Метод addNote() повинен додавати нотатки до списку notes.
2. Метод removeNote() має видаляти нотатку зі списку notes.
3. У методі addNote() повинен знаходитися synchronized блок.
4. У методі removeNote() повинен знаходитися synchronized блок.
5. Synchronized блок у методі addNote() повинен блокувати м'ютекс notes.
6. Synchronized блок у методі removeNote() повинен блокувати м'ютекс notes.
7. У synchronized блоці методу addNote() повинен знаходитися виклик методу add до notes.
8. У synchronized блоці методу removeNote() повинен знаходитися виклик методу remove до notes.
9. Усі команди виведення на екран не повинні знаходитися в блоці synchronized.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Зараз буде додано нотатку [" + note + "] На позицію " + index);
            synchronized (notes) {
                notes.add(index, note);
            }
            System.out.println("Вже додано нотатку [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Зараз буде видалено нотатку з позиції " + index);
            String note;
            synchronized (notes) {
                note = notes.remove(index);
            }
            System.out.println("Вже видалено нотатку [" + note + "] з позиції " + index);
        }
    }

}
