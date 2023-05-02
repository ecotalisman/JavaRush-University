package ua.javarush.task.pro.task12.task1215;

import java.util.ArrayList;

/* 
Розбираємо піраміду з келихів
Задача проста: потрібно розібрати піраміду з келихів. А допоможе нам у цьому метод removeGlassesReverse. Цей метод
має прибирати кожен ряд, починаючи з верхнього (з кінця списку). Тобі потрібно реалізувати цей метод.
У тестуванні тобі допоможе метод main.
Спробуй запустити програму й подивитися, що виводиться на екран.


Requirements:
1. Клас Solution має містити публічний статичний метод removeGlassesReverse(ArrayList<String>).
2. Метод removeGlassesReverse має видалити всі елементи з переданого списку, починаючи з кінця (використовуй
метод remove(int) для списку).
*/

public class Solution {

    private static ArrayList<String> initList() {
        String glassTop     = "       🍷       ";
        String glassSecond  = "      🍷🍷      ";
        String glassThird   = "     🍷🍷🍷     ";
        String glassFourth  = "    🍷🍷🍷🍷    ";
        String glassFifth   = "   🍷🍷🍷🍷🍷   ";
        String glassSixth   = "  🍷🍷🍷🍷🍷🍷  ";
        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
        String glassEighth  = "🍷🍷🍷🍷🍷🍷🍷🍷";
        ArrayList<String> list = new ArrayList<>();
        list.add(glassEighth);
        list.add(glassSeventh);
        list.add(glassSixth);
        list.add(glassFifth);
        list.add(glassFourth);
        list.add(glassThird);
        list.add(glassSecond);
        list.add(glassTop);
        return list;
    }

    public static void print(ArrayList<String> glasses) {
        for(int i = glasses.size() - 1; i >= 0; i--) {
            System.out.println(glasses.get(i));
        }
    }

    public static void removeGlassesReverse(ArrayList<String> glasses) {
        System.out.println("Починаємо розбирати піраміду...");

        //напишіть тут ваш код
//        glasses.removeAll(initList());

        for (int i = glasses.size() - 1; i >= 0; i--) {
            glasses.remove(i);
        }

        if(glasses.size() == 0) {
            System.out.println("Піраміду розібрано!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> glasses = initList();
        print(glasses);

        removeGlassesReverse(glasses);
        print(glasses);
    }
}

/*
Метод initList() - це допоміжний метод, який створює та повертає список рядків, що представляють піраміду з келихів.
У цьому методі створюється ArrayList list, який заповнюється рядками, що містять келихи різних рівнів піраміди.

Кожен рядок у list відповідає одному рівню піраміди, і келихи розташовані у формі піраміди. Наприклад, найнижчий рівень
піраміди містить 8 келихів, а верхній рівень містить лише 1 келих. Метод initList() створює ці рядки та додає їх у список list.


В масивах, і в списках (ArrayList) індексація починається з нуля, тому для доступу до останнього елемента в обох випадках
потрібно віднімати 1 від розміру.

Тобто, якщо ви працюєте з масивом або списком (ArrayList), отримати останній елемент можна за допомогою array[array.length - 1]
або list.get(list.size() - 1) відповідно. В обох випадках вам потрібно віднімати 1 від розміру, щоб правильно індексувати останній
елемент, оскільки індексація в масивах та списках (ArrayList) починається з нуля.

************************************************************************************************************************************

Для 5 елементів розмір (size) списку буде 5. Оскільки індексація починається з 0, індекс останнього елемента буде 4 (5 - 1 = 4).

У випадку з ArrayList, ви можете отримати останній елемент, використовуючи наступний код:

ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);

int lastIndex = list.size() - 1;
int lastElement = list.get(lastIndex);
Тут lastIndex дорівнює 4, і lastElement дорівнює 50, який є останнім елементом списку.
*/