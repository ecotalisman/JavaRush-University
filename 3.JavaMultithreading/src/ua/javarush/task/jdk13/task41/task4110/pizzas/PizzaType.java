package ua.javarush.task.jdk13.task41.task4110.pizzas;

public enum PizzaType {
    HAWAIIAN("Гавайська піца"),
    SPICY("Гостра піца");

    private final String title;

    PizzaType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
