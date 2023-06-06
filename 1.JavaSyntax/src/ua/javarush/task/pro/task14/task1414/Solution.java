package ua.javarush.task.pro.task14.task1414;

/* 
Готуємо коктейлі
Метод printStackTrace отримує як параметр масив stackTrace. Потрібно вивести інформацію про кожен елемент масиву в такому форматі:
"Метод <<>ім'я методу<>> викликано з рядка <<>номер рядка<>> класу <<>ім'я класу<>> у файлі <<>ім'я файлу<>>."
Інформацію про кожен елемент виводь з нового рядка.

Приклад:
Метод addJuice викликано з рядка 24 класу com.javarush.task.pro.task14.task1414.Solution у файлі Solution.java.

Requirements:
1. Метод printStackTrace має виводити інформацію про кожен елемент масиву stackTrace.
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s викликано з рядка %d класу %s у файлі %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        //напишіть тут ваш код
        for (StackTraceElement element : stackTrace) {
            System.out.printf(OUTPUT_FORMAT, element.getMethodName(), element.getLineNumber(), element.getClassName(),
                    element.getFileName());
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
