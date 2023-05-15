package ua.javarush.task.pro.task13.task1315;

/* 
Чотири пори року
Потрібно створити набір значень (enum) для пір року. Для цього слід в окремому файлі створити enum Season і оголосити в ньому 4 значення.
У методі Solution виведи на екран усі елементи переліку з нового рядка.


Requirements:
1. Створи в окремому файлі публічний перелік enum Season і додай значення: WINTER, SPRING, SUMMER, AUTUMN.
2. У класі Solution виведи в консоль кожну пору року з нового рядка. Використовуй елементи переліку безпосередньо: наприклад, Season.WINTER.
*/

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код
        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
    }
}
