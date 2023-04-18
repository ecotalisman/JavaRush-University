package ua.javarush.task.pro.task05.task0503;

/* 
Працюємо з елементами масиву
Реалізуй метод main(String[]), який змінює знак елемента масиву array на протилежний, якщо значення цього елемента парне.

Requirements:
1. Реалізуй метод main(int[]) згідно з умовою.
*/

public class Solution {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        //напишіть тут ваш код
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = -array[i];
            }
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
