package ua.javarush.task.pro.task18.task1821;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/* 
Найдешевша автівка
Автомобіль, представлений класом Car, має дві характеристики: назву — поле name і ціну — поле price.
У класі Solution виконуються дві операції пошуку:

метод getCheapestCar(Stream<Car>) шукає найдешевший автомобіль в одному списку;
метод getCheaperCar(Stream<Car>, Car) в іншому списку шукає автомобіль дешевший, ніж отриманий у методі
getCheapestCar(Stream<Car>).
Методи повертають не сам автомобіль (об'єкт типу Car), а об'єкт типу Optional<Car>.

Підказка:
Для пошуку елемента з мінімальним шуканим значенням у потоці даних використовуй метод min(), а щоб знайти
перший-ліпший відповідний елемент із потоку відфільтрованих даних, використовуй метод findFirst().

Метод main() під час тестування не перевіряється.

Requirements:
1. У публічному статичному методі getCheapestCar(Stream<Car>) потрібно викликати метод min() об'єкта типу Stream<Car>.
2. У публічному статичному методі getCheaperCar(Stream<Car>, Car) потрібно викликати метод findFirst() об'єкта типу Stream<Car>.
3. Метод getCheapestCar(Stream<Car>) потрібно реалізувати згідно з умовою.
4. Метод getCheaperCar(Stream<Car>, Car) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car("X5", 110_000),
                new Car("X3", 54_000),
                new Car("X1", 40_000),
                new Car("X6", 125_000)
        );

        Optional<Car> cheapestCar = getCheapestCar(tesla);
        cheapestCar.ifPresent(System.out::println);

        Optional<Car> cheaperCar = cheapestCar.flatMap(car -> getCheaperCar(bmw, car));
        cheaperCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getCheapestCar(Stream<Car> cars) {
        //напишіть тут ваш код - It was a condition:
//        return Optional.empty();

        // Change code here:
        return cars.min(Comparator.comparingInt(Car::getPrice));
    }

    public static Optional<Car> getCheaperCar(Stream<Car> cars, Car cheapestCar) {
        //напишіть тут ваш код - It was a condition:
//        return Optional.empty();

        // Change code here:
        return cars.filter(car -> car.getPrice() < cheapestCar.getPrice())
                .findFirst();
    }
}

class Car {
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобіль " + name + ", ціна - " + price + " USD";
    }
}
