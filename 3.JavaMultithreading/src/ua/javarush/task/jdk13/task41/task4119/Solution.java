package ua.javarush.task.jdk13.task41.task4119;

import ua.javarush.task.jdk13.task41.task4119.customer.Customer;
import ua.javarush.task.jdk13.task41.task4119.shop.Item;
import ua.javarush.task.jdk13.task41.task4119.shop.ShoppingCart;
import ua.javarush.task.jdk13.task41.task4119.strategy.CashStrategy;
import ua.javarush.task.jdk13.task41.task4119.strategy.CreditCardStrategy;
import ua.javarush.task.jdk13.task41.task4119.strategy.PaypalStrategy;

import java.time.LocalDate;

import static java.util.Calendar.SEPTEMBER;
import static ua.javarush.task.jdk13.task41.task4119.shop.PaymentType.*;

/* 
Стратегічний шопінг

За допомогою патерну Стратегія позбудься оператора switch у методі pay класу ShoppingCart.

1. У кореневій папці завдання створи пакет strategy, а в ньому — інтерфейс PaymentStrategy з одним методом – void pay(int amount).

2. У пакеті strategy створи класи конкретних стратегій, що реалізують PaymentStrategy: CashStrategy, CreditCardStrategy
та PaypalStrategy. До їхніх методів pay помісти відповідний код з оператора switch.

- У CashStrategy має бути конструктор за замовчуванням.

- CreditCardStrategy має чотири приватні поля: String name, String cardNumber, int cvv, LocalDate expiryDate, та конструктор
з одним параметром типу Customer, який ініціалізує ці поля.

- PaypalStrategy має два приватні поля: String email, String password та конструктор з одним параметром типу Customer,
який ініціалізує ці поля.

3. У класі ShoppingCart створи приватне поле PaymentStrategy strategy, створи для нього геттер та сеттер.
Видали поля customer та type. Зміни конструктор ShoppingCart: залиши йому один параметр PaymentStrategy та ініціалізуй
у ньому поле strategy. У методі pay замість оператора switch переадресуй виклик полю strategy.
Перелік PaymentType можна видалити.

4. У методі main зміни створення об'єктів ShoppingCart: передавай до конструктора об'єкт необхідної стратегії.

Requirements:
1. Класи CreditCard, Customer, PaypalAccount та Item не повинні змінюватися.
2. У пакеті strategy має існувати інтерфейс PaymentStrategy з методом void pay(int).
3. У пакеті strategy має існувати клас CashStrategy, реалізований згідно з умовою завдання.
4. У пакеті strategy має існувати клас CreditCardStrategy, реалізований згідно з умовою.
5. У пакеті strategy має існувати клас PaypalStrategy, реалізований відповідно до умови.
6. Клас ShoppingCart має бути змінено відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) {
        Customer customer = new Customer("Панас Мирний", "panas.m@example.com", "1234-5678-9012-3456",
                786, LocalDate.of(2026, SEPTEMBER, 1), "mypwd");

        // It was a condition:
//        ShoppingCart cart1 = new ShoppingCart(customer, CASH);

        ShoppingCart cart1 = new ShoppingCart(new CashStrategy());
        cart1.addItem(new Item(847, "Електрична зубна щітка", 12));
        cart1.addItem(new Item(939, "Тример", 19));
        cart1.pay();

        // It was a condition:
//        ShoppingCart cart2 = new ShoppingCart(customer, PAYPAL);

        ShoppingCart cart2 = new ShoppingCart(new PaypalStrategy(customer));
        cart2.addItem(new Item(2621, "Електричний термометр", 9));
        cart2.addItem(new Item(923, "Купальний костюм", 39));
        cart2.pay();

        // It was a condition:
//        ShoppingCart cart3 = new ShoppingCart(customer, CREDIT_CARD);

        ShoppingCart cart3 = new ShoppingCart(new CreditCardStrategy(customer));
        cart3.addItem(new Item(285, "Блайзер", 5));
        cart3.addItem(new Item(266, "Велосипед", 149));
        cart3.pay();
    }
}
