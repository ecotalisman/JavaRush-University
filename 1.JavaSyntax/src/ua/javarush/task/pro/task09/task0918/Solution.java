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

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String string = "Навчатися, навчатися і ще раз навчатися! ";

        System.out.println(addTo(string, new String[]{"Під ", "лежачий ", "камінь ", "вода ", "не ", "тече"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //напишіть тут ваш код
        StringBuilder builder = new StringBuilder();
        builder.append(string);

        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
        }
//        for (String str : strings) {
//            builder.append(str);
//        }
        return builder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //напишіть тут ваш код
        StringBuilder builder = new StringBuilder();
        builder.append(string);
        builder.replace(start, end, str);
        return builder;
    }
}

/*

Цей код містить два методи, addTo(String string, String[] strings) та replace(String string, String str, int start,
int end), які реалізують операції додавання та заміни частини рядка відповідно, використовуючи StringBuilder.

Метод addTo(String string, String[] strings) працює наступним чином:
1) Створює об'єкт StringBuilder builder.
2) Додає до builder вміст рядка string за допомогою метода append(string).
3) Використовує цикл для додавання елементу масиву strings[] до builder за допомогою метода append().
4) Повертає builder у вигляді об'єкта StringBuilder.


Метод replace(String string, String str, int start, int end) працює наступним чином:
1) Створює об'єкт StringBuilder builder.
2)Додає до builder вміст рядка string за допомогою метода append(string).
3) Використовує метод replace(start, end, str) для заміни частини рядка в builder, яка починається з індексу start і
закінчується індексом end, на рядок str.
4) Повертає builder у вигляді об'єкта StringBuilder.

Цей код демонструє, як використовувати StringBuilder для роботи з рядками, зокрема додавання та заміни частини рядка.

*************************************************************************************************************************

Використання builder.append(Arrays.toString(strings)) додасть усі рядки з масиву strings в одному рядку, але з
додатковими символами, такими як [, ] та ,. Метод Arrays.toString() перетворює масив на рядок у вигляді
"[елемент1, елемент2, елемент3]".

Ось приклад різниці між використанням Arrays.toString(strings) та циклу для додавання рядків:


String[] strings = new String[]{"Під ", "лежачий ", "камінь ", "вода ", "не ", "тече"};

StringBuilder builder1 = new StringBuilder();
builder1.append(Arrays.toString(strings));
System.out.println(builder1.toString()); // Виведе: "[Під , лежачий , камінь , вода , не , тече]"

StringBuilder builder2 = new StringBuilder();
for (String str : strings) {
    builder2.append(str);
}
System.out.println(builder2.toString()); // Виведе: "Під лежачий камінь вода не тече"


Як видно з прикладу, коли використовується Arrays.toString(strings), в результаті будуть зайві символи.
Тому для правильного додавання рядків з масиву до StringBuilder краще використовувати цикл, як у коді.


*/
