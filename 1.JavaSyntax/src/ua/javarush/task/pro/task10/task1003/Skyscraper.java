package ua.javarush.task.pro.task10.task1003;

/* 
Збудуймо новий бізнес-комплекс JavaRush Business Center
Спробуймо побудувати бізнес-центр, який складається з двох будівель: одну з них тільки починаємо будувати, а друга
перебуває на етапі планування, тому про неї мало що відомо.
Тобі потрібно створити два конструктори: один з параметрами, другий — без. Обидва вони мають ініціалізувати поля
floorsCount і developer.


Requirements:
1. Клас Skyscraper має містити два публічні конструктори.
2. Клас Skyscraper має містити конструктор без параметрів.
3. Клас Skyscraper має містити конструктор з параметрами типу int і типу String.
4. Клас Skyscraper має містити приватне нестатичне поле типу int з іменем floorsCount.
5. Клас Skyscraper має містити приватне нестатичне поле типу String з іменем developer.
6. У конструкторі без параметрів потрібно ініціалізувати поля значеннями "5" і "JavaRushDevelopment".
7. У конструкторі з параметрами потрібно ініціалізувати поля аргументами цього конструктора.
*/

public class Skyscraper {
    private int floorsCount;
    private String developer;

    //напишіть тут ваш код

    public Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public Skyscraper() {
        this.floorsCount = 5;
        this.developer  = "JavaRushDevelopment";
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Невідомо");
    }
}
