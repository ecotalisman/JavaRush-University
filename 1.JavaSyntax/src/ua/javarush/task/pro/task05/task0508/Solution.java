package ua.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Видаляємо однакові рядки
У цій задачі тобі потрібно:

Зчитати 6 рядків і заповнити ними масив strings.
Видалити повторювані рядки з масиву strings, замінивши їх на null (null не повинен бути рядком "null").
Приклади.

Масив після зчитування рядків:
{"Hello", "Hello", "World", "Java", "Tasks", "World"}
Масив після видалення повторюваних рядків:
{null, null, null, "Java", "Tasks", null}


Requirements:
1. У методі main(String[]) зчитай з клавіатури 6 рядків і заповни ними масив strings.
2. У методі main(String[]) видали (заміни рядок на null) елементи масиву strings, які містять однакові рядки.
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String dublicat = strings[i];
            int j = i + 1;
            boolean hasDuplicate = false;
            while (j < strings.length) {
                if (dublicat != null && dublicat.equals(strings[j])) {
                    strings[j] = null;
                    hasDuplicate = true;
                }
                j++;
            }
            if (hasDuplicate) {
                strings[i] = null;
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
