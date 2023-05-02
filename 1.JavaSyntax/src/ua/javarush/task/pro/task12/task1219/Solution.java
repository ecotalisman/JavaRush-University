package ua.javarush.task.pro.task12.task1219;

import java.util.ArrayList;

/* 
Подвійні фігурні дужки
У методі main створюється список ArrayList<String>, присвоюється змінній var strings і заповнюється п'ятьма елементами.
Потрібно переписати код, не змінюючи логіки, з використанням подвійних фігурних дужок.


Requirements:
1. Список strings має заповнюватися п'ятьма елементами в подвійних фігурних дужках.
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>()
        {{
            add("Так");
            add("теж");
            add("можна");
            add("робити");
            add("!");
        }};

        // It was a condition:
//        var strings = new ArrayList<String>();
//        strings.add("Так");
//        strings.add("теж");
//        strings.add("можна");
//        strings.add("робити");
//        strings.add("!");

    }
}
