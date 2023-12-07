package ua.javarush.task.jdk13.task41.task4110;

import ua.javarush.task.jdk13.task41.task4110.builders.PizzaBuilder;
import ua.javarush.task.jdk13.task41.task4110.builders.PizzaRecipeBuilder;
import ua.javarush.task.jdk13.task41.task4110.director.Director;
import ua.javarush.task.jdk13.task41.task4110.pizzas.Pizza;
import ua.javarush.task.jdk13.task41.task4110.pizzas.Recipe;

/* 
Усі ходи записані
За допомогою патерну Будівельник будемо пекти піци та записувати їхні рецепти. Для піц та рецептів у нас буде два види
будівельників, а інтерфейс у них буде загальний.

1. Спочатку створи пакет builders, у ньому — інтерфейс Builder, а в ньому — чотири void методи:
setType(PizzaType type), setDough(String dough), setSauce(String sauce), setTopping(String topping).

2. У цьому ж пакеті створи два класи будівельників: PizzaBuilder та PizzaRecipeBuilder. Обидва повинні реалізовувати
інтерфейс Builder. У кожному має бути чотири приватні поля:
PizzaType type, String dough, String sauce, String topping.

Реалізуй методи інтерфейсу, щоб вони працювали як звичайні сеттери.
Крім того, кожному будівельнику додай метод getResult для отримання результату будівництва. Метод повинен повертати
Pizza та Recipe для відповідних будівельників. Для цього треба використовувати конструктори цих класів, передавши
значення полів будівельника.

3. Створи пакет director, а в ньому – клас Director. Додай до класу два публічні void методи:
makeHawaiianPizza(Builder builder) та makeSpicyPizza(Builder builder).

У makeHawaiianPizza виконай усі кроки будівельника, передавши до них значення:
HAWAIIAN, "звичайне", "м'який", "шинка + ананас".

У makeSpicyPizza виконай усі кроки будівельника, передавши до них значення:
SPICY, "запечене", "гострий", "пепероні + салямі".

Розкоментуй код у методі ain і перевір, чи все працює.

Щоб додати більше видів піци, треба додати значення до PizzaType та методи до них у Director.

Requirements:
1. У пакеті builders має бути інтерфейс Builder із чотирма методами згідно з умовою.
2. У пакеті builders має бути клас PizzaBuilder, реалізований відповідно до умови.
3. У пакеті builders має бути клас PizzaRecipeBuilder, реалізований відповідно до умови.
4. У пакеті director має бути клас Director, реалізований згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        Director director = new Director();

        PizzaBuilder builder = new PizzaBuilder();
        director.makeHawaiianPizza(builder);
        Pizza pizza = builder.getResult();
        System.out.println("Pizza made:\n" + pizza.getType());

        PizzaRecipeBuilder recipeBuilder = new PizzaRecipeBuilder();
        director.makeSpicyPizza(recipeBuilder);
        Recipe pizzaRecipe = recipeBuilder.getResult();
        System.out.println("\nPizza recipe made:\n" + pizzaRecipe.print());
    }
}
