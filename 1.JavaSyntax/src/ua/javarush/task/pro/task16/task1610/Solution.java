package ua.javarush.task.pro.task16.task1610;

import java.time.LocalTime;

/* 
Тренування на час
Ініціалізуй шість статичних змінних: - у timeMax запиши максимально можливий час; - у timeMin запиши мінімально
можливий час; - у time1 запиши час 14 година рівно; - у time2 запиши час 7 година 8 секунд; - у time3 запиши
час 0 годин 45 хвилин 61 наносекунда; - у time4 запиши час 14 година 45 секунд 1001 наносекунда. У методі main()
створи об'єкт LocalTime, використовуючи години з time1 (time1.getHour()), хвилини з time2, секунди з time3, наносекунди
з time4. Виведи його в консоль.

Requirements:
1. У класі Solution шість змінних мають бути ініціалізовані під час оголошення.
2. timeMax має бути ініціалізована максимально можливим часом.
3. timeMin має бути ініціалізована мінімально можливим часом.
4. time1 має бути ініціалізована часом 14 година рівно.
5. time2 має бути ініціалізована часом 7 година 8 секунд.
6. time3 має бути ініціалізована часом 0 годин 45 хвилин 61 наносекунда.
7. time4 має бути ініціалізована часом 14 година 45 секунд 1001 наносекунда.
8. Результат виведення в консоль має відповідати умові.
*/

public class Solution {

    // It was a condition:
//    static LocalTime timeMax;
//    static LocalTime timeMin;
//    static LocalTime time1;
//    static LocalTime time2;
//    static LocalTime time3;
//    static LocalTime time4;

    // Change a code:
    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1 = LocalTime.of(14, 0);
    static LocalTime time2 = LocalTime.of(7, 0, 8);
    static LocalTime time3 = LocalTime.of(0, 45, 0, 61);
    static LocalTime time4 = LocalTime.of(14, 0, 45, 1001);

    public static void main(String[] args) {
        //напишіть тут ваш код
        LocalTime newTime = LocalTime.of(time1.getHour(), time2.getMinute(), time3.getSecond(), time4.getNano());
        System.out.println(newTime);
    }
}
