package ua.javarush.task.jdk13.task41.task4120;

import ua.javarush.task.jdk13.task41.task4120.games.Catan;
import ua.javarush.task.jdk13.task41.task4120.games.DiceForge;
import ua.javarush.task.jdk13.task41.task4120.games.WelcomeTo;

/* 
Гра як життя
У пакеті games є три класи настільних ігор. Тобі треба привести їх до єдиного інтерфейсу, але не просто так, а
за допомогою патерну Шаблонний метод.

У методах start всіх ігор можеш побачити схожу послідовність: спочатку відбувається ініціалізація гри, потім сама гра,
потім закінчення гри, а в кінці — оголошення переможця.

У пакеті games створи абстрактний базовий клас BoardGame:

1. Створи в ньому приватне поле playersAmount типу int та сеттер для цього поля.

2. Створи в BoardGame чотири методи для кожного з етапів гри: initialize, play, end та printWinner.
Усі чотири методи зроби protected та void. Перші три методи зроби абстрактними, щоб кожний спадкоємець був зобов'язаний
реалізувати їх по-своєму.
А методом printWinner зроби реалізацію за замовчуванням, оскільки він буде однаковий для всіх трьох ігор, але його все
ще можна буде перевизначити за потребою.

3. Створи в BoardGame шаблонний метод start з одним параметром типу int. Зроби метод фінальним і виклич у ньому по черзі
setPlayersAmount, initialize, play, end та printWinner.

Успадкуй класи ігор від BoardGame та реалізуй у них методи initialize, play, end.
Видали з класів ігор поля playersAmount та методи start (їхній код вже розподілено по інших місцях).


Requirements:
1. Клас Solution не повинен змінюватись.
2. У пакеті games повинен існувати клас BoardGame, реалізований згідно з умовою.
3. Клас Catan має бути змінено відповідно до умови.
4. Клас DiceForge має бути змінено відповідно до умови.
5. Клас WelcomeTo має бути змінено відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) {
        new Catan().start(4);
        new DiceForge().start(2);
        new WelcomeTo().start(10);
    }
}
