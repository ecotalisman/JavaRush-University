package ua.javarush.task.jdk13.task43.task4305;

/* 
Повернутися до джерел

Ти ще пам'ятаєш, з чого починалося вивчення Java? Правильно, з "Hello World!". Ні, виводити на екран ми це знову
не будемо: на нас чекає дещо інше.

Твоє завдання полягає в тому, щоб у результаті роботи програми на екрані виводився рядок "The result is: true".

Для цього тобі потрібно:

У методі helloWorldChecker створити перевірку методу рядка, що передається, за допомогою статичного методу containsOnly класу StringUtils.
Метод containsOnly повинен перевіряти, що в рядку, який передається, використовуються лише ті символи, які є у фразі "Hello World!" (включно з пробілом).
Результатом запуску програми та введення рядка "Hello World!"; у консолі має бути рядок "The result is: true".
P.S. Для вирішення цього завдання бажано використовувати бібліотеку apache commons lang3 версії 3.9.

Requirements:
1. Не змінюй метод main.
2. Клас Solution повинен містити публічний статичний метод helloWorldChecker, який повертає boolean.
3. Не використовуй повну фразу "Hello World!" для перевірки символів за допомогою методу containsOnly.
4. В результаті роботи програми в консолі має з'явитися рядок "The result is: true.".
*/

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        boolean result = helloWorldChecker(choice);
        System.out.println("The result is: " + result);
    }

    public static boolean helloWorldChecker(String s) {
        //напишіть тут ваш код
        String validCharacters = "Helo Wrd!";
        return StringUtils.containsOnly(s, validCharacters);
    }
}
