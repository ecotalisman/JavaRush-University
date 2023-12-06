package ua.javarush.task.jdk13.task41.task4105.facade;

import ua.javarush.task.jdk13.task41.task4105.alchemy_library.*;

public class PotionConversionFacade {

    public String convertPotion(String potionName, String convertTo) {
        System.out.println("PotionConversionFacade: conversion started.");
        Potion potion = new Potion(potionName);
        Type type = Type.valueOf(convertTo.toUpperCase());
        Essence sourceEssence = EssenceFactory.extract(potion);
        Essence destinationEssence;

        destinationEssence = switch (type) {
            case MANA -> new ManaEssenceConverter();
            case STAMINA -> new StaminaEssenceConverter();
            default -> new HealingEssenceConverter();
        };

        Potion portion = Extractor.extractPortion(potion, sourceEssence);
        Potion intermediateResult = Extractor.convert(portion, destinationEssence);
        Potion result = new Finalizator().fix(intermediateResult);

        System.out.println("PotionConversionFacade: conversion completed.");

        return result.getName();
    }
}
