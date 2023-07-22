package ua.javarush.task.pro.task18.task1818;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.stream.Stream;

/* 
Чи є прострочені товари?
У класі Solution метод hasExpiredProduct(Stream<Product>) повертає true, якщо у вхідному потоці товарів є щонайменше
один прострочений, і false, якщо таких товарів немає.

Для того щоб це перевірити, потрібно для кожного товару в потоці порівняти поле expirationDate (термін придатності)
типу LocalDate з поточною датою (статичний метод now() класу LocalDate). Якщо термін придатності менший (строго) за
поточну дату, то в цьому потоці є прострочені товари.
Для пошуку таких товарів у потоці використай метод anyMatch() об'єкта типу Stream<Product>.

Метод main() під час тестування не перевіряється.

Requirements:
1. У публічному статичному методі hasExpiredProduct(Stream<Product>) потрібно викликати метод anyMatch() об'єкта
типу Stream<Product>.
2. Метод hasExpiredProduct(Stream<Product>) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        var productStream = Stream.of(
                new Product("Milk", LocalDate.of(2020, Month.MARCH, 12)),
                new Product("Cheese", LocalDate.of(2020, Month.MARCH, 31)),
                new Product("Buckwheat", LocalDate.of(2021, Month.MARCH, 1)),
                new Product("Rice", LocalDate.of(2022, Month.MAY, 11)),
                new Product("Wine", LocalDate.of(2023, Month.JANUARY, 10)),
                new Product("Tea", LocalDate.of(2024, Month.AUGUST, 27)),
                new Product("Salt", LocalDate.of(2025, Month.DECEMBER, 15))
        );

        String answer = hasExpiredProduct(productStream) ? "Yes" : "No";
        System.out.println("Has stream expired products? " + answer);
    }

    public static boolean hasExpiredProduct(Stream<Product> productStream) {
        //напишіть тут ваш код
        return productStream.anyMatch(product -> product.getExpirationDate().isBefore(LocalDate.now()));
    }
}

class Product {
    private String name;
    private LocalDate expirationDate;

    public Product(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}

/*

Можна створити об'єкт LocalDate, представляючи будь-яку дату, використовуючи статичний метод of(). Цей метод приймає
рік, місяць і день місяця як аргументи.

Для задання дати 20 липня 2023 року, можна зробити наступне:

LocalDate specificDate = LocalDate.of(2023, Month.JULY, 20);

Також можна використати цю дату у методі hasExpiredProduct() для порівняння з датою придатності кожного товару замість
поточної дати:

public static boolean hasExpiredProduct(Stream<Product> productStream) {
    LocalDate specificDate = LocalDate.of(2023, Month.JULY, 20);
    return productStream.anyMatch(product -> product.getExpirationDate().isBefore(specificDate));
}

Тепер цей метод повертає true, якщо у вхідному потоці товарів є хоча б один товар, термін придатності якого
сплив до 20 липня 2023 року, і false, якщо таких товарів немає.

*/