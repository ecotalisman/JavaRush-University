package ua.javarush.task.jdk13.task12.task1217;

/* 
Летимо!
Напиши свій public інтерфейс CanFly(літати).
Додай до нього два методи.

Requirements:
1. Клас Solution має містити інтерфейс CanFly.
2. Інтерфейс CanFly має бути публічним.
3. Інтерфейс CanFly повинен містити два методи.
4. У інтерфейса CanFly не має бути батька.
*/

public class Solution {
    public static void main(String[] args) {

    }

    // add an interface here - додай інтерфейс тут
    public interface CanFly {
        void runFly();

       void stopFly();
    }

}
