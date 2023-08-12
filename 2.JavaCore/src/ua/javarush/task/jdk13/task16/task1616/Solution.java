package ua.javarush.task.jdk13.task16.task1616;

import java.util.ArrayList;
import java.util.List;

/* 
join: у потрібний час у потрібному місці
Подумай, в якому місці та для якого об'єкту потрібно викликати метод join, щоб результат виводився по порядку
спочатку для firstThread, а потім для secondThread.
Виклич метод join у потрібному місці.

Приклад виведення:
firstThread : String 1
firstThread : String 2
...
firstThread : String 19
firstThread : String 20
secondThread : String 1
...
secondThread : String 20


Requirements:
1. Метод main має викликати метод join для об'єкта firstThread.
2. Метод main не має викликати метод join для об'єкта secondThread.
3. Метод main не має викликати System.out.println() або System.out.print().
4. Виведення програми має бути ідентичним прикладу із завдання.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        PrintListThread firstThread = new PrintListThread("firstThread");
        PrintListThread secondThread = new PrintListThread("secondThread");
        firstThread.start();

        firstThread.join();

        secondThread.start();
    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<>();
        if (n < 1) {
            return result;
        }

        for (int i = 0; i < n; i++) {
            result.add(String.format("String %d", (i + 1)));
        }
        return result;
    }

    public static class PrintListThread extends Thread {
        public PrintListThread(String name) {
            super(name);
        }

        public void run() {
            printList(getList(20), getName());
        }
    }
}
