package ua.javarush.task.pro.task14.task1402;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Помічник викладача
Програма зчитує з консолі номер, знаходить у журналі відповідного студента й викликає його (її) до дошки.
Але є проблема: якщо в журналі немає студента з потрібним номером, програма завершується генеруванням винятку
ArrayIndexOutOfBoundsException. Обгорни один рядок конструкцією try-catch, щоб програма продовжувала роботу.
У блоці catch виведи в консоль повідомлення "Студента з таким номером не існує".


Requirements:
1. Один рядок має бути обгорнуто конструкцією try-catch.
2. Програма має продовжити роботу, якщо було введено неіснуючий номер.
3. Програма має виводити повідомлення "Студента з таким номером не існує" кожного разу, коли введено неіснуючий номер.
*/

public class Solution {

    public static final String PROMPT_STRING = "Введіть номер студента, або exit щоб вийти: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Відповідає ";
    public static final String NOT_EXIST = "Студента з таким номером не існує";

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
//            int studentId = Integer.parseInt(input);
//            System.out.println(ANSWERING + studentsJournal.get(studentId));

            // write code here:
            int studentId = Integer.parseInt(input);
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (Exception e) {
                System.out.println(NOT_EXIST);
            }

        }
    }
}
