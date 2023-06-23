package ua.javarush.task.pro.task16.task1605;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Кишеньковий телепорт
У класі Solution константа INVENTION_DAY містить дату винаходу нового популярного гаджета — кишенькового телепорту.
Реалізуй метод isTeleportInvented, який отримує як параметр дату й порівнює її з INVENTION_DAY. Якщо передана дата
пізніша за дату винаходу, потрібно вивести напис: "Будь ласка, можете забрати ваш кишеньковий телепорт. Дякуємо за
очікування!" — і повернути true. Якщо передана дата передує даті винаходи, вивести: "Вибачте, телепорт іще не винайшли,
приходьте через 10 років." — і повернути false. У методі main у циклі виклич isTeleportInvented і передай currentDay
як параметр. Якщо метод повертає false, додай до currentDay 10 років, інакше — вийди з циклу.

Requirements:
1. Метод isTeleportInvented має вивести відповідний напис і повернути true, якщо передана дата більша за INVENTION_DAY.
2. Метод isTeleportInvented має вивести відповідний напис і повернути false, якщо передана дата менша за INVENTION_DAY.
3. Щоразу, коли isTeleportInvented повертає false, потрібно збільшувати currentDay на 10 років.
4. Метод isTeleportInvented має викликатися доти, доки він не поверне true.
*/

public class Solution {

    public static final String INVENTED = "Будь ласка, можете забрати ваш кишеньковий телепорт. Дякуємо за очікування!";
    public static final String NOT_INVENTED = "Вибачте, телепорт іще не винайшли, приходьте через 10 років.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        //напишіть тут ваш код
        while (!isTeleportInvented(currentDay)) {
            currentDay.add(Calendar.YEAR, 10);
        }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        //напишіть тут ваш код
        if (currentDay.after(INVENTION_DAY)) {
            System.out.println(INVENTED);
            return true;
        } else {
            System.out.println(NOT_INVENTED);
            return false;
        }
    }
}


/*

Метод Calendar.getInstance() використовується для створення екземпляра Calendar, який має поточну дату й час.

*/