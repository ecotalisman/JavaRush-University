package ua.javarush.task.jdk13.task21.task2102;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Виправити помилку. Порівняння об'єктів
Порівняння об'єктів Solution не працює належним чином. Знайти помилку та виправити.
Метод main не бере участі в тестуванні.

Requirements:
1. Хешкоди однакових об'єктів мають бути рівними.
2. Метод equals повинен перевіряти, чи об'єкт, що передається, дорівнює поточному об'єкту (порівняння через ==).
3. Метод equals повинен перевіряти, чи об'єкт, що передається, об'єктом класу Solution.
4. Метод equals повинен повертати true, якщо поля first та last є рівними в об'єкта, що передається, та поточного
об'єкта (не забудь, що вони можуть дорівнювати null).
5. Потрібно забезпечити коректну поведінку HashSet з типом елементів Solution.
6. У класі Solution потрібно реалізувати метод hashCode.
*/

public class Solution {
    private final String first;
    private final String last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Solution solution = (Solution) o;
//
//        if (!Objects.equals(first, solution.first)) return false;
//        return Objects.equals(last, solution.last);
//    }


    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public boolean equals(Object o) {
        // It was a condition:
//        if (!(o instanceof Solution)) {
//            return false;
//        }
//        Solution n = (Solution) o;
//        return n.first.equals(first) && n.last.equals(last);

        // Change code here:
        if (this == o) return true;
        if (!(o instanceof Solution)) {
            return false;
        }

        Solution n = (Solution) o;

        if (first != null ? !n.first.equals(first) : n.first != null) return false;
        return last != null ? n.last.equals(last) : n.last == null;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}

/*

Метод contains() у Java використовується для перевірки, чи присутній конкретний елемент в колекції або ні. Він повертає
значення true, якщо елемент присутній, і false, якщо елемент відсутній.

Коли ви викликаєте s.contains(new Solution("Mickey", "Mouse")), ви створюєте новий об'єкт Solution, і потім contains()
перевіряє, чи є такий об'єкт в наборі s.

При цьому для порівняння об'єктів використовуються методи equals() та hashCode(). Ось як це працює:

1) contains() генерує хеш-код для об'єкта, який передається як аргумент (в даному випадку -
new Solution("Mickey", "Mouse")), використовуючи його метод hashCode().

2) Він шукає в HashSet бакет (внутрішню структуру даних), який відповідає цьому хеш-коду.

3) Якщо бакет не знайдено, contains() відразу повертає false.

4) Якщо бакет знайдено, contains() перебирає всі елементи в бакеті, використовуючи метод equals(), щоб знайти
відповідний елемент.

5) Якщо equals() повертає true для будь-якого елемента, contains() повертає true. Інакше, якщо ніякий елемент не
відповідає, повертається false.


Метод hashCode() класу Object (який є батьківським для всіх класів в Java) створює хеш-код, який базується на
внутрішній адресі об'єкта в пам'яті, а не на його полях. Це означає, що два різні об'єкти, навіть якщо їх
поля однакові, можуть мати різні хеш-коди.

Якщо потрібно, щоб хеш-коди базувалися на полях об'єкта, вам потрібно перевизначити метод hashCode(). Це зазвичай
роблять, коли ви хочете використовувати об'єкти як ключі в HashMap або елементи в HashSet, оскільки ці колекції
використовують хеш-коди для ефективного зберігання та пошуку елементів.

Зокрема, якщо ви не перевизначите hashCode() в класі Solution, то кожен новий екземпляр класу Solution, навіть з
однаковими значеннями полів first та last, буде мати унікальний хеш-код, та не буде вважатися "однаковим" для
HashSet, HashMap і т.д., що використовують метод hashCode().

Тому для ваших потреб ви маєте перевизначити метод hashCode() так, щоб він враховував поля first та last, як вже
зробили в коді (@Override hashCode додавши).

*/