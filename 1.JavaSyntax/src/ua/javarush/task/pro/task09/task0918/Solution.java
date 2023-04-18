package ua.javarush.task.pro.task09.task0918;

/* 
Попрацюймо зі StringBuilder
Потрібно реалізувати 2 методи, використовуючи StringBuilder: addTo(String, String[]), replace(String, String, int, int).

Метод addTo(String, String[]) додає до рядка, отриманого як перший параметр, усі рядки за порядком із масиву рядків,
отриманого як другий параметр, і повертає об'єкт типу StringBuilder на основі цього рядка.
Щоб додати нове значення до наявного об'єкта типу StringBuilder, потрібно викликати його метод append(String) і
передати в нього це нове значення.
Метод replace(String, String, int, int) замінює частину рядка, отриманого як перший параметр, починаючи з індексу,
отриманого як третій параметр, і закінчуючи індексом, отриманим як четвертий параметр, на рядок, отриманий як другий
параметр, і повертає об'єкт типу StringBuilder на основі цього рядка.
Щоб замінити частину значення об'єкта типу StringBuilder, потрібно викликати його метод replace (int, int, String) і
передати в нього початкову та кінцеву позиції для заміни, а також нове значення.

Requirements:
1. Потрібно реалізувати метод addTo(String, String[]) згідно з умовою.
2. Потрібно реалізувати метод replace(String, String, int, int) згідно з умовою.
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Навчатися, навчатися і ще раз навчатися! ";

        System.out.println(addTo(string, new String[]{"Під ", "лежачий ", "камінь ", "вода ", "не ", "тече"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //напишіть тут ваш код
        return null;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //напишіть тут ваш код
        return null;
    }
}
