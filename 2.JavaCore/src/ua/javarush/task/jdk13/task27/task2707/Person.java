package ua.javarush.task.jdk13.task27.task2707;

public class Person implements Runnable {
    private final Mail mail;

    public Person(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            Thread.sleep(1000);
            // напишіть тут ваш код
            synchronized (mail) {
                mail.setText("Person [" + name + "] wrote an email 'AAA'");
                mail.notifyAll();
            }
            // напишіть тут ваш код
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
