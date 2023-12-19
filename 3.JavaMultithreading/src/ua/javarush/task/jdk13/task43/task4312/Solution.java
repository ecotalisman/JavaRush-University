package ua.javarush.task.jdk13.task43.task4312;

import java.util.Set;

/* 
Антихакер
Хакери намагаються підірвати основи будови світу. Стань їм на заваді!

Зміни метод getLaws таким чином, щоб метод hackTheUniverse вивів рядок "Всесвіт захищений краще, ніж ми думали...".

Requirements:
1. Клас Solution не повинен змінюватися.
2. Метод getLaws має повертати рядки з множини laws.
3. Метод getLaws потрібно змінити таким чином, щоб метод hackTheUniverse вивів рядок: "Всесвіт захищений краще, ніж ми думали..."
*/

public class Solution {

    public static void main(String[] args) {
        hackTheUniverse();
        Universe.getInstance().getLaws().forEach(System.out::println);
    }

    public static void hackTheUniverse() {
        Set<String> laws = Universe.getInstance().getLaws();
        try {
            laws.removeAll(laws);
            laws.add("Все, що може піти не так, піде не так.");
            laws.add("Сусідня черга завжди рухається швидше.");
            laws.add("Робота заповнює час, відведений на неї.");
            laws.add("90% чого завгодно - нісенітниця.");
            laws.add("Де працює закон підлості, там відпочиває теорія ймовірності.");
        } catch (Exception e) {
            System.out.println("Всесвіт захищений краще, ніж ми думали...");
        }
    }
}
