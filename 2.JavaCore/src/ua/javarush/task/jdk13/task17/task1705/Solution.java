package ua.javarush.task.jdk13.task17.task1705;

import java.util.ArrayList;
import java.util.List;

/* 
Сад-город
1. Створи метод public void addFruit(int index, String fruit) - який додає параметр fruit до списку fruits на
позицію index.
2. Створи метод public void removeFruit(int index) - який видаляє з fruits елемент з індексом index.
3. Створи метод public void addVegetable(int index, String vegetable) - який додає параметр vegetable до списку
vegetables на позицію index.
4. Створи метод public void removeVegetable(int index) - який видаляє з vegetables елемент з індексом index.
5. Клас Garden буде використовуватися потоками. Тому зроби так, щоб усі методи блокували м'ютекс this.
6. Реалізуй це мінімальною кількістю коду.

Requirements:
1. Клас Garden повинен містити метод public void addFruit(int index, String fruit).
2. Клас Garden повинен містити метод public void removeFruit(int index).
3. Клас Garden повинен містити метод public void addVegetable(int index, String vegetable).
4. Клас Garden повинен містити метод public void removeVegetable(int index).
5. Метод addFruit(int index, String fruit) повинен додавати параметр fruit до списку fruits на позицію index.
6. Метод removeFruit(int index) повинен видаляти з fruits елемент з індексом index.
7. Метод addVegetable(int index, String vegetable) повинен додавати параметр vegetable до списку vegetables на позицію index.
8. Метод removeVegetable(int index) повинен видаляти з vegetables елемент з індексом index.
9. Усі методи класу Garden мають блокувати м'ютекс this (бути синхронізованими).
*/

public class Solution {


    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        // Write code here:
        public synchronized void addFruit(int index, String fruit) {
            fruits.add(index, fruit);
        }

        public synchronized void removeFruit(int index) {
            fruits.remove(index);
        }

        public synchronized void addVegetable(int index, String vegetable) {
            vegetables.add(index, vegetable);
        }

        public synchronized void removeVegetable(int index) {
            vegetables.remove(index);
        }
    }
}
