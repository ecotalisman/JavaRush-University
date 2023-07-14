package ua.javarush.task.jdk13.task11.task1115;

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Шкарпетки", 34), new Product("Зубна паста", 85), new Product("Сік", 19));
        Market market = new Market("Ашан");
        market.setProducts(products);

        System.out.println(market.getProducts().get(0).getName());
    }
}
