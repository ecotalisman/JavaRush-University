package ua.javarush.task.pro.task10.task1001;

/* 
Створімо хмарочос
Спробуймо спорудити свій перший хмарочос і оголосити про результат виконання в консолі. Для цього тобі потрібно
викликати конструктор класу Skyscraper в методі main і в тілі конструктора вивести в консоль текст "Хмарочос побудовано.".


Requirements:
1. Клас Skyscraper має містити публічний конструктор без параметрів.
2. У методі main тобі потрібно створити один об'єкт класу Skyscraper.
3. У конструкторі класу Skyscraper має виводитися в консоль текст "Хмарочос побудовано."
*/

public class Skyscraper {

    //напишіть тут ваш код
    public Skyscraper() {
        System.out.println("Хмарочос побудовано.");
    }

    public static void main(String[] args) {
        //напишіть тут ваш код
        Skyscraper sky = new Skyscraper();
    }
}
