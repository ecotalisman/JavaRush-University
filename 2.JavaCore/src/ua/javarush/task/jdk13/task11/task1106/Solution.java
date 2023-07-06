package ua.javarush.task.jdk13.task11.task1106;

/* 
Як кішка з собакою
Приховай усі внутрішні змінні класу Cat та Dog.
Також приховай усі методи, окрім тих, за допомогою яких ці класи взаємодіють один з одним.

Requirements:
1. Змінні класу Cat мають бути прихованими.
2. Змінні класу Dog мають бути прихованими.
3. Методи класу Cat мають бути прихованими.
4. Методи класу Dog мають бути прихованими.
5. Методи, за допомогою яких класи Cat і Dog взаємодіють один з одним, мають бути публічними.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    // It was a condition:
//    public String name;
//    public int speed;

    // Write code here:
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    // It was a condition:
//    public String getName() {
//        return name;
//    }

    // Write code here:
    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog {
    // It was a condition:
//    public String name;
//    public int speed;

    // Write code here:
    private String name;
    private int speed;

    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // It was a condition:
//    public String getName() {
//        return name;
//    }

    // Write code here:
    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}



