package ua.javarush.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Collections;

/* 
Вивчаємо методи класу Collections, частина 3
У класі Solution оголошено методи: min(ArrayList<Integer>), max(ArrayList<Integer>), frequency(ArrayList<Integer>, Integer),
binarySearch(ArrayList<Integer>, Integer). Ти маєш розібратися, що саме роблять ці методи, і переписати їхній код,
використовуючи тільки відповідні методи класу Collections.


Requirements:
1. Клас Solution має містити публічний статичний метод min(ArrayList<Integer>), який повертає значення Integer.
2. Клас Solution має містити публічний статичний метод max(ArrayList<Integer>), який повертає значення Integer.
3. Клас Solution має містити публічний статичний метод frequency(ArrayList<Integer>, Integer), який повертає значення
типу int.
4. Клас Solution має містити публічний статичний метод binarySearch(ArrayList<Integer>, Integer), який повертає
значення типу int.
5. Метод min(ArrayList<Integer>) потрібно переписати, використовуючи метод min класу Collections.
6. Метод max(ArrayList<Integer>) потрібно переписати, використовуючи метод max класу Collections.
7. Метод frequency(ArrayList<Integer>, Integer) потрібно переписати, використовуючи метод frequency класу Collections.
8. Метод binarySearch(ArrayList<Integer>, Integer) потрібно переписати, використовуючи метод binarySearch класу Collections.
*/

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
        // It was a condition:
//        Integer minimum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) < minimum) {
//                minimum = list.get(i);
//            }
//        }
//        return minimum;

        return Collections.min(list);
    }

    public static Integer max(ArrayList<Integer> list) {
        // It was a condition:
//        Integer maximum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) > maximum) {
//                maximum = list.get(i);
//            }
//        }
//        return maximum;

        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        // It was a condition:
//        int frequency = 0;
//        if (element == null) {
//            return frequency;
//        } else {
//            for (Integer integer : list) {
//                if (element.equals(integer)) {
//                    frequency++;
//                }
//            }
//        }
//        return frequency;

        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        // It was a condition:
//        int low = 0;
//        int high = list.size() - 1;
//        int mid = (low + high) / 2;
//        int index = -1;
//        while (low <= high) {
//            if (list.get(mid) < key) {
//                low = mid + 1;
//            } else if (list.get(mid).equals(key)) {
//                index = mid;
//                break;
//            } else {
//                high = mid - 1;
//            }
//            mid = (low + high) / 2;
//        }
//        return index;

        Collections.sort(list);     // Перед викликом методу binarySearch() колекцію слід відсортувати (Collections.sort())
        return Collections.binarySearch(list, key);
    }
}
