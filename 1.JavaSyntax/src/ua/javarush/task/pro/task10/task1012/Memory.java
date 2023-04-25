package ua.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментація пам'яті
Розгляньмо аналог пам'яті комп'ютера на прикладі масиву рядків. Якщо видалити деякі елементи, то в масиві з'являться
так звані "дірки" — елементи, рівні null. Метод executeDefragmentation(String[]), який отримує масив рядків, виконує
його "дефрагментацію", тобто переміщує всі об'єкти на початок масиву зі збереженням їх порядку, а всі "дірки"
(елементи, рівні null) пересуває в кінець масиву. У цій задачі тобі потрібно реалізувати метод
executeDefragmentation(String[]). Метод main() можна використовувати для перевірки результату роботи методу executeDefragmentation(String[]).


Requirements:
1. Клас Memory має містити метод public static void executeDefragmentation(String[]).
2. Реалізуй метод executeDefragmentation(String[]) згідно з умовою.
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишіть тут ваш код
        int nonNullIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (nonNullIndex != i) {
                    array[nonNullIndex] = array[i];
                    array[i] = null;
                }
                nonNullIndex++;
            }
        }
    }
}
