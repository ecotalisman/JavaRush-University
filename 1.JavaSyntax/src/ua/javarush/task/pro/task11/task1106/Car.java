package ua.javarush.task.pro.task11.task1106;

/* 
Однакові машини
*/

public class Car {
    private static String modelName;
    private int speed;

    public static String getModelName() {
        return modelName;
    }

    public static void setModelName(String modelName) {
        Car.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
