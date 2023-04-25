package ua.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфони
У методі main створюються два айфони з однаковими параметрами.
У консоль виводиться результат їх порівняння. Розберися, чому зараз результат негативний і зроби так, щоб він
був позитивним. Для цього тобі слід перевизначити метод equals(Iphone), який буде враховувати всі параметри.
У двох рівних об'єктів значення полів мають бути однаковими. Метод main у перевірці не використовується.


Requirements:
1. У класі Iphone має бути перевизначено метод public boolean equals(Object).
2. Метод equals має повертати true для двох рівних об'єктів типу Iphone і false — для різних.
3. Метод equals має повертати false, якщо в нього передано null.
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишіть тут ваш код

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Iphone iphone = (Iphone) o;

        if (price != iphone.price) return false;
        if (!Objects.equals(model, iphone.model)) return false;
        return Objects.equals(color, iphone.color);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
