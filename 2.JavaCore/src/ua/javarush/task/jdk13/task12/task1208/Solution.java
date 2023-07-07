package ua.javarush.task.jdk13.task12.task1208;

/* 
Кесарю — кесарево
Перевизначи метод getChild у класах Cat(кіт) та Dog(собака), щоб кіт породжував кота, а собака — собаку.

Requirements:
1. Клас Cat має успадковуватися від класу Pet.
2. Клас Dog має успадковуватися від класу Pet.
3. Клас Cat має перевизначати метод getChild(), щоб кіт породжував кота.
4. Клас Dog має перевизначати метод getChild(), щоб собака породжувала собаку.
5. Метод main() має викликати метод getChild() в об'єкта типу Cat.
6. Метод main() має викликати метод getChild() в об'єкта типу Dog.
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        // Write code here:

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        // Write code here:

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
