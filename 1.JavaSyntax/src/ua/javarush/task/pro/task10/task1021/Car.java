package ua.javarush.task.pro.task10.task1021;

/* 
Автовиробник
Створімо каталог нових моделей автомобілів на нашому підприємстві. Для цього нам потрібно створити один
метод initialize, який ініціалізуватиме такі поля об'єкта типу Car: модель, рік випуску, колір.


Requirements:
1. Клас Car має містити приватне поле model типу String.
2. Клас Car має містити приватне поле year типу int.
3. Клас Car має містити приватне поле color типу String.
4. У класі Car не потрібно оголошувати конструктори.
5. Клас Car має містити нестатичний метод public void initialize із параметрами типу String, int, String.
6. Ініціалізація полів model, year, color має відбуватися в методі initialize(String model, int year, String color).
*/

public class Car {
    private String model;
    private int year;
    private String color;

    //напишіть тут ваш код
    public void initialize(String model, int year, String color) {
        this.model =model;
        this.year = year;
        this.color = color;
    }

}
