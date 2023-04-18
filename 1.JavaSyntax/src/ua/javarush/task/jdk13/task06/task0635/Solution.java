package ua.javarush.task.jdk13.task06.task0635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;

/* 
Ідентифікатор QR-кодів
Давай напишемо програму ідентифікації псевдо QR-кодів. У програмі дано двовимірний масив expectedArray розміром 3*3.
У цьому масиві зберігається псевдо QR-код. Тобі на допомогу реалізовано рандомне заповнення цього масиву — за бажання
можеш заповнити його самостійно, це на тести не впливає.
Тобі необхідно написати код для заповнення масиву actualArray значеннями з клавіатури (зчитуємо по одному символу,
порожня клітина – пробіл, зафарбована — #).
Далі, використовуючи правильний метод класу Arrays, необхідно порівняти цей масив із масивом expectedArray і вивести
на екран результат порівняння: true, якщо масиви однакові та false, якщо вони різні.


Requirements:
1. У класі Solution має бути публічне статичне поле expectedArray типу String[][], проініціалізоване
значенням new String[3][3].
2. У класі Solution має бути публічне статичне поле actualArray типу String[][], проініціалізоване
значенням new String[3][3].
3. Масив actualArray необхідно заповнити значеннями з клавіатури.
4. Для порівняння двовимірних масивів у програмі використовуй потрібний метод класу Arrays.
*/

public class Solution {
    public static String[][] expectedArray = new String[3][3];
    public static String[][] actualArray = new String[3][3];

    static {
        Random random = new Random();
        for (int i = 0; i < expectedArray.length; i++) {
            for (int j = 0; j < expectedArray[0].length; j++) {
                OptionalInt optionalInt = random.ints(0, 2).findFirst();
                expectedArray[i][j] = optionalInt.isPresent() && optionalInt.getAsInt() == 1 ? " " : "#";
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < actualArray.length; i++) {
            for (int j = 0; j < actualArray[i].length; j++) {
                actualArray[i][j] = scanner.nextLine();
            }
        }
        System.out.println(Arrays.deepEquals(expectedArray, actualArray));
    }
}
