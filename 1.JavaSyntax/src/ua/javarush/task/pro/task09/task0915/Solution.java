package ua.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
За допомогою StringTokenizer розділи query на частини за роздільником delimiter.

Приклад:
getTokens("com.javarush.task.pro.task09.task0915", "\\.")
повертає масив рядків
{"com", "javarush", "task", "pro", "task09", "task0915"}

Hint: виришити задачу допоможе метод countTokens().


Requirements:
1. Метод getTokens(String, String) має використовувати клас StringTokenizer.
2. Метод getTokens(String, String) має повертати масив типу String, заповнений згідно з умовою задачі.
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишіть тут ваш код
        StringTokenizer stringTokenizer = new StringTokenizer(query,delimiter);
        String[] arr = new String[stringTokenizer.countTokens()];

        for (int i = 0; i < arr.length; i++) {
            String token = stringTokenizer.nextToken();
            arr[i] = token;
        }
//        int index = 0;
//        while (stringTokenizer.hasMoreTokens()) {
//            String token = stringTokenizer.nextToken();
//            arr[index++] = token;
//        }
        return arr;
    }
}

/*

Метод countTokens() у класі StringTokenizer повертає кількість токенів, що залишились у рядку для вилучення.
Він розраховує кількість токенів на основі заданого роздільника без фактичного розділення рядка. Цей метод корисний
для створення масиву потрібного розміру перед заповненням його токенами.

Метод length() не застосовується у цьому випадку, оскільки він є методом класу String і використовується для отримання
довжини рядка, а не кількості токенів. Для роботи з StringTokenizer, вам потрібно використовувати метод countTokens()
для отримання кількості токенів у рядку.


*/