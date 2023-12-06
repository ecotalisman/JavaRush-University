package ua.javarush.task.jdk13.task41.task4105;

import ua.javarush.task.jdk13.task41.task4105.facade.PotionConversionFacade;


/* 
Алхімічна бібліотека
Пакет alchemy_library містить бібліотеку, яка емулює перетворення одного зілля на інше того ж розміру.
Метод main містить код клієнта, і він трохи заплутаний. Тобі потрібно створити фасад із більш простим інтерфейсом.

У кореневій папці завдання створи пакет facade, а в ньому – клас PotionConversionFacade. Всередині створи метод
public String convertPotion(String potionName, String convertTo). Він повинен приймати назву початкового зілля та
тип зілля, яке треба отримати, а повертати – назву нового отриманого зілля.
Перенеси весь клієнтський код з main до convertPotion. У виведенні в консолі заміни "Client Code:" на "PotionConversionFacade:".

Що має залишитися у main:

створення об'єкту фасаду;
виклик convertPotion з полями potionName та type як параметри;
виведення на екран результату convertPotion.

Requirements:
1. Класи пакету alchemy_library не повинні змінюватись.
2. У пакеті facade має бути клас PotionConversionFacade.
3. У класі PotionConversionFacade повинен бути метод convertPotion, реалізований відповідно до умови.
4. Метод main повинен бути реалізований згідно з умовою.
*/

public class Solution {
    public static String potionName = "Minor Healing Potion";
    public static String type = "stamina";

    public static void main(String[] args) {
        // It was a condition:
//        System.out.println("Client Code: conversion started.");
//        Potion potion = new Potion(potionName);
//        Type type = Type.valueOf(Solution.type.toUpperCase());
//        Essence sourceEssence = EssenceFactory.extract(potion);
//        Essence destinationEssence;
//        if (type == MANA) {
//            destinationEssence = new ManaEssenceConverter();
//        } else if (type == STAMINA) {
//            destinationEssence = new StaminaEssenceConverter();
//        } else {
//            destinationEssence = new HealingEssenceConverter();
//        }
//        Potion portion = Extractor.extractPortion(potion, sourceEssence);
//        Potion intermediateResult = Extractor.convert(portion, destinationEssence);
//        Potion result = new Finalizator().fix(intermediateResult);
//        System.out.println("Client Code: conversion completed.");
//
//        System.out.println(result.getName());

        // Change code here:
        PotionConversionFacade facade = new PotionConversionFacade();
        String result = facade.convertPotion(potionName, type);
        System.out.println(result);
    }
}
