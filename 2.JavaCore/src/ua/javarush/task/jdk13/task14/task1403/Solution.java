package ua.javarush.task.jdk13.task14.task1403;

/* 
Building и School
У цьому завданні тобі потрібно:

Правильно розставити успадкування між Building (будівля) та School (будівля школи).
Подумати, об'єкт якого класу мають повертати методи getSchool та getBuilding.
Змінити null на об'єкт класу Building або School.
Сігнатури методів getSchool() та getBuilding() не змінюй.

Requirements:
1. Клас School має успадкуватися від класу Building.
2. Метод getSchool() має повертати нову школу (School).
3. Метод getBuilding() має повертати нову будівлю (Building).
4. Клас School має бути статичним.
5. Клас Building має бути статичним.
*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        // змініть null на об'єкт класу Building або School
        return new School();
    }

    public static Building getBuilding() {
        // змініть null на об'єкт класу Building або School
        return new Building();
    }

    static class School extends Building /* Додайте сюди ваш код */ {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /* Додайте сюди ваш код */ {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
