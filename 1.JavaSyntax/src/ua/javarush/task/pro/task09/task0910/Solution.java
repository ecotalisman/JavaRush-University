package ua.javarush.task.pro.task09.task0910;

/* 
Кодування Unicode
У публічний статичний метод init(char[]) передається масив символів розміром 9, який потрібно заповнити такими символами:
0 - '\u00A9'
1 - '\u004A'
2 - '\u0061'
3 - '\u0076'
4 - '\u0061'
5 - '\u0052'
6 - '\u0075'
7 - '\u0073'
8 - '\u0068'

Щоб переглянути результат, запусти метод main().


Requirements:
1. Метод init(char[]) має заповнити отриманий масив символів згідно з умовою.
*/

public class Solution {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        //напишіть тут ваш код
        symbols[0] = '\u00A9';
        symbols[1] = '\u004A';
        symbols[2] = '\u0061';
        symbols[3] = '\u0076';
        symbols[4] = '\u0061';
        symbols[5] = '\u0052';
        symbols[6] = '\u0075';
        symbols[7] = '\u0073';
        symbols[8] = '\u0068';
    }
}
