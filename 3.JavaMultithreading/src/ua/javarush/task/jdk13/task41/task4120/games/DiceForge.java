package ua.javarush.task.jdk13.task41.task4120.games;

import java.util.Random;

public class DiceForge extends BoardGame {
    @Override
    protected void initialize() {
        System.out.println("""
                ------------------------------------------------------------------------------------------
                Підготовка до гри Грані долі:
                    - Розкладаємо карти подвигів по островах;
                    - роздаємо гравцям планшети героя, маркери ресурсів, фішку героя, два стартові кубики;
                    – готуємо поле храму.""");
    }

    @Override
    protected void play() {
        System.out.println("Гравці кидають кубики, апгрейдять кубики, кидають кубики, здійснюють подвиги, кидають кубики...");
    }

    @Override
    protected void end() {
        System.out.println("Закінчився останній раунд, час підрахувати очки слави.");
    }

    // It was a condition:
//    private int playersAmount;
//
//    public final void start(int playersAmount) {
//        this.playersAmount = playersAmount;
//
//        System.out.println("""
//                ------------------------------------------------------------------------------------------
//                Підготовка до гри Грані долі:
//                    - Розкладаємо карти подвигів по островах;
//                    - роздаємо гравцям планшети героя, маркери ресурсів, фішку героя, два стартові кубики;
//                    – готуємо поле храму.""");
//        System.out.println("Гравці кидають кубики, апгрейдять кубики, кидають кубики, здійснюють подвиги, кидають кубики...");
//        System.out.println("Закінчився останній раунд, час підрахувати очки слави.");
//        System.out.println("Переміг гравець № " + (new Random().nextInt(playersAmount) + 1));
//    }
}
