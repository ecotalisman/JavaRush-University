package ua.javarush.task.jdk13.task41.task4102;

/* 
Фірмовий рецепт

Зараз метод main робить найпростішу піцу. Давай використаємо патерн декоратор, щоб урізноманітнити асортимент.

Спочатку створи клас PizzaDecorator. Він має бути абстрактним та реалізовувати інтерфейс Pizza.
У нього має бути приватне фінальне поле decoratedPizza типу Pizza, яке ініціалізується в конструкторі.
Реалізуй методи getCost та getIngredients: вони повинні викликати відповідні методи у decoratedPizza.

Далі створи три класи: WithChicken, WithSausage, WithArugula. Нехай вони всі успадковують PizzaDecorator.
Їхні конструктори повинні просто викликати конструктор батьківського класу. Перевизнач методи:

у WithChicken метод getCost додає до вартості 20, метод getIngredients додає до інгредієнтів ", курка";
у WithSausage метод getCost додає до вартості 25, метод getIngredients додає до інгредієнтів ", ковбаса";
у WithArugula метод getCost додає до вартості 15, метод getIngredients додає до інгредієнтів ", рукола".
Розкоментуй код у методі main і подивися, що вийшло.
Додай ще декораторів для улюблених інгредієнтів і придумай, як покращити програму.

Requirements:
1. Pizza та SimplePizza не повинні змінюватися.
2. У кореневій папці завдання має бути абстрактний клас PizzaDecorator, який реалізує Pizza.
3. У класі PizzaDecorator має бути приватне фінальне поле decoratedPizza типу Pizza, яке ініціалізується у конструкторі.
4. У класі PizzaDecorator мають бути реалізовані методи інтерфейсу Pizza згідно з умовою завдання.
5. У кореневій папці завдання повинні бути класи WithChicken, WithSausage, WithArugula, які успадковують PizzaDecorator.
6. У класах WithChicken, WithSausage, WithArugula повинні бути реалізовані конструктори та методи getCost та
getIngredients відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        printInfo(pizza);

        pizza = new WithChicken(pizza);
        printInfo(pizza);

        pizza = new WithSausage(pizza);
        printInfo(pizza);

        pizza = new WithArugula(pizza);
        printInfo(pizza);
    }

    public static void printInfo(Pizza c) {
        System.out.println("Разом: " + c.getCost() + "; Склад: " + c.getIngredients());
    }
}
