package ua.javarush.task.jdk13.task16.task1624;

/* 
Відлік на перегонах
1. Розберися, що робить програма.
2. Реалізуй логіку метода run таким чином, щоб кожну секунду через пробіл
видавався відлік починаючи з numSeconds до 1, а потім слово [Марш!] (див. приклади).
3. Якщо потік працює 3.5 секунди або більше, перерви його методом interrupt і всередині потоку виведи в консолі
слово [Перервано!].

Приклад для numSeconds=4 :
"4 3 2 1 Перервано!"

4. Якщо потік працює менше ніж 3.5 секунди, він має завершитися самостійно.
Пример для numSeconds=3 :
"3 2 1 Марш!"

PS: метод sleep викидає InterruptedException.

Requirements:
1. Метод run класу RacingClock повинен містити цикл.
2. Об'єкт класу RacingClock кожну секунду має зменшувати значення змінної numSeconds на одиницю.
3. Метод main повинен викликати Thread.sleep(3500).
4. Метод main повинен викликати метод interrupt в об'єкта clock.
5. Якщо numSeconds дорівнює 3, то програма має виводити "3 2 1 Марш!".
6. Якщо numSeconds дорівнює 4, то програма має виводити "4 3 2 1 Перервано!".
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //напишіть тут ваш код
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //напишіть тут ваш код
            try {
                while (!isInterrupted() && numSeconds >= 0) {
                    if (numSeconds == 0) {
                        System.out.println("Марш!");
                    } else {
                        System.out.print(numSeconds + " ");
                        Thread.sleep(1000);
                    }
                    numSeconds--;
                }
            } catch (InterruptedException e) {
                if (numSeconds != -1) {
                    System.out.println("Перервано!");
                }
            }
        }
    }
}

/*

1) У циклі while ви використовуєте !isInterrupted() для того, щоб перевірити, чи не було потоку перервано.
Це хороший спосіб контролю, і він працює разом із numSeconds >= 0, що забезпечує дійсний відлік.

2) Якщо numSeconds дорівнює 0, ви виводите "Марш!" та завершуєте цикл, тому що numSeconds-- зробить значення -1, і цикл завершиться.

3) Якщо в процесі сну поток переривається, ви перехоплюєте InterruptedException. Тоді ви перевіряєте numSeconds на
рівність -1, щоб визначити, чи вивести "Перервано!". Якщо numSeconds не дорівнює -1, ви виводите повідомлення.

Цей код виводить "Марш!" або "Перервано!", в залежності від ситуації.

*/