package ua.javarush.task.pro.task05.task0520;

/* 
Перевзуваємося на ходу
Потренуйся визначати й змінювати значення змінних під час виконання програми:

Постав break point навпроти виклику методу println і запусти програму в режимі налагодження.
Після зупинки натисни F8 точно 9 разів.
Подивись, яке значення має тепер змінна correction, і встанови таке саме значення для змінної fahrenheit (у вікні налагодження).
Натисни F8 ще 6 разів.
Подивися поточне значення змінної correction і присвой це значення полю result (внеси зміни у вихідний код).
У результаті в класі Solution має відбутися лише одна зміна: ініціалізація поля result під час оголошення.


Requirements:
1. Не змінюй метод main.
2. Полю result має бути присвоєно правильне значення.
*/

public class Solution {

    public static int result = 105;

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
        }
    }
}
