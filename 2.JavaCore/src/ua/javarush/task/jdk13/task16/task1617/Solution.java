package ua.javarush.task.jdk13.task16.task1617;

/* 
Просування на політичних дебатах
1. Розберися, що робить програма.
2. Потрібно зробити так, щоб Іванов виказав найбільше промов на політичних дебатах.
3. Подумай, який метод можна викликати в об'єкта ivanov, щоб Іванов розмовляв, допоки не скінчиться весь вільний час.


Requirements:
1. Виклич метод join у потрібного об'єкта.
2. Метод toString класу політик Politician має виводити, скільки промов виголосив політик, наприклад: "Іванов виказав промову 35 разів".
3. Програма повинна створювати 3 об'єкти типу Politician.
4. Методи, що відповідають за виведення в консолі, не змінюй.
5. Виведення програми повинне свідчити про те, що Іванов виголосив більше за всіх промов на політичних дебатах.
*/

public class Solution {
    public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician ivanov = new Politician("Іванов");
        ivanov.join();

        Politician petrov = new Politician("Петров");
        Politician sidorov = new Politician("Сидоров");

        while (ivanov.getSpeechCount() + petrov.getSpeechCount() + sidorov.getSpeechCount() < totalSpeechCount) {
        }

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politician extends Thread {
        private volatile int utteranceCount;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s виголосив промову %d раз", getName(), getSpeechCount());
        }
    }
}

