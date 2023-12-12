package ua.javarush.task.jdk13.task41.task4119.strategy;

public class CashStrategy implements PaymentStrategy {
    public CashStrategy() {
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Оплачено товарів на $%d готівкою.\n", amount);
    }
}
