package ua.javarush.task.jdk13.task41.task4119.shop;

import ua.javarush.task.jdk13.task41.task4119.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    // It was a condition:
//    private Customer customer;
//    private PaymentType type;
//    public ShoppingCart(Customer customer, PaymentType type) {
//        this.customer = customer;
//        this.type = type;
//    }

    // Change code here add field paymentStrategy and Constructor:
    private PaymentStrategy strategy;

    public ShoppingCart(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay() {
        int amount = calculateTotal();
        strategy.pay(amount);
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    // It was a condition:
//    public void pay() {
//        int amount = calculateTotal();
//        switch (type) {
//            case CASH:
//                // багато важливого коду
//                System.out.printf("Оплачено товарів на $%d готівкою.\n", amount);
//                break;
//            case PAYPAL:
//                // багато важливого коду
//                System.out.printf("Оплачено товарів на $%d за допомогою Paypal.\n", amount);
//                break;
//            case CREDIT_CARD:
//                // багато важливого коду
//                System.out.printf("Оплачено товарів на $%d кредитною карткою %s.\n", amount, customer.getCardNumber());
//                break;
//        }
//    }
}
