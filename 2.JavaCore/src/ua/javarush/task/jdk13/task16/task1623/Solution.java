package ua.javarush.task.jdk13.task16.task1623;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Рахуємо секунди
1. Напиши реалізацію методу run у потоці Stopwatch (секундомір).
2. Stopwatch повинен порахувати кількість секунд, що пройшла від створення потоку до введення рядку.
3. Виведи кількість секунд у консолі.

Requirements:
1. Метод run класу Stopwatch (секундомір) повинен містити цикл.
2. Метод run повинен викликати Thread.sleep(1000).
3. Метод run повинен збільшувати значення поля seconds на 1 кожну секунду.
4. Після переривання роботи потоку Stopwatch (виклику метода interrupt), метод run повинен вивести кількість
секунд (seconds) у консолі
5. У класі Stopwatch повинен бути лише один метод run.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                //напишіть тут ваш код
                while (!Thread.currentThread().isInterrupted()) {
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}

/*

Реалізовано вимоги завдання:

1) У методі run класу Stopwatch є цикл.
2) У циклі метод run викликає Thread.sleep(1000).
3) За кожну секунду (1000 мілісекунд) значення поля seconds збільшується на 1.

4) Якщо потік Stopwatch перерваний (через виклик stopwatch.interrupt() в main), то метод run виводить кількість
секунд у консолі.

5) У класі Stopwatch є лише один метод run.
Таким чином, правильно реалізувано завдання. Цей код створює потік Stopwatch, який рахує секунди до тих пір, поки
користувач не введе рядок у консоль. Після чого потік переривається, і виводиться кількість секунд, що пройшла.

*/