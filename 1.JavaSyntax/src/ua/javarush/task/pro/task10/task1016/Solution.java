package ua.javarush.task.pro.task10.task1016;

/* 
Прогноз погоди
Клас City має два поля — назва міста й поточна температура повітря. Крім того, клас Solution містить метод showWeather,
який виводить у консоль інформацію про погоду в місті, переданому як аргумент методу. Реалізуй метод showWeather,
який має виводити в консоль інформацію в такому форматі: У місті "назва міста" сьогодні температура повітря "температура в місті"

У методі main слід один раз викликати метод showWeather з потрібним аргументом.

Приклад виведення:
У місті Дубай сьогодні температура повітря 40


Requirements:
1. Не змінюй клас City.
2. Клас Solution має містити метод showWeather з параметром City.
3. Метод showWeather має використовувати гетери класу City.
4. Метод showWeather має виводити текст у консоль відповідно до умови.
*/

public class Solution {

    public static void showWeather(City city) {
        //напишіть тут ваш код
        System.out.println("У місті " + city.getName() + " сьогодні температура повітря " + city.getTemperature());
    }

    public static void main(String[] args) {
        //напишіть тут ваш код
        City dubai = new City("Dubai", 40);
        showWeather(dubai);
    }
}
