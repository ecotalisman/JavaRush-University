package ua.javarush.task.pro.task13.task1325;

import java.util.*;

/* 
Телефонна книга
Реалізуй метод getContactsStartsWith(TreeMap<String, String>, String), який повинен повернути частину телефонної книги,
отриманої першим параметром, прізвище/ім’я яких починається на певну послідовність символів, отриману другим параметром.

Requirements:
1. Сигнатуру і тип значення, що повертається, методу getContactsStartsWith(TreeMap<String, String>, String) не змінюй.
2. Метод getContactsStartsWith має бути реалізований відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();

        phoneBook.put("Войтиков Дмитро", "555-55-66");
        phoneBook.put("Бочкарьов Петро", "950-44-66");
        phoneBook.put("Власов Василь", "554-55-66");
        phoneBook.put("Олександров Олексій", "505-22-66");
        phoneBook.put("Виноградов Максим", "550-55-33");
        phoneBook.put("Андреєв Андрій", "555-555-555");
        phoneBook.put("Громов Євген", "558-20-66");
        phoneBook.put("Брагін Іван", "455-65-66");
        phoneBook.put("Алексєєв Олександр", "500-87-66");
        phoneBook.put("Глазов Віктор", "355-59-86");

        TreeMap<String, String> contactsByFirstLetter = getContactsStartsWith(phoneBook, "Ал");

        if (contactsByFirstLetter.isEmpty()) {
            System.out.println("Контакти не знайдені.");
        } else {
            for (Map.Entry<String, String> entry : contactsByFirstLetter.entrySet()) {
                System.out.printf("%s, %s%n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static TreeMap<String, String> getContactsStartsWith(TreeMap<String, String> map, String startsWith) {
        TreeMap<String, String> result = new TreeMap<>();
        //напишіть тут ваш код
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().startsWith(startsWith)) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }
}

/*
Потрібно ітерувати книгу телефонів, і якщо ім'я/прізвище починається з певного рядка, додати його до результату.
Для цього ми можемо використати метод startsWith() класу String.

Ми створюємо нову TreeMap, яку назвали result. Ми будемо додавати до цього об'єкту всі контакти, ім'я яких починається
з рядка, переданого в параметрі startsWith.

Для цього ми використовуємо цикл for-each, щоб пройтися по всім записам в початковій книзі контактів (map). Для кожного
запису ми перевіряємо, чи починається ключ (в нашому випадку - ім'я) з рядка startsWith. Це виконується за допомогою
методу startsWith(), який є методом класу String. Якщо це так, ми додаємо цей запис до result.

В результаті, result буде містити всі контакти, імена яких починаються з рядка startsWith.

***********************************************************************************************************************************

Метод entrySet() це метод, визначений в інтерфейсі Map в Java. Він повертає набір (set) записів карти. Кожен запис
представляє пару "ключ-значення" і є об'єктом типу Map.Entry.

Отже, коли ви викликаєте map.entrySet(), ви отримуєте Set<Map.Entry<K,V>>, де K - тип ключів у вашій мапі, а V - тип значень.
В нашому випадку, це Set<Map.Entry<String, String>>.

У нашому коді ми використовуємо цикл for-each для ітерації через Set<Map.Entry<String, String>>. Кожна ітерація циклу
дає нам доступ до наступного об'єкта Map.Entry<String, String>.

Map.Entry має методи getKey() і getValue(), які дають нам доступ до ключа та значення кожного запису відповідно.
У нашому випадку, entry.getKey() повертає ім'я контакту, а entry.getValue() повертає телефонний номер контакту.

*/