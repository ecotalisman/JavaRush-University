package ua.javarush.task.pro.task02.task0205;

/* 
Колись було 32 зуба
Використовуючи лише оператор декремента, зміни значення змінної toothCounter, щоб на екран було виведено число 23.

Requirements:
1. Не змінюй команду оголошення змінної toothCounter.
2. До змінної toothCounter потрібно застосувати кілька команд декремента, щоб вона змінила значення на 23.
3. Програма повинна виводити на екран змінну toothCounter зі значенням 23.
*/

public class Solution {

    public static void main(String[] args) {
        int toothCounter = 32;

        //напишіть тут ваш код
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;

        System.out.println(toothCounter);
    }
}
