package ua.javarush.task.pro.task03.task0304;

import java.util.Locale;
import java.util.Scanner;

/* 
Виміряймо температуру тіла
Програма зчитує з клавіатури значення температури тіла й видає повідомлення про те, що температура тіла висока,
низька або нормальна, залежно від умов.
У класі оголошено дві булеві змінні isHigh (висока температура) і isLow (низька), в які потрібно винести відповідні
умови та замість виразів порівняння використовувати ці змінні.


Requirements:
1. Програма повинна зчитувати значення температури з клавіатури.
2. Не змінюй оголошення змінних isHigh та isLow.
3. Змінним isHigh та isLow в методі main мають бути присвоєні відповідні вирази порівняння.
4. Замість виразів порівняння в операторах if () мають бути використані змінні isHigh та isLow.
5. Функціонал програми не повинен змінитися.
*/

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        //напишіть тут ваш код
        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;
        if (isHigh) {
            System.out.println("температура тіла висока");
        } else if (isLow){
            System.out.println("температура тіла низька");
        } else {
            System.out.println("температура тіла нормальна");
        }
    }
}
