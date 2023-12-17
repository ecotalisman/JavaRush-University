package ua.javarush.task.jdk13.task42.task4205;

import java.util.Random;
import java.util.concurrent.DelayQueue;

/* 
Черга повідомлень

Програма не компілюється. Допиши її:

1. У класі Message імплементуй інтерфейс Delayed.
2. Додай до класу Message приватне поле endTime типу long, яке має бути проініціалізоване в конструкторі значенням часу в
наносекундах, що дорівнює системному часу+час життя повідомлення.
3. У класі Message перевизнач public метод long getDelay(TimeUnit unit). Метод повинен повернути значення часу в
наносекундах, що є різницею між endTime та системним часом.
4. У класі Message перевизнач public метод int compareTo(Delayed o). Метод повинен порівнювати результат виклику методу
getDelay(TimeUnit.NANOSECONDS) поточного об'єкта та об'єкта, який передається як параметр та повертати:
- 1, якщо результат getDelay поточного об'єкта більший за getDelay переданого;
- -1, якщо результат getDelay поточного об'єкта менший за getDelay переданого;
- 0, якщо результат getDelay поточного об'єкта та переданого дорівнюють один одному.

Запусти програму та подивися, як працює DelayQueue.

Requirements:
1. Клас Solution не змінюй.
2. Клас Message має імплементувати інтерфейс Delayed.
3. У класі Message має бути приватне поле endTime типу long, яке має бути проініціалізоване у конструкторі згідно з умовою.
4. У класі Message потрібно перевизначити та реалізувати відповідно до умови public методи long getDelay(TimeUnit unit)
та int compareTo(Delayed o).
*/

public class Solution {
    private static final DelayQueue<Message> QUEUE = new DelayQueue<>();
    private static final int COUNT = 10;
    private static final long MULTIPLIER = 100;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= COUNT; i++) {
            long lifetime = getRandomInt(1, COUNT) * MULTIPLIER;
            Message message = new Message(i, "test " + i, lifetime);
            QUEUE.offer(message);
            System.out.println("Повідомлення id#" + message.getMessageId() +
                    " додано в чергу, термін зберігання спливає через " + message.getLifetime() + " мс");
        }

        while (!QUEUE.isEmpty()) {
            try {
                Message message = QUEUE.take();
                System.out.println("Повідомлення id#" + message.getMessageId() +
                        ". Термін зберігання (" + message.getLifetime() + " мс) минув! Повідомлення видалено з черги повідомлень");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
