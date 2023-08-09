package ua.javarush.task.jdk13.task16.task1622;

/* 
Аеропорт
1. Розберися, що робить програма.
2. Виправ метод takingOff(зліт) - зараз він працює дууууже довго. Зліт повинен займати 100 мілісекунд.
3. Реалізуй метод waiting по аналогії з методом takingOff.

Requirements:
1. Метод takingOff повинен працювати приблизно 100 мс.
2. Метод waiting повинен працювати приблизно 100 мс.
3. У методі main має створюватися 3 літаки.
4. У класі Solution має бути вкладений клас Plane (літак).
5. У класі Solution має бути вкладений клас Runway (злітна смуга).
*/

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // злітна смуга

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Літак #1");
        Plane plane2 = new Plane("Літак #2");
        Plane plane3 = new Plane("Літак #3");
    }

    private static void waiting() {
        // напишіть тут ваш код
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void takingOff() {
        // виправ цей метод

        // It was a condition:
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException ignore) {
//        }

        // Change code here:
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignore) {
            throw new RuntimeException(ignore);
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean isAlreadyTakenOff = false;
            while (!isAlreadyTakenOff) {
                if (RUNWAY.trySetTakingOffPlane(this)) {    // якщо злітна смуга вільна, займаємо її
                    System.out.println(getName() + " злітає");
                    takingOff();// злітає
                    System.out.println(getName() + " вже в небі");
                    isAlreadyTakenOff = true;
                    RUNWAY.setTakingOffPlane(null);
                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  // якщо злітна смуга зайнята літаком
                    System.out.println(getName() + " очікує");
                    waiting(); // очікує
                }
            }
        }
    }

    public static class Runway { // злітна смуга
        private Thread t;

        public Thread getTakingOffPlane() {
            return t;
        }

        public void setTakingOffPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetTakingOffPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

