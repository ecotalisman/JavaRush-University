package ua.javarush.task.jdk13.task23.task2305;

/* 
Повторюємо threads
Зроби так, щоб у методі someActions викликалися лише методи класу Solution.

У методе main очікуємо побачити таке:
Amigo: Mmmmm, beef
Amigo: knock knock
Amigo: Zzzzzzz...1 s

Requirements:
1. Виведення на екран має бути відповідним до умови завдання.
2. У методі someActions має бути викликано метод sleep класу Solution.
3. У класі Solution має бути поле name.
4. У класі Solution має бути поле food.
5. У класі Solution має бути поле sound.
*/

public class Solution {
    public final String name;
    public final String food;
    public final String sound;

    public Solution(String name, String food, String sound) {
        this.name = name;
        this.food = food;
        this.sound = sound;
    }

    public void eat() {
        System.out.println(name + ": Mmmmm, " + food);
    }

    public void play() {
        System.out.println(name + ": " + sound + " " + sound);
    }

    public void sleep(long milliseconds) {
        System.out.println(name + ": Zzzzzzz..." + (milliseconds / 1000) + " s");
    }

    public void live() throws InterruptedException {
        Thread thread = new Thread() {
            public void run() {
                try {
                    someActions();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            private void someActions() throws InterruptedException {
                eat();
                play();

                // It was a condition:
//                sleep(1000);

                // Change code here:
                Solution.this.sleep(1000);
            }
        };
        thread.start();
        thread.join();
    }

    public static void main(String[] args) throws InterruptedException {
        new Solution("Amigo", "beef", "knock").live();
    }
}
