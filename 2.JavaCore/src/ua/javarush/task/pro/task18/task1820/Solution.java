package ua.javarush.task.pro.task18.task1820;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/* 
Найдорожча автівка
Автомобіль, представлений класом Car, має дві характеристики: назву — поле name і ціну — поле price.
У класі Solution виконуються дві операції пошуку:

метод getMostExpensiveCar(Stream<Car>) шукає найдорожчий автомобіль в одному списку;
метод getMoreExpensiveCar(Stream<Car>, Car) в іншому списку шукає автомобіль дорожчий, ніж отриманий у методі
getMostExpensiveCar(Stream<Car>).
Методи повертають не сам автомобіль (об'єкт типу Car), а об'єкт типу Optional<Car>.
Підказка:
Для пошуку елемента з максимальним шуканим значенням у потоці даних використовуй метод max(), а щоб знайти
перший-ліпший відповідний елемент із потоку відфільтрованих даних, використовуй метод findFirst().

Метод main() під час тестування не перевіряється.

Requirements:
1. У публічному статичному методі getMostExpensiveCar(Stream<Car>) потрібно викликати метод max() об'єкта типу Stream<Car>.
2. У публічному статичному методі getMoreExpensiveCar(Stream<Car>, Car) потрібно викликати метод findFirst() об'єкта типу Stream<Car>.
3. Метод getMostExpensiveCar(Stream<Car>) потрібно реалізувати згідно з умовою.
4. Метод getMoreExpensiveCar(Stream<Car>, Car) потрібно реалізувати згідно з умовою.
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
                new Car("X7", 143_000),
                new Car("X6", 125_000)
        );

        Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);

        Optional<Car> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
        moreExpensiveCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getMostExpensiveCar(Stream<Car> cars) {
        //напишіть тут ваш код - It was a condition:
//        return Optional.empty();

        // Change code here:
        return cars.max(Comparator.comparingInt(Car::getPrice));
    }

    public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars, Car mostExpensiveCar) {
        //напишіть тут ваш код - It was a condition:
//        return Optional.empty();

        // Change code here:
        return cars.filter(car -> car.getPrice() > mostExpensiveCar.getPrice())
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

/*

Давайте розберемо детально, як працює цей код:

public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars, Car mostExpensiveCar) {
    return cars.filter(car -> car.getPrice() > mostExpensiveCar.getPrice())
               .findFirst();
}

1) Stream<Car> cars: це потік об'єктів типу Car, який був переданий до методу getMoreExpensiveCar як параметр. Уявімо,
що це список автомобілів, які ми хочемо перевірити.

2) Car mostExpensiveCar: це об'єкт типу Car, який також передається в метод як параметр. Це найбільш дорогий автомобіль,
який ми знайшли до цього.

3) cars.filter(car -> car.getPrice() > mostExpensiveCar.getPrice()): Це вираз з функцією filter, яка приймає
лямбда-функцію як аргумент. Лямбда-функція - це просто функція, яка передається в іншу функцію як аргумент.
У даному випадку, ця лямбда-функція приймає об'єкт car і перевіряє, чи є його ціна вище, ніж ціна mostExpensiveCar.
Якщо ціна вища, то car залишається у потоці, якщо нижча - видаляється з потоку.

4) findFirst(): Після виконання фільтрації, у потоці залишаються тільки автомобілі з ціною вище, ніж у mostExpensiveCar.
Метод findFirst просто повертає перший автомобіль з цього потоку. Якщо жодного автомобіля не знайдено
(тобто, жоден автомобіль в потоці не був дорожчим, ніж mostExpensiveCar), то findFirst поверне Optional.empty.

Отже, виконується така логіка: "З переліку всіх автомобілів, знайди перший, який дорожчий за заданий автомобіль".
Якщо такий автомобіль існує, він повертається як Optional<Car>, якщо не існує - повертається Optional.empty.


В цьому випадку, mostExpensiveCar - це автомобіль, який був знайдений в результаті виконання методу getMostExpensiveCar.

Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);

Тут, ми створюємо новий об'єкт Optional<Car> і називаємо його mostExpensiveCar. Цей об'єкт був створений викликом
методу getMostExpensiveCar, до якого ми передали потік автомобілів (tesla). Цей метод повернув нам Optional<Car>,
який містить найдорожчий автомобіль з потоку tesla (або Optional.empty(), якщо потік був порожнім).

Згодом ми використовуємо цей об'єкт mostExpensiveCar як параметр при виклику методу getMoreExpensiveCar, щоб знайти
автомобіль, який дорожчий, ніж найдорожчий автомобіль з потоку tesla:

Optional<Car> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));

Тут важливо зрозуміти, що об'єкт mostExpensiveCar живе всередині області видимості методу main і зберігається поки
виконується цей метод. Коли метод main закінчується, об'єкт mostExpensiveCar видаляється з пам'яті.

*********************************************************************************************************************************

Метод flatMap використовується з Optional для того, щоб застосувати функцію до значення, якщо воно присутнє,
і повернути новий Optional. Головна особливість flatMap полягає в тому, що він приймає функцію, яка вже повертає
Optional. В результаті виходу, ми отримуємо "сплюснений" (flat) Optional, тобто не Optional<Optional<T>>, а просто Optional<T>.

Наприклад, у випадку коду mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car)):

1) Якщо mostExpensiveCar є пустим (тобто не містить автомобіль), flatMap просто повертає пустий Optional.
2) Якщо mostExpensiveCar містить автомобіль, flatMap застосовує функцію car -> getMoreExpensiveCar(bmw, car) до автомобіля.
Ця функція вже повертає Optional<Car>, тому flatMap просто повертає результат функції без додаткового огортання в Optional.

Загалом, метод flatMap допомагає нам уникнути "забагато вкладених" Optional і забезпечує більш зрозумілий і читабельний код.
*/