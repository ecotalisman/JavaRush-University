package ua.javarush.task.jdk13.task16.task1613;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/* 
Список і потоки
У методі main додати в статичний об'єкт list 5 потоків. Кожний потік має бути новим об'єктом класу Thread,
який працює зі своїм об'єктом класу SpecialThread.

Requirements:
1. У методі main створи 5 об'єкти типу SpecialThread.
2. У методі main створи 5 об'єктів типу Thread.
3. Додай 5 різних потоків до списку list.
4. Кожний потік зі списку list повинен працювати зі своїм об'єктом класу SpecialThread.
5. Клас SpecialThread змінити не можна.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //напишіть тут ваш код
        IntStream.range(0,5)
                .forEach(i -> list.add(new Thread(new SpecialThread())));

        list.forEach(Thread::start);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}

/*

Використаємо IntStream з бібліотеки Java Streams для генерації п'яти потоків і додати їх до списку.
Зауважимо, що для кожного потоку ми створюємо новий екземпляр класу SpecialThread. Потім ми створюємо новий Thread,
що використовує цей екземпляр як Runnable.

IntStream.range(0, 5) генерує послідовність чисел від 0 до 4 (включно). Для кожного числа в цій послідовності,
ми використовуємо lambda вираз i -> list.add(new Thread(new SpecialThread())) для створення нового потоку, який
використовує новий екземпляр SpecialThread як свій Runnable, і додаємо цей потік до списку.

*/