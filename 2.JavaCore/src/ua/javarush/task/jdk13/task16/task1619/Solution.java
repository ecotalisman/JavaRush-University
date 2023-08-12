package ua.javarush.task.jdk13.task16.task1619;

/* 
Розташуй виклики методів join()
1. Розберися, що робить програма.
2. Розташуй виклики методів join() таким чином, щоб для кожної кішки виконувалося таке:
2.1. Спочатку кішка народжує кошенят.
2.2. Потім усі кошенята вилізають із корзинки у довільному порядку.
2.3. Врешті кішка збирає їх назад до корзинки.
2.4. Усі події для однієї кішки можуть бути перемішані з подіями для іншої кішки.
2.5. Додати сон кошенят (200 мс) до investigateWorld.

Requirements:
1. У кожного кошеняти (об'єкта типу Kitten) потрібно викликати метод join.
2. Метод investigateWorld повинен забезпечувати сон кошеняти на 200 мс. Використовуй метод Thread.sleep(200).
3. Програма повинна створювати дві кішки та чотирьох кошенят.
4. Методи, відповідальні за виведення в консолі, не змінюй.
5. Виведення програми повинне відображати виконання вимог з умови завдання.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Пушинка");
    }

    private static void investigateWorld() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Кошеня 1, мама - " + getName());
            kitten2 = new Kitten("Кошеня 2, мама - " + getName());
            start();
        }

        public void run() {
            System.out.println(getName() + " народила 2 кошенят");
            try {
                initAllKittens();
            } catch (InterruptedException ignore) {
            }
            System.out.println(getName() + ": Усі кошенята в корзинці. " + getName() + " зібрала їх назад");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten2.start();

            // Write code here:
            kitten1.join();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + ", виліз із корзинки");
            investigateWorld();
        }
    }
}

/*

    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка");
        cat1.join();
        Cat cat2 = new Cat("Пушинка");
        cat2.join();
    }


пропозиція змінити метод main з таким викликом join() гарантує послідовний порядок виконання коду для двох кішок:
спочатку повна послідовність для "Мурки", а потім повна послідовність для "Пушинки". Однак це суперечить умові завдання.

Згідно з умовами завдання:

2.4. Усі події для однієї кішки можуть бути перемішані з подіями для іншої кішки.

Тому, якщо використати join() у методі main для кожної кішки, то події для "Мурки" завжди будуть відбуватися до подій
для "Пушинки". Тобто, "Мурка" завершить усю свою активність (народить кошенят, кошенята досліджуватимуть світ, а потім
повернуться назад до корзинки) перед тим, як "Пушинка" почне свою активність.


private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten2.start();

            // Write code here:
            kitten1.join();
            kitten2.join();
        }

Додаванням join() лише до кошенят в методі initAllKittens гарантує, що кожна кішка дочекається, коли її кошенята
завершать дослідження світу, перед тим як зібрати їх назад. Але від цього моменту активність "Мурки" може переплітатися
з активністю "Пушинки", що відповідає умовам завдання.

*/