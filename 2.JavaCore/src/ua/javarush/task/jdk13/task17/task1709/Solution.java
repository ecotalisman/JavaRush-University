package ua.javarush.task.jdk13.task17.task1709;

/* 
Пропозиції
Без використання synchronized зроби так, щоб кількість зроблених та прийнятих пропозицій була однаковою.

Requirements:
1. Клас Solution повинен містити потік MakeProposal.
2. Клас Solution повинен містити потік AcceptProposal.
3. Клас Solution повинен містити публічну статичну змінну int proposal.
4. Програма не повинна містити synchronized методів чи synchronized блоків.
5. Змінна int proposal не повинна знаходитися в локальному кеші.
*/

public class Solution {
    public volatile static int proposal = 0;

    public static void main(String[] args) {
        new AcceptProposal().start();
        new MakeProposal().start();
    }

    public static class MakeProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                System.out.println("Зроблено пропозицію №" + (thisProposal + 1));
                proposal = ++thisProposal;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }

    public static class AcceptProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (thisProposal < 10) {
                if (thisProposal != proposal) {
                    System.out.println("Прийнято пропозицію №" + proposal);
                    thisProposal = proposal;
                }

            }
        }
    }
}

/*

Код представляє ситуацію, коли два потоки взаємодіють з глобальною змінною proposal. Потік MakeProposal збільшує
значення proposal, а потік AcceptProposal слідкує за змінами proposal і виводить повідомлення, коли воно змінюється.

Ось ключові моменти коду:

1) volatile: Змінна proposal оголошена як volatile, що гарантує, що останнє оновлене значення proposal буде доступне
для всіх потоків. Зокрема, це запобігає кешуванню значення proposal в локальній пам'яті потоку, що дозволяє іншому
потоку бачити актуальні зміни.

2) MakeProposal: Цей потік інкрементує значення proposal до того моменту, доки воно не досягне 10. Щоразу, коли
змінюється proposal, виводиться повідомлення про нову пропозицію.

3) AcceptProposal: Цей потік спостерігає за змінами proposal. Якщо воно змінюється, виводиться повідомлення про
прийняту пропозицію.

Таким чином, завдяки використанню ключового слова volatile, обидва потоки можуть взаємодіяти з однією і тією ж змінною
без потреби в синхронізації, гарантуючи її актуальність в обох потоках. Таким чином, програма відповідає всім
вимогам завдання.

*/