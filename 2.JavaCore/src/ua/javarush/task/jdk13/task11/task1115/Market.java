package ua.javarush.task.jdk13.task11.task1115;

import java.util.List;

/* 
Агрегація 2
Потрібно реалізувати зв'язок типу агрегація (непрямий зв'язок) між класами Market та Product, враховуючи те, що продукт
може існувати незалежно від магазина, а магазин може містити заповений або порожній список продуктів. Також має бути
можливість цей список отримати та змінити.

Requirements:
1. Клас Market має бути реалізований згідно з умовою задачі.
2. Клас Product не змінюй.
*/

public class Market {
    private final String name;
    private List<Product> products;     // Write code in that line

    public Market(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Write code here:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

/*

private List<Product> products; - це означає, що клас Market містить приватний список об'єктів Product (вироби),
які зберігаються в полі products.

Варто пам'ятати, що products є полем класу Market і воно зберігає посилання на список об'єктів Product, а не створює
новий об'єкт Product.

Тобто, коли ви викликаєте метод setProducts() і передаєте йому список об'єктів Product, ви насправді копіюєте посилання
на цей список до поля products в об'єкті Market.

Це означає, що будь-які зміни у цьому списку Product (наприклад, якщо ви додасте, видалите або зміните продукт у списку)
будуть відображені в полі products об'єкта Market.

*/
