package ua.javarush.task.jdk13.task41.task4112;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* 
Перекотиполе
Для симуляції боулінгу маємо такі класи:

- Bowling — це зал для гри в боулінг. Може здавати в оренду доріжки та взуття для боулінгу.
- Track — доріжка для боулінгу, яка має номер та вартість оренди.
- PairOfShoes — пара взуття, яку орендують гравці. Вона має розмір.
- Bowler — гравець у боулінг. У нього може бути орендована пара взуття.
- Team — команда гравців у боулінг. У команди є назва, безліч членів команди, боулінг-зал, в якому команда збирається грати,
та доріжка, на якій команда збирається грати.

Зараз під час запиту доріжки та взуття у класу Bowling він просто створює та повертає нові об'єкти Track та PairOfShoes.
Тобі потрібно змінити цей функціонал за допомогою об'єктних пулів:

1. До класу Bowling додай два приватні фінальні поля Queue<Track> tracks та Queue<PairOfShoes> shoesShelf.
2. У наявному конструкторі Bowling заповни поля tracks та shoesShelf об'єктами:

- в чергу tracks додай tracksNumber об'єктів з номерами від 1 до tracksNumber
- в чергу shoesShelf додай 50 пар взуття з розміром від 38 до 45

Поле price поки що можна не чіпати.

3. Зміни код методу acquireTrack. Він повинен отримувати та видаляти доріжку з голови черги tracks.
Отриманій доріжці потрібно встановити ціну, вираховану за формулою 100 - tracks.size() * 10 і повернути цю доріжку .
Якщо черга виявилася порожньою — повернути null.

4. У методі releaseTrack до наявного коду додай повернення доріжки в чергу.

5. Зміни код методу acquireShoes. Він повинен отримувати та видаляти з голови черги number пар взуття та повертати їх у
вигляді множини. Якщо в черзі було менше ніж number елементів, не потрібно нічого з неї видаляти: потрібно просто повернути null.

6. У методі releaseShoes до наявного коду додай повернення взуття в чергу.

Requirements:
1. Зміни мають бути внесені лише до класу Bowling.
2. У класі Bowling повинні бути поля tracks та shoesShelf відповідно до умови.
3. Конструктор із параметром int класу Bowling повинен заповнювати черги згідно з умовою.
4. Метод acquireTrack має бути реалізований відповідно до умови.
5. Метод releaseTrack повинен повертати отримані доріжки до черги.
6. Метод acquireShoes повинен бути реалізований відповідно до умови.
7. Спосіб releaseShoes повинен повертати отримане взуття в чергу.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Bowling bowling = new Bowling(9);
        Set<Team> teams = new HashSet<>();
        teams.add(new Team("Шершні", bowling));
        teams.add(new Team("Страйкмобіль", bowling));
        teams.add(new Team("Перекотиполе", bowling));
        teams.add(new Team("Дівчата не шарять", bowling));
        teams.add(new Team("Гранітні кулі", bowling));
        teams.add(new Team("Balls of Thunder", bowling));
        teams.add(new Team("Ми намагаємося", bowling));
        teams.add(new Team("Dolls With Balls", bowling));
        teams.add(new Team("Заткнися та котися", bowling));
        teams.add(new Team("Хлопці та хлопці", bowling));
        teams.add(new Team("Алко Раш", bowling));
        teams.add(new Team("Всунь! Кинь! Збий!", bowling));
        teams.add(new Team("Накотя викоти", bowling));

        ExecutorService executor = Executors.newCachedThreadPool();
        List<Future<Integer>> futures = executor.invokeAll(teams);
        executor.awaitTermination(5, TimeUnit.SECONDS);
        int sum = 0;
        for (Future<Integer> future : futures) {
            sum += future.get();
        }
        System.out.println("Боулінг заробив $" + sum);

        executor.shutdown();
    }
}
