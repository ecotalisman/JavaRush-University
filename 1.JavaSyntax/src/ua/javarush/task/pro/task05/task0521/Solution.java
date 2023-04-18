package ua.javarush.task.pro.task05.task0521;

/* 
Виконання фрагмента коду
Потренуйся виконувати фрагмент коду під час виконання програми:

Постав break point навпроти виклику методу println і запусти програму в режимі налагодження.
Після зупинки натисни Alt+F8 (Option+F8 для macOS) і виконай такий код:
loop.replaceAll("\\W", "").split("fahrenheit")[1]
Результат виконання коду присвой полю result (внеси зміни у вихідний код).
У результаті в класі Solution має відбутися лише одна зміна: ініціалізація поля result під час оголошення.


Requirements:
1. Не змінюй метод main.
2. Полю result має бути присвоєно правильне значення.
*/

public class Solution {

    public static int result = 45967;

    public static void main(String[] args) {
        String loop = "    for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {\n";
        System.out.println(loop);
    }
}

