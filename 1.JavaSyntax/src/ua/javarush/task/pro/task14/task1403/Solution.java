package ua.javarush.task.pro.task14.task1403;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Помічник викладача-2
Програма зчитує з консолі номер, знаходить у журналі відповідного студента й викликає його (її) до дошки.
І навіть обробляє некоректні числа.
Але є ще одна проблема: якщо введено неціле число, метод parseInt генерує виняток NumberFormatException.
Обгорни частину коду конструкцією try-catch так, щоб програма продовжувала роботу, навіть якщо було введено неціле
число. І якщо введено не ціле число, виведи в консоль повідомлення: "Потрібно ввести ціле число" та виконай continue;
для коректної роботи циклу.

Requirements:
1. Програма має продовжити роботу, навіть якщо було введено неціле число.
2. Програма має виводити повідомлення: "Потрібно ввести ціле число" кожного разу, коли введено неціле число.
*/

public class Solution {

    public static final String PROMPT_STRING = "Введіть номер студента, або exit щоб вийти: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Відповідає ";
    public static final String NOT_EXIST = "Студента з таким номером не існує";
    public static final String INTEGER_REQUIRED = "Потрібно ввести ціле число";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур М'ясний"
            , "Пенелопа Сиволап"
            , "Орест Злобін"
            , "Ірида Продуваленко"
            , "Гектор Гадюкін"
            , "Електра Чемоданко"
            , "Гвідон Недумко"
            , "Роксана Борисенко"
            , "Юліан Мумбриченко"
            , "Зігфрід Горемикін");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }
            // It was a condition:
//            int studentId;
//            studentId = Integer.parseInt(input);
//
//            try {
//                System.out.println(ANSWERING + studentsJournal.get(studentId));
//            } catch (Exception e) {
//                System.out.println(NOT_EXIST);
//            }

            // write code here:
            int studentId;

            try {
                studentId = Integer.parseInt(input);
                try {
                    System.out.println(ANSWERING + studentsJournal.get(studentId));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(NOT_EXIST);
                }
            } catch (NumberFormatException e) {
                System.out.println(INTEGER_REQUIRED);
            }
        }
    }
}
