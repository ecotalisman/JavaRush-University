package ua.javarush.task.pro.task13.task1307;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/* 
Вивчаємо методи класу Collections, частина 2
У класі Solution оголошено методи: reverse(ArrayList<Integer>), sort(ArrayList<Integer>), rotate(ArrayList<Integer>, int),
shuffle(ArrayList<Integer>). Ти маєш розібратися, що саме роблять ці методи, і переписати їхній код, використовуючи тільки
відповідні методи класу Collections.


Requirements:
1. Клас Solution має містити публічний статичний метод reverse(ArrayList<Integer>), який не повертає жодного
значення (тип void).
2. Клас Solution має містити публічний статичний метод sort(ArrayList<Integer>), який не повертає жодного
значення (тип void).
3. Клас Solution має містити публічний статичний метод rotate(ArrayList<Integer>, int), який не повертає жодного
значення (тип void).
4. Клас Solution має містити публічний статичний метод shuffle(ArrayList<Integer>), який не повертає жодного
значення (тип void).
5. Метод reverse(ArrayList<Integer>) потрібно переписати, використовуючи метод reverse класу Collections.
6. Метод sort(ArrayList<Integer>) потрібно переписати, використовуючи метод sort класу Collections.
7. Метод rotate(ArrayList<Integer>, int) потрібно переписати, використовуючи метод rotate класу Collections.
8. Метод shuffle(ArrayList<Integer>) потрібно переписати, використовуючи метод shuffle класу Collections.
*/

public class Solution {

    public static void reverse(ArrayList<Integer> list) {
        // It was a condition:
//        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++) {
//            Integer integer = list.get(i);
//            list.set(i, list.get(j - i));
//            list.set(j - i, integer);
//        }

        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        // It was a condition:
//        int n = list.size();
//        int temp;
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < (n - i); j++) {
//                if (list.get(j - 1) > list.get(j)) {
//                    temp = list.get(j - 1);
//                    list.set(j - 1, list.get(j));
//                    list.set(j, temp);
//                }
//            }
//        }

        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        // It was a condition:
//        for (int i = 0; i < distance; i++) {
//            list.add(0, list.get(list.size() - 1));
//            list.remove(list.size() - 1);
//        }

        Collections.rotate(list, distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        // It was a condition:
//        Random rand = new Random();
//        for (int i = 0; i < list.size(); i++) {
//            int randomIndexToSwap = rand.nextInt(list.size());
//            int temp = list.get(randomIndexToSwap);
//            list.set(randomIndexToSwap, list.get(i));
//            list.set(i, temp);
//        }

        Collections.shuffle(list);
    }
}
