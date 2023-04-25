package ua.javarush.task.pro.task10.task1011;

import java.util.Objects;

/* 
Створюємо свій hashCode
Напиши свою реалізацію hashCode із використанням змінних model і year. Якщо ці поля у двох об'єктів однакові,
то має повертатися однаковий hashCode. Якщо правильно реалізувати метод hashCode, результат виведення має бути таким:
true
true
true
true
false
false


Requirements:
1. Не можна змінювати метод main.
2. У класі Car має бути перевизначено метод int hashCode().
3. Реалізуй метод hashCode так, щоб результат роботи програми відповідав умові.
*/

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    //напишіть тут ваш код

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + year;
        return result;
    }

    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 2020);
        Car lamborghini1 = new Car("Lamborghini", 2020);
        Car ferrari = new Car("Ferrari", 2020);
        Car ferrari1 = new Car("Ferrari", 2020);
        Car bugatti = new Car("Bugatti", 2020);
        Car bugatti1 = new Car("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
