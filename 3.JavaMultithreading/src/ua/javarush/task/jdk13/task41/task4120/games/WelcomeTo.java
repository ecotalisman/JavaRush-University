package ua.javarush.task.jdk13.task41.task4120.games;

import java.util.Random;

public class WelcomeTo extends BoardGame {
    @Override
    protected void initialize() {
        System.out.println("""
                -----------------------------------------------------
                Підготовка до гри Паперові квартали:
                    - роздаємо гравцям ігрові поля та кулькові ручки;
                    - випадковим чином вибираємо три плани забудови;
                    - готуємо три стоси карт будівництва.""");
    }

    @Override
    protected void play() {
        System.out.println("Гравці будують житлові квартали з парками та басейнами, наймають торгових агентів та заробітчан.");
    }

    @Override
    protected void end() {
        System.out.println("Один із гравців виконав усі три плани забудови.");
    }

    // It was a condition:
//    private int playersAmount;
//
//    public final void start(int playersAmount) {
//        this.playersAmount = playersAmount;
//
//        System.out.println("""
//                -----------------------------------------------------
//                Підготовка до гри Паперові квартали:
//                    - роздаємо гравцям ігрові поля та кулькові ручки;
//                    - випадковим чином вибираємо три плани забудови;
//                    - готуємо три стоси карт будівництва.""");
//        System.out.println("Гравці будують житлові квартали з парками та басейнами, наймають торгових агентів та заробітчан.");
//        System.out.println("Один із гравців виконав усі три плани забудови.");
//        System.out.println("Переміг гравець № " + (new Random().nextInt(playersAmount) + 1));
//    }
}
