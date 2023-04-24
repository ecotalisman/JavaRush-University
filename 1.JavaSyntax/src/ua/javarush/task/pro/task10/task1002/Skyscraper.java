package ua.javarush.task.pro.task10.task1002;

/* 
Збудуймо новий житловий комплекс JavaRush Towers
Спробуймо побудувати житловий комплекс із трьох висоток. Для цього ми будемо використовувати три різні способи виведення інформації:
Оголошує про результат будівництва.
Оголошує про результат і вказує кількість поверхів.
Оголошує про результат і вказує забудовника.
Приклад виведення:
Хмарочос побудовано.
Хмарочос побудовано. Кількість поверхів - 50
Хмарочос побудовано. Забудовник - JavaRushDevelopment

Щоб виконати завдання, ти маєш оголосити три різні конструктори та в цих конструкторах виводити текст.
Метод main у тестуванні не використовується.


Requirements:
1. Клас Skyscraper має містити три публічні конструктори.
2. Клас Skyscraper має містити конструктор без параметрів.
3. Клас Skyscraper має містити конструктор з параметром типу int.
4. Клас Skyscraper має містити конструктор з параметром типу String.
5. У конструкторі без параметрів результат виведення має відповідати прикладу з умови.
6. У конструкторі з параметром типу int результат виведення має відповідати прикладу з умови.
7. У конструкторі з параметром типу String результат виведення має відповідати прикладу з умови.
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Хмарочос побудовано.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Хмарочос побудовано. Кількість поверхів - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Хмарочос побудовано. Забудовник - ";

    //напишіть тут ваш код


    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int floor) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floor);
    }

    public Skyscraper(String name) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + name);
    }



    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}

