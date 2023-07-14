package ua.javarush.task.jdk13.task11.task1108;

/* 
Граємо в Дарвіна
Зміни чотири класи: Fish (Риба), Animal (Тварина), Ape (Мавпа), Human (Людина).
Успадкуй тварину від риби, мавпу — від тварини й людину від мавпи.

Requirements:
1. У класі Solution має бути public клас Fish (Риба).
2. У класі Solution має бути public клас Animal (Тварина).
3. У класі Solution має бути public клас Ape (Мавпа).
4. У класі Solution має бути public клас Human (Людина).
5. Клас Animal має бути успадкованим від класу Fish.
6. Клас Ape має бути успадкованим від класу Animal.
7. Клас Human має бути успадкованим від класу Ape.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Fish {

    }

    public class Animal extends Fish {

    }

    public class Ape extends Animal {

    }

    public class Human extends Ape {

    }

}
