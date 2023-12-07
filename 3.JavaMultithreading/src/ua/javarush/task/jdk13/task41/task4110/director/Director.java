package ua.javarush.task.jdk13.task41.task4110.director;

import ua.javarush.task.jdk13.task41.task4110.builders.Builder;

import static ua.javarush.task.jdk13.task41.task4110.pizzas.PizzaType.*;

public class Director {
    public void makeHawaiianPizza(Builder builder) {
        builder.setType(HAWAIIAN);
        builder.setDough("звичайне");
        builder.setSauce("м'який");
        builder.setTopping("шинка + ананас");
    }

    public void makeSpicyPizza(Builder builder) {
        builder.setType(SPICY);
        builder.setDough("запечене");
        builder.setSauce("гострий");
        builder.setTopping("пепероні + салямі");
    }
}
