package ua.javarush.task.pro.task12.task1213;

import java.util.ArrayList;

/* 
Сонячна система
У 3020 році вчені навчилися створювати нові планети, одну з яких відправили в Сонячну систему.
Орбіта цієї планети пролягає між орбітами Землі та Марса.
Реалізуй метод createNewPlanet(String), який має додавати передану планету в список planets одразу за Землею.
Подивись, як змінилася послідовність планет.
Методи main(), addPlanets() і print() у перевірці не використовуються.


Requirements:
1. Метод createNewPlanet(String) має додавати передану планету в список planets на наступну позицію після Землі.
*/

public class Solution {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Зоря Смерті");
        print();
    }

    public static void createNewPlanet(String planetName) {
        //напишіть тут ваш код
        if (planets.contains("Земля")) {
            planets.add(planets.indexOf("Земля") + 1, planetName);
        }
    }

    public static void addPlanets() {
        planets.add("Меркурій");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпітер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s — %d-а (-я) планета від Сонця", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}

/*

public static void createNewPlanet(String planetName) {
        //напишіть тут ваш код
        if (planets.equals("Земля")) {
            planets.add(planets.indexOf("Земля") + 1, planetName);
        }
    }

У методі createNewPlanet(String planetName) використовується equals() для порівняння списку planets
з рядком "Земля". Однак equals() призначений для порівняння об'єктів одного типу, тому в даному випадку воно
некоректно використовується.

Умова if (planets.equals("Земля")) завжди повертатиме false, оскільки planets є об'єктом типу ArrayList<String>, а
"Земля" є об'єктом типу String. В результаті цього метод createNewPlanet() не додасть планету до списку, навіть
якщо список planets містить "Земля".

В попередньому методі createNewPlanet(String planetName) виконується порівняння об'єктів неправильно. В умові
if (planets.equals("Земля")) порівнюються два об'єкти різних типів: список planets (тип ArrayList<String>) і
рядок "Земля" (тип String).

Метод equals() призначений для порівняння об'єктів одного типу, а не різних типів. Тому це порівняння завжди
повертатиме false, оскільки planets і "Земля" мають різні типи. В результаті умова в if-блоку ніколи не виконається,
і планета не буде додана до списку.

Для вирішення цієї проблеми, потрібно замінити некоректне порівняння на правильне:

public static void createNewPlanet(String planetName) {
    int earthIndex = planets.indexOf("Земля");
    if (earthIndex != -1) {
        planets.add(earthIndex + 1, planetName);
    }
}

Цей варіант методу createNewPlanet() знаходить індекс "Земля" у списку planets за допомогою методу indexOf(). Якщо
"Земля" знайдена у списку (тобто індекс не дорівнює -1), нова планета додається до списку одразу за "Землею".

Метод indexOf() в класі ArrayList використовується для пошуку першого входження об'єкта в списку. Якщо об'єкт знайдено,
метод повертає індекс першого входження цього об'єкта в списку. Індекси в списку починаються з 0.

Однак, якщо об'єкт не знайдений у списку, метод indexOf() повертає -1. Значення -1 використовується, оскільки воно не
може бути дійсним індексом в списку (дійсні індекси починаються з 0). Таким чином, коли метод повертає -1, це означає,
що об'єкт відсутній в списку.

У нашому випадку, якщо "Земля" не буде знайдена в списку, earthIndex буде дорівнювати -1, що означає відсутність "Землі"
в списку planets. У такому випадку, код у if-блокі не буде виконано, і планета не буде додана до списку.

*/
