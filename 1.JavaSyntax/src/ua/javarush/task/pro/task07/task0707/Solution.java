package ua.javarush.task.pro.task07.task0707;

/* 
5 відтінків char
У методі main() зміни черговість виклику методів System.out.print() так, щоб вивести в консоль речення: "Hello char".
Не змінюй значення змінних. У методі main() не дописуй жодного додаткового коду.

Requirements:
1. Програма має виводити в консоль "Hello char".
2. Значення змінних мають залишитися такими, як були.
3. У методі main() не повинно бути нового коду.
*/

public class Solution {
    public static char char1 = 101;
    public static char char2 = 'H';
    public static char char3 = 114;
    public static char char4 = '\u006F';
    public static char char5 = 108;
    public static char char6 = 'h';
    public static char char7 = 0x0063;
    public static char char8 = ' ';
    public static char char9 = 'l';
    public static char char10 = 0x61;

    public static void main(String[] args) {
        System.out.print(char2);
        System.out.print(char1);
        System.out.print(char9);
        System.out.print(char5);
        System.out.print(char4);
        System.out.print(char8);
        System.out.print(char7);
        System.out.print(char6);
        System.out.print(char10);
        System.out.print(char3);
        System.out.println();
    }
}
