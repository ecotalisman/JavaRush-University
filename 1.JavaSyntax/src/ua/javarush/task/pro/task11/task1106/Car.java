package ua.javarush.task.pro.task11.task1106;

/* 
Однакові машини
У давні-прадавні часи всі машини мали однакові назви. І от одного чудового дня директорові автомобільного заводу
набридла одноманітність, і він видав наказ: називати моделі автомобілів по-різному.
Отже, як можна здогадатися, твоє завдання полягає в тому, щоб допомогти головному інженерові виправити програму
виробництва машин так, щоб кожному об'єкту-машині можна було присвоїти унікальне ім'я.

Requirements:
1. Поле modelName класу Car має бути нестатичним.
2. Гетер і сетер для поля modelName мають бути виправлені.
*/

public class Car {

//      Was condition:
//    private static String modelName;
    private String modelName;
    private int speed;

//      Was condition:
//    public static String getModelName() {
//        return modelName;
//    }
//
//    public static void setModelName(String modelName) {
//        Car.modelName = modelName;
//    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
