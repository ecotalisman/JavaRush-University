package ua.javarush.task.jdk13.task14.task1401;

/* 
Bingo!
Виправ рядок 'Object animal = new Pet();' у методі main() таким чином, щоб програма вивела "Bingo!".

Requirements:
1. Клас Cat має успадковуватися від класу Pet.
2. Клас Tiger має успадковуватися від класу Cat.
3. У змінній Object animal має зберігатися об'єкт, який буде одночасно і Pet, і Cat, і Tiger.
4. Програма має виводити на екран: "Bingo!".
*/

public class Solution {
    public static void main(String[] args) {
        // It was a condition:
//        Object animal = new Pet();

        // Change code here:
        Object animal = new Tiger();
        boolean isCat = animal instanceof Cat;
        boolean isTiger = animal instanceof Tiger;
        boolean isPet = animal instanceof Pet;

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) {
            System.out.println("Bingo!");
        }
    }

    static class Pet {
    }

    static class Cat extends Pet {
    }

    static class Tiger extends Cat {
    }
}
