package ua.javarush.task.jdk13.task13.task1301;

/* 
Пиво
У цьому завданні тобі потрібно:
Подумати, який з двох інтерфейсів потрібно реалізувати в класі BeerLover.
Додати до класу BeerLover цей інтерфейс і реалізувати всі його методи.
Подумати, як пов'язані змінна READY_TO_GO_HOME та метод isReadyToGoHome.
Повернути значення змінної READY_TO_GO_HOME у методі isReadyToGoHome.

Requirements:
1. Клас BeerLover має реалізувати(implements) інтерфейс Alcoholic.
2. Клас BeerLover не повинен реалізувати інтерфейс Drinker напряму (лише опосередковано - через Alcoholic)
3. У класі BeerLover мають бути реалізовані всі методи інтерфейсу Alcoholic.
4. У класі BeerLover мають бути реалізовані всі методи інтерфейсу Drinker.
5. Метод isReadyToGoHome має повертати значення змінної READY_TO_GO_HOME.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {

        @Override
        public void askForMore(String message) {

        }

        @Override
        public void sayThankYou() {

        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {

        }
    }
}
