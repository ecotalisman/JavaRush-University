package ua.javarush.task.jdk13.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Нотатки
Асинхронність виконання потоків.
1. Клас Note буде використовуватися потоками.
2. Створи public static потік NoteThread (Runnable не є потоком), який в методі run 100 разів (index = 0-99) виконає 
такі дії:
2.1. За допомогою метода addNote додасть нотатку з іменем [getName() + "-Note" + index], наприклад, при index=4
"Thread-0-Note4"
2.2. Засне на 1 мілісекунду
2.3. За допомогою метода removeNote видалить нотатку
2.4. Як параметр до removeNote передай ім'я потоку - метод getName()
Щоб запустити програму, потрібно розкоментувати рядки в методі main().

Requirements:
1. Клас Solution повинен містити public static клас NoteThread.
2. Клас NoteThread має бути потоком.
3. У методі run класу NoteThread має бути цикл.
4. Метод run класу NoteThread повинен 100 разів викликати метод addNote з параметром (getName() + "-Note" + index).
5. Метод run класу NoteThread повинен 100 разів викликати Thread.sleep() з параметром (1).
6. Метод run класу NoteThread повинен 100 разів викликати метод removeNote з параметром (getName()).
*/

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class NoteThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                Note.addNote(getName() + "-Note" + i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Note.removeNote(getName());
            }
        }
    }
    

    public static class Note {

        public static final List<String> NOTES = new ArrayList<>();

        public static void addNote(String note) {
            NOTES.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = NOTES.remove(0);
            if (note == null) {
                System.out.println("Інший потік видалив нашу нотатку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Потік [" + threadName + "] видалив чужу нотатку [" + note + "]");
            } else {
                System.out.println("Потік [" + threadName + "] видалив свою нотатку [" + note + "]");
            }
        }
    }
}

/*

Хоча Runnable та Thread часто використовуються у контексті багатопоточності в Java, між ними є декілька важливих різниць.

1) Runnable vs. Thread:

* Runnable: Це інтерфейс, який має єдиний метод run(). Якщо ви створюєте клас, який реалізує Runnable, це просто
гарантує, що у цьому класі буде метод run(). Але на самому ділі, щоб запустити цей метод у новому потоці, вам все одно
потрібно створити новий екземпляр класу Thread і передати екземпляр вашого Runnable йому.

* Thread: Це клас, який уже реалізує Runnable. Якщо ви розширюєте клас Thread і перевизначаєте метод run(), ви можете
створити екземпляр цього класу і просто викликати метод start(), щоб запустити потік.

2) Приклад з Runnable:

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("This is from a Runnable!");
    }
}

public static void main(String[] args) {
    MyRunnable myRunnable = new MyRunnable();
    Thread thread = new Thread(myRunnable); // Передаємо екземпляр Runnable до Thread
    thread.start(); // Запускаємо потік
}


3) Приклад з Thread:

public class MyThread extends Thread {
    public void run() {
        System.out.println("This is from a Thread!");
    }
}

public static void main(String[] args) {
    MyThread myThread = new MyThread(); // Створюємо екземпляр класу
    myThread.start(); // Запускаємо потік
}


4) Чому у задачі краще використовувати Thread замість Runnable:

У завданні просять звертатися до методів потоку (наприклад, getName()) прямо у методі run(). Це значно простіше
робити, коли ви розширюєте Thread, оскільки ви можете безпосередньо звертатися до методів потоку.
Якщо б ви використовували Runnable, вам було б потрібно звертатися до поточного потоку через
Thread.currentThread().getName() замість просто getName().

5) Що краще використовувати?

Зазвичай рекомендують використовувати Runnable, оскільки це дозволяє вашому класу розширювати інші класи. В Java немає
підтримки багаторазового успадкування, тому якщо ви вже успадковуєте Thread, ваш клас не зможе успадкувати
жоден інший клас.
Але іноді, як у вашій задачі, розширення Thread може бути більш зручним.

*/