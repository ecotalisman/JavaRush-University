package ua.javarush.task.jdk13.task41.task4119.strategy;

import ua.javarush.task.jdk13.task41.task4119.customer.Customer;

public class PaypalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PaypalStrategy(Customer customer) {
        this.email = customer.getEmail();
        this.password = customer.getPaypalPassword();
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Оплачено товарів на $%d за допомогою Paypal.\n", amount);
    }
}
