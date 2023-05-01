package ua.javarush.task.pro.task12.task1206;

/* 
Аналіз рядків
Реалізуй методи countDigits(String), countLetters(String), countSpaces(String), які мають повертати кількість цифр, літер і пробілів у рядку.
Метод main у перевірці не використовується.


Requirements:
1. Метод countDigits(String) має повертати кількість цифр у переданому рядку.
2. Метод countLetters(String) має повертати кількість літер у переданому рядку.
3. Метод countSpaces(String) має повертати кількість пробілів у переданому рядку.
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча." +
                "Тільки нікому не кажіть, що вона виникла випадково.";

        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишіть тут ваш код
        char[] ch = string.toCharArray();

        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                count ++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        //напишіть тут ваш код
        char[] ch = string.toCharArray();

        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                count ++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        //напишіть тут ваш код
        char[] ch = string.toCharArray();

        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isWhitespace(ch[i])) {
                count ++;
            }
        }
        return count;
    }
}

/*

У попередньому коді ми створювали порожній масив символів ch з тією самою довжиною, що і рядок string. Проте ми не
копіювали символи з string до масиву ch. Ось що ми робили:


char[] ch = new char[string.toCharArray().length];

Це створює порожній масив символів, який має довжину, рівну довжині рядка string. За замовчуванням, всі елементи цього
масиву ініціалізуються нульовим символом '\0'. Оскільки ми не копіювали символи з string до масиву ch, наші методи
countDigits, countLetters та countSpaces працювали з порожнім масивом символів, а не з вмістом рядка string.

Виправлений код копіює символи з рядка string до масиву ch перед виконанням обчислень:

char[] ch = string.toCharArray();

Це забезпечує, що масив ch містить такі самі символи, як і рядок string, і наші методи рахують кількість цифр,
літер та пробілів у рядку string коректно.

************************************************************************************************************************
Метод toCharArray() є методом класу String в Java. Він використовується для отримання масиву символів (char[]),
який представляє вміст поточного рядка (String).

Ось детальніше, що робить toCharArray():

Він створює новий масив символів (char[]) з тією самою довжиною, що і поточний рядок (String).
Він копіює кожен символ з поточного рядка (String) до відповідного елемента масиву символів (char[]).
Він повертає створений масив символів (char[]).
Отже, коли ви викликаєте toCharArray() для рядка, ви отримуєте масив символів, який містить ті самі символи, що і рядок,
в тому ж порядку. Це дозволяє вам працювати з кожним символом рядка окремо, ітеруватися по символах або виконувати інші
операції, які вимагають доступу до окремих символів рядка.

Наприклад, якщо у вас є рядок String myString = "Hello, world!";, то виклик myString.toCharArray() поверне масив
символів ['H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'].

*/