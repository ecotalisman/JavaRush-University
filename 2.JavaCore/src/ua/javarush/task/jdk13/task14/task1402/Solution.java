package ua.javarush.task.jdk13.task14.task1402;

/* 
Bingo-2!
Виправ рядок 'Cat cat = new Cat();' таким чином, щоб програма вивела "Bingo!".

Requirements:
1. Клас Cat має реалізувати інтерфейс CanMove.
2. Клас Cat має бути батьківським класом класу TomCat.
3. У змінній cat має зберігатися об'єкт, який буде одночасно і CanMove, і Cat, і Tomcat.
4. Програма має виводити на екран: "Bingo!".
*/

public class Solution {
    public static void main(String[] args) {
        // It was a condition:
//        Cat cat = new Cat();

        // Change code here:
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof CanMove;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) {
            System.out.println("Bingo!");
        }
    }

    interface CanMove {
    }

    static class Cat implements CanMove {
    }

    static class TomCat extends Cat {

    }
}
