package ua.javarush.task.pro.task12.task1216;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вперед у майбутнє
У класі Solution є поля number, string і метод main з оголошеними в ньому змінними. Тобі потрібно замінити оголошення
змінних на var там, де це можливо. Порядок розташування змінних не повинен змінюватися.

Приклад:
Scanner console = new Scanner(System.in);
замінити на:
var console = new Scanner(System.in);


Requirements:
1. Заміни лише типи змінних на var, де це можливо.
2. Не змінюй праву частину виразів.
*/

public class Solution {
    private int number = 54;
    private String string = "string";

    public static void main(String[] args) {

        // It was condition:
//        int integer = 22;
//        String string = "string";
//        int[] array = new int[5];
//        ArrayList<String> strings = new ArrayList<String>();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Integer maxValue = Integer.valueOf(Integer.MAX_VALUE);

        var integer = 22;
        var string = "string";
        var array = new int[5];
        var strings = new ArrayList<String>();
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        var maxValue = Integer.valueOf(Integer.MAX_VALUE);

    }
}
