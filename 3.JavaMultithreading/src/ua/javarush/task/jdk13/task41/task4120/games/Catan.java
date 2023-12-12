package ua.javarush.task.jdk13.task41.task4120.games;

import java.util.Random;

public class Catan extends BoardGame {

    @Override
    protected void initialize() {
        System.out.println("""
                ---------------------------------------------------------
                Підготовка до гри Колонізатори:
                    - Складаємо острів для колонізації;
                    - роздаємо гравцям фігурки поселень, міст та доріг;
                    - Розкладаємо колоди сировини та розвитку.""");
    }

    @Override
    protected void play() {
        System.out.println("Гравці колонізують острів, торгують ресурсами, крадуть ресурси, інтригують та вигадують різноманітні хитрощі...");
    }

    @Override
    protected void end() {
        System.out.println("Один із гравців набрав 10 переможних очок.");
    }


    // It was a condition:
//    private int playersAmount;
//
//    public final void start(int playersAmount) {
//        this.playersAmount = playersAmount;
//
//        System.out.println("""
//                ---------------------------------------------------------
//                Підготовка до гри Колонізатори:
//                    - Складаємо острів для колонізації;
//                    - роздаємо гравцям фігурки поселень, міст та доріг;
//                    - Розкладаємо колоди сировини та розвитку.""");
//        System.out.println("Гравці колонізують острів, торгують ресурсами, крадуть ресурси, інтригують та вигадують різноманітні хитрощі...");
//        System.out.println("Один із гравців набрав 10 переможних очок.");
//        System.out.println("Переміг гравець № " + (new Random().nextInt(playersAmount) + 1));
//    }
}
