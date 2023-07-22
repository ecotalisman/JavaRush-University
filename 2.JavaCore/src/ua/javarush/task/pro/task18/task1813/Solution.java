package ua.javarush.task.pro.task18.task1813;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Майбутнє — за електромобілями
Сучасний світ відмовляється від двигунів внутрішнього згоряння, і ера електромобілів не за горами. Потрібно, щоб наша
програма могла відокремити електромобілі від усіх інших автомобілів.
Для цього є метод onlyElectricCars(ArrayList<Car>), який фільтрує список автомобілів, отриманий як вхідний параметр.
Цей метод повертає потік відфільтрованих даних, а саме потік автомобілів, у яких поле isElectric дорівнює true. У цьому
тобі допоможе метод filter() об'єкта типу Stream<Car>.

Метод main() під час тестування не перевіряється.

Requirements:
1. У публічному статичному методі onlyElectricCars(ArrayList<Car>) потрібно викликати метод filter() об'єкта типу Stream<Car>.
2. Потрібно, щоб метод onlyElectricCars(ArrayList<Car>) повертав потік електромобілів.
*/

public class Solution {

    public static void main(String[] args) {
        var cars = new ArrayList<Car>();
        Collections.addAll(cars,
                new Car("Range Rover", false),
                new Car("Model S", true),
                new Car("Navigator", false),
                new Car("Model 3", true),
                new Car("Camaro", false),
                new Car("Escalade", false),
                new Car("Mustang", false),
                new Car("Model X", true),
                new Car("X5", false),
                new Car("Model Y", true));

        var carStream = onlyElectricCars(cars);
        carStream.forEach(System.out::println);
    }

    public static Stream<Car> onlyElectricCars(ArrayList<Car> cars) {
        //напишіть тут ваш код - It was a condition:
//        return Stream.empty();

        // Change code here:
        Stream<Car> carStream = cars.stream()
                .filter(car -> (car.isElectric() == true));
        return carStream;
    }
}
