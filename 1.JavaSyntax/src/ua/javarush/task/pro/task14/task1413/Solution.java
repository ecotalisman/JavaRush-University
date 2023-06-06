package ua.javarush.task.pro.task14.task1413;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Коктейль
Якщо запустити програму, вона закінчується винятком. Однак із тексту винятку в консолі незрозуміло, де він виник. У цій задачі тобі потрібно:

обгорнути блоками try-catch код методів addIce, addVodka, addJuice і addOrange;
у блоках catch викликати метод printBugMethodName і передати в нього stack trace.
Якщо зробиш все правильно, під час запуску програми на екран буде виведено імена методів, в яких виникає виняток.

Requirements:
1. Потрібно обгорнути блоками try-catch код методів addIce, addVodka, addJuice і addOrange.
2. У методах addIce, addVodka, addJuice і addOrange у блоках catch потрібно розмістити одну команду — виклик методу printBugMethodName.
3. Під час кожного виклику методу printBugMethodName потрібно передавати в нього поточний stack trace.
*/

public class Solution {

    public static void main(String[] args) {
        Map<String, Integer> screwdriverIngredients = makeScrewdriver();
        String screwdriver = screwdriverIngredients.keySet().stream()
                .map(key -> key + "=" + screwdriverIngredients.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(screwdriver);
    }

    static Map<String, Integer> makeScrewdriver() {
        Map<String, Integer> ingredients = new TreeMap<>();
        addIce(ingredients);
        addVodka(ingredients);
        addJuice(ingredients);
        addOrange(ingredients);
        return ingredients;
    }

    static void addIce(Map<String, Integer> ingredients) {
        // It was a condition:
//        ingredients.put("ice cubes", 7);

        // Write code here:
        try {
            ingredients.put("ice cubes", 7);
        } catch (Exception e) {
//            printBugMethodName(e.getStackTrace());
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    static void addVodka(Map<String, Integer> ingredients) {
        // It was a condition:
//        ingredients.put("vodka", 50);

        // Write code here:
        try {
            ingredients.put("vodka", 50);
        } catch (Exception e) {
//            printBugMethodName(e.getStackTrace());
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    static void addJuice(Map<String, Integer> ingredients) {
        // It was a condition:
//        ingredients.put(null, 100);

        // Write code here:
        try {
            ingredients.put(null, 100);
        } catch (Exception e) {
//            printBugMethodName(e.getStackTrace());
            printBugMethodName(Thread.currentThread().getStackTrace());
        }

    }

    static void addOrange(Map<String, Integer> ingredients) {
        // It was a condition:
//        ingredients.put("orange slice", 1);

        // Write code here:
        try {
            ingredients.put("orange slice", 1);
        } catch (Exception e) {
//            printBugMethodName(e.getStackTrace());
            printBugMethodName(Thread.currentThread().getStackTrace());
        }
    }

    public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
        StackTraceElement stackTraceElement = stackTraceElements[1];
        System.out.println(stackTraceElement.getMethodName());
    }
}


/*

Ми обгорнули код методів addIce, addVodka, addJuice, addOrange в блоки try-catch і в catch викликали метод
printBugMethodName, передаючи в нього поточний stack trace.

Також важливо зазначити, що ми використовуємо StackTraceElement[1] для виведення імені методу, що викликав помилку.
Це правильно, оскільки StackTraceElement[0] буде відноситись до самого методу printBugMethodName.

Таким чином, при виконанні цього коду, якщо в одному з методів додавання інгредієнтів виникне виняток NullPointerException,
в консоль виведеться ім'я методу, в якому це сталося.

***************************************************************************************************************************

1) printBugMethodName(e.getStackTrace());

вивід в console:
put
{ice cubes=7, orange slice=1, vodka=50}

2) printBugMethodName(Thread.currentThread().getStackTrace());

вивід в console:
addJuice
{ice cubes=7, orange slice=1, vodka=50}

Вибір між e.getStackTrace() і Thread.currentThread().getStackTrace() залежить від нашої мети:

1) Якщо ми хочемо дізнатись, де виняток був створений і викинутий, використовуємо e.getStackTrace(). Воно надає вам точне
місце, де виняток виник. У нашому прикладі, це показує, що виняток виник у методі 'put'.

2) Якщо ми хочемо дізнатись, де викликали метод, який оброблює виняток (в даному випадку, метод printBugMethodName),
використовуємо Thread.currentThread().getStackTrace(). У нашому прикладі, це показує, що виняток було оброблено у методі 'addJuice'.

Таким чином, вибір між двома залежить від того, яка інформація нам потрібна для відлагодження програми.

*/