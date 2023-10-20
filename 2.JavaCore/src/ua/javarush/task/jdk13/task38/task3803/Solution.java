package ua.javarush.task.jdk13.task38.task3803;

/* 
Обробка анотацій
У класі Solution необхідно реалізувати найпростішу обробку анотацій.

У методі printFullyQualifiedNames() і printValues() приходить клас. Якщо цей клас позначено анотацією PrepareMyTest,
необхідно вивести на екран fullyQualifiedNames і values у відповідних методах та повернути true. Якщо ж анотація
PrepareMyTest відсутня - повернути false.

Для виведення на екран класів з масиву value використовуй скорочене ім'я (getSimpleName).

Requirements:
1. Метод printFullyQualifiedNames() має повертати false у випадку, якщо клас, що передається як параметр, не позначено
анотацією @PrepareMyTest.

2. Метод printValues() має повертати false у випадку, якщо клас, що передається як параметр, не позначено анотацією
@PrepareMyTest.

3. Метод printFullyQualifiedNames() має виводити на екран усі елементи масиву fullyQualifiedNames та повертати true,
якщо отриманий клас позначено анотацією @PrepareMyTest.

4. Метод printValues() має виводити на екран усі елементи масиву value за допомогою використання їх скорочених імен і
повертати true, якщо отриманий клас позначено анотацією @PrepareMyTest.
*/

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        // write code here:
        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest prepareMyTest = c.getAnnotation(PrepareMyTest.class);
            String[] names = prepareMyTest.fullyQualifiedNames();

            for (String name : names) {
                System.out.println(name);
            }

            return true;
        } else {
            return false;
        }
    }

    public static <T> boolean printValues(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest prepareMyTest = c.getAnnotation(PrepareMyTest.class);
            Class<?>[] names = prepareMyTest.value();

            for (Class<?> name : names) {
                System.out.println(name.getSimpleName());
            }

            return true;
        }
        return false;
    }
}

/*

1) Перевірка наявності анотації:
У методах printFullyQualifiedNames і printValues спочатку необхідно перевірити, чи позначено переданий клас анотацією
PrepareMyTest. Це можна зробити за допомогою методу isAnnotationPresent.

2) Обробка fullyQualifiedNames:
У методі printFullyQualifiedNames після підтвердження, що анотація присутня, отримайте цю анотацію та її властивість fullyQualifiedNames.
Виведіть кожний елемент з масиву fullyQualifiedNames.
Повертайте true після виведення інформації.

3) Обробка value:
У методі printValues після підтвердження, що анотація присутня, отримайте цю анотацію та її властивість value,
яка є масивом класів.
Для кожного класу в цьому масиві виведіть його getSimpleName.
Повертайте true після виведення інформації.

4) Повертання false:
Якщо у переданому класі немає анотації PrepareMyTest, обидва методи повинні повертати false.

*/