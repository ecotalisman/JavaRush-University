package ua.javarush.task.jdk13.task27.task2706;

/* 
Producer–consumer
У класі TransferObject розстав виклики методів wait/notify/notifyAll, щоб забезпечити послідовне створення та
отримання об'єкта.
У методах run класів ConsumerTask і ProducerTask створи необхідні synchronized блоки.

Виведення програми, на яке ми очікуємо:
...
Put: M
Got: M
Put: N
Got: N
Put: K
Got: K
...
де M, N, K - числа
Метод main не бере участі в тестуванні.

P.S. Завжди намагайся використовувати concurrent колекції замість ручної реалізації wait/notify/notifyAll.
Задачі на кшталт цієї дозволяють краще розібратися в основах роботи багатопотокових застосунків.

Requirements:
1. У класі TransferObject публічний метод get() з типом значення, що повертається, int має бути синхронізований.
2. У класі TransferObject публічний метод put(int) з типом значения, що повертається, void має бути синхронізований.
3. Метод get класу TransferObject має чекати на появу value, і повертати його після того, як він з'явиться.
4. Метод put класу TransferObject повинен чекати, поки value заберуть і оновлять його значення після того, як воно зникне.
5. Метод get класу TransferObject повинен встановлювати прапор isValuePresent у false та повідомляти інші потоки
про ті, що очікують на вивільнення монітора перед повернення значення поля value.
6. Метод put класу TransferObject повинен встановлювати прапорець isValuePresent у true та повідомляти інші потоки,
що очікують на вивільнення монітора після оновлення значення поля value.
*/

public class Solution {
    public static void main(String args[]) throws InterruptedException {
        TransferObject transferObject = new TransferObject();
        ProducerTask producerTask = new ProducerTask(transferObject);
        ConsumerTask consumerTask = new ConsumerTask(transferObject);

        Thread.sleep(50);
        producerTask.stop();
        consumerTask.stop();
    }
}

/*

1) Пояснення роботи потоків:

- Ви маєте два потоки: ProducerTask (виробник) та ConsumerTask (споживач).
- ProducerTask створює значення (цілі числа в даному випадку) та розміщує їх в об'єкті TransferObject через метод put.
- ConsumerTask читає (або "споживає") ці значення з TransferObject через метод get.

2) Чому в get() використовується false в while, а в put() використовується true:

- В класі TransferObject є змінна isValuePresent. Ця змінна вказує, чи присутнє значення в об'єкті. Якщо true, значення є.
Якщо false, значення відсутнє.

- В методі get(): Якщо isValuePresent є false, метод буде чекати (за допомогою wait()), поки не з'явиться нове значення.
- В методі put(): Якщо isValuePresent є true, метод буде чекати (за допомогою wait()), поки споживач не прочитає поточне
значення.

3) Покроковий розбір:

- Коли виробник (ProducerTask) спробує додати нове значення:
    -Якщо в TransferObject вже є значення (isValuePresent є true), метод put() буде чекати, поки споживач не забере
    це значення.

    - Після того, як споживач забере значення, isValuePresent стане false та put() може продовжити роботу.

- Коли споживач (ConsumerTask) спробує забрати значення:
    - Якщо значення відсутнє (isValuePresent є false), метод get() буде чекати, поки виробник не поставить нове значення.
    - Після того, як виробник поставить нове значення, isValuePresent стане true та get() може продовжити роботу.

4) Пояснення лекції:

У лекції говориться про те, що потрібно завжди використовувати wait() в циклі. Це важливо, тому що іноді можуть бути
"хибні побудки" (коли поток пробуджується не через notify(), а через внутрішні механізми JVM або інші причини).
Щоб уникнути проблем, пов'язаних з такими "хибними побудками", ви повинні завжди перевіряти умову (за допомогою while)
перед продовженням роботи.


Тому реалізація використовує while перед wait(), щоб завжди гарантувати, що умова (isValuePresent є false або true)
дійсно виконується перед тим, як поток продовжить роботу.

*/