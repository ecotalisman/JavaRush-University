package ua.javarush.task.pro.task05.task0502;

/* 
Парні та непарні комірки масиву
У методі main(String[]) тобі потрібно заповнити масив strings значеннями. Якщо індекс елемента масиву парний —
присвоїти елементу значення "Парний" (нуль — число парне), інакше присвоїти "Непарний".
Виведення тексту в консоль у тестуванні не використовується.


Requirements:
1. У класі Solution має бути публічна статична змінна strings типу String[], проініціалізована масивом розміром
5 елементів.
2. Метод main(String[]) повинен заповнювати масив згідно з умовою.
*/

public class Solution {
    public static final String ODD = "Непарний";
    public static final String EVEN = "Парний";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        //напишіть тут ваш код
        for (int i = 0; i < strings.length; i++) {
            if ((i == 0) || (i % 2 == 0)){
                strings[i] = EVEN;
            } else {
                strings[i] = ODD;
            }
        }

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}
