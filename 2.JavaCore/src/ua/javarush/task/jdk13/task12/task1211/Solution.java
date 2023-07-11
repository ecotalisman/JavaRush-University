package ua.javarush.task.jdk13.task12.task1211;

/* 
Int та Integer
Реалізуй два методи: print(int) та print(Integer).
Напиши такий код у методі main(), щоб викликалися обидва.

Requirements:
1. Клас Solution має містити статичний метод main().
2. Клас Solution має містити статичний void метод print() з параметром типу int.
3. Клас Solution має містити статичний void метод print() з параметром типу Integer.
4. Метод main() має викликати метод print() з параметром типу int.
5. Метод main() має викликати метод print() з параметром типу Integer.
*/

public class Solution {
    public static void main(String[] args) {
        // Write code here:
        print(17);
        print(Integer.valueOf(17));
    }

    // Напишіть тут ваші методи

    public static void print(int n) {

    }

    public static void print(Integer integer) {

    }

}
