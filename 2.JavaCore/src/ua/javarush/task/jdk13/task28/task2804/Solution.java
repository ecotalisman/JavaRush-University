package ua.javarush.task.jdk13.task28.task2804;

/* 
Пріоритети в Threads
В окремому файлі створи клас MyThread, успадкуйся від Thread.
MyThread повинен:
1. Мати можливість бути створений за допомогою використання будь-якого конструктора суперкласу (Alt+Insert).
2. Пріоритет у тредів має проставлятися циклічно від мінімального до максимального значення.
3. Якщо у треда встановлена тред-група(ThreadGroup), пріоритет треда не може бути більше за максимальний пріоритет
його тред-групи.

Requirements:
1. Створи клас MyThread в окремому файлі. Успадкуй його від Thread.
2. У класі MyThread мають бути присутніми конструктори, аналогічні до конструкторів суперкласу.
3. Пріоритет у об'єктів MyThread повинен проставлятися циклічно, від MIN_PRIORITY до MAX_PRIORITY.
4. Якщо в об'єкта MyThread встановлена ThreadGroup, пріоритет MyThread не повинен бути вище за максимальний
пріоритет ThreadGroup.
*/

public class Solution {

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.print(new MyThread().getPriority() + " ");
        }
        //output
        //1 2 3 4 5 6 7 8 9 10 1 2

        System.out.println();
        ThreadGroup group = new ThreadGroup("someName");
        group.setMaxPriority(7);
        for (int i = 0; i < 12; i++) {
            System.out.print(new MyThread(group, "name" + i).getPriority() + " ");
        }
        //output
        //3 4 5 6 7 7 7 7 1 2 3 4
    }
}

/*

Для того, щоб виконати завдання, вам потрібно зрозуміти, як працює пріоритет в тредах і як проставляти його циклічно.
Ось кроки, які допоможуть вам направити хід думок:

1) Створення конструкторів:

- Додайте всі необхідні конструктори для класу MyThread через Alt+Insert або ручне копіювання з класу Thread і адаптацію
для класу MyThread.

2) Циклічне проставлення пріоритетів:

- Створіть статичну змінну, яка буде відслідковувати поточний пріоритет.

- Кожен раз, коли ви створюєте новий тред, пріоритет поточного треда повинен збільшуватися. Коли пріоритет досягає
MAX_PRIORITY, він повинен знову починатися з MIN_PRIORITY.

- Ви можете використовувати оператор % для того, щоб зробити пріоритет циклічним.

3) Пріоритет треда відносно його ThreadGroup:

- Перевірте, чи має тред ThreadGroup.
- Якщо так, перевірте максимальний пріоритет цієї групи тредів.
- Забезпечте, щоб пріоритет вашого треда не перевищував максимальний пріоритет його групи.

4) Виклик конструктора суперкласу:

У ваших конструкторах перед тим, як ви будете проставляти пріоритет, вам потрібно викликати конструктор суперкласу
(super(...)). Це забезпечить правильну ініціалізацію вашого треда.

****************************************************************************************************************************

Ось як ви можете підійти до реалізації цього завдання:

1) Створення конструкторів:

- Ваш клас MyThread вже має два базові конструктори. Але вам може знадобитися додати ще декілька конструкторів для
повної відповідності всім конструкторам суперкласу Thread.

2) Циклічне проставлення пріоритетів:

- Вам знадобиться статичний атрибут, який буде відслідковувати поточний пріоритет, скажімо, currentPriority.
- У кожному конструкторі змінюйте currentPriority та встановлюйте його для поточного треда.
- Використовуйте оператор % для того, щоб зробити циклічну зміну пріоритету.

Приклад:

private static int currentPriority = MIN_PRIORITY;

public MyThread() {
    setPriority(currentPriority);
    currentPriority = (currentPriority % MAX_PRIORITY) + 1;
}

Таким чином, коли currentPriority досягне MAX_PRIORITY, він буде скидатися до MIN_PRIORITY.

3) Пріоритет треда відносно його ThreadGroup:
- Ви можете перевірити, чи має тред групу, використовуючи getThreadGroup().
- Якщо у треда є група, ви можете отримати максимальний пріоритет цієї групи за допомогою getMaxPriority().
- Після цього порівняйте пріоритет треда і групи, і якщо потрібно, знизьте пріоритет треда до максимального
пріоритету групи.

Підказка:

ThreadGroup group = getThreadGroup();
if (group != null && getPriority() > group.getMaxPriority()) {
    setPriority(group.getMaxPriority());
}

Цей код слід вставити в кожен конструктор після того, як ви встановите пріоритет треда.

****************************************************************************************************************************

потрібно внести декілька змін, щоб він працював згідно з вимогами завдання:

1) Правильний порядок дій у конструкторі:

- Спочатку вам потрібно встановити пріоритет треду.
- Потім вам потрібно перевірити його відносно максимального пріоритету в ThreadGroup, якщо такий існує.
- І в кінці змінити currentPriority.

2) Додати всі конструктори з суперкласу:

- Щоб задовольнити вимоги завдання, вам потрібно включити всі конструктори класу Thread.

3) Спростити код:

- Ви можете створити приватний метод, який виконує всю цю логіку проставлення пріоритету, і просто викликати його в
кожному конструкторі.

Ось вдосконалений варіант:

package ua.javarush.task.jdk13.task28.task2804;

public class MyThread extends Thread {
    private static int currentPriority = MIN_PRIORITY;

    public MyThread() {
        initPriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        initPriority();
    }

    // Додати інші конструктори, аналогічно до конструкторів суперкласу

    private void initPriority() {
        setPriority(currentPriority);
        ThreadGroup group = getThreadGroup();
        if (group != null && getPriority() > group.getMaxPriority()) {
            setPriority(group.getMaxPriority());
        }
        currentPriority = (currentPriority % MAX_PRIORITY) + 1;
    }
}

Тепер ви можете додати всі інші конструктори, аналогічно до конструкторів класу Thread, і для кожного з них просто
викликати initPriority().

*/