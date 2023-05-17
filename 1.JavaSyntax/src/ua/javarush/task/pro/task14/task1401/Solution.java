package ua.javarush.task.pro.task14.task1401;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Попрацюй обробником
Спершу розберися, що робить програма, а потім виконай такі дії:

У методі addUser оброби значення, що його повертає метод setName:
якщо setName повернув -1, виведи повідомлення: "Ім'я не може бути null."
якщо -2, виведи повідомлення: "Ім'я не може бути порожнім."
якщо -3, виведи повідомлення: "Ім'я не може містити цифри."
якщо інше значення, крім 0, виведи повідомлення: "Невідома помилка."

У методі addUser оброби значення, що його повертає метод setAge:
якщо setAge повернув -1, виведи повідомлення: "Вік не може бути меншим за 0."
якщо -2, виведи повідомлення: "Вік не може бути більшим за 150."
якщо інше значення, крім 0, виведи повідомлення "Невідома помилка."

У методі findUserIndex оброби значення, що його повертає метод indexOf:
якщо indexOf повернув -1, виведи повідомлення "Користувача '<<>ім'я користувача<>>' не знайдено."
інакше — залиш поточне повідомлення
Клас User не змінюй.

Requirements:
1. Значення, що його повертає метод setName, має бути оброблено.
2. Значення, що його повертає метод setAge, має бути оброблено.
3. Значення, що його повертає метод indexOf, має бути оброблено.
*/

public class Solution {

    public static final String INPUT_NAME = "\nВведіть ім'я: ";
    public static final String INPUT_AGE = "Введіть вік користувача '%s': ";

    public static final String CANNOT_BE_NULL = "Ім'я не може бути null.";
    public static final String CANNOT_BE_EMPTY = "Ім'я не може бути порожнім.";
    public static final String CANNOT_CONTAIN_DIGIT = "Ім'я не може містити цифри.";
    public static final String CANNOT_BE_NEGATIVE = "Вік не може бути меншим за 0.";
    public static final String CANNOT_BE_TOO_BIG = "Вік не може бути більшим за 150.";
    public static final String UNKNOWN_ERROR = "Невідома помилка.";

    public static final String FOUND = "\nКористувача '%s' знайдено з індексом %d.\n";
    public static final String NOT_FOUND = "\nКористувача '%s' не знайдено.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Рафаель");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        // It was a condition:
//        user.setName(name);
//        user.setAge(age);
//        users.add(user);

        //напишіть тут ваш код
        int setNameResult = user.setName(name);
        if (setNameResult == -1) {
            System.out.println(CANNOT_BE_NULL);
        } else if (setNameResult == -2) {
            System.out.println(CANNOT_BE_EMPTY);
        } else if (setNameResult == -3) {
            System.out.println(CANNOT_CONTAIN_DIGIT);
        } else if (setNameResult != 0){
                System.out.println(UNKNOWN_ERROR);
        }

        int setAgeResult = user.setAge(age);
        if (setAgeResult == -1) {
            System.out.println(CANNOT_BE_NEGATIVE);
        } else if (setAgeResult == -2) {
            System.out.println(CANNOT_BE_TOO_BIG);
        } else if (setAgeResult != 0) {
            System.out.println(UNKNOWN_ERROR);
        }


        users.add(user);
    }

    static void findUserIndex(User user) {

        // It was a condition:
//        System.out.printf(FOUND, user.getName(), users.indexOf(user));

        //напишіть тут ваш код
        int index = users.indexOf(user);
        if (index == -1) {
            System.out.printf(NOT_FOUND, user.getName());
        } else {
            System.out.printf(FOUND, user.getName(), users.indexOf(user));
        }
    }
}


/*
Функція printf використовується для форматування та виведення даних. Вона має два основних компоненти: форматування
рядка та аргументи.

Форматування рядка - це рядок, який ви хочете вивести, але зі спеціальними символами форматування, які вказують,
де та як вставляти аргументи. Наприклад, у рядку "%s має %d років", "%s" та "%d" - це символи форматування, які
вказують, де вставити рядок (%s) та ціле число (%d).

Аргументи - це дані, які ви хочете вставити в рядок форматування. Вони йдуть після рядка форматування та
розділяються комами.

Ось декілька прикладів:

System.out.printf("%s має %d років", "Джон", 25);
В цьому прикладі, "Джон" і 25 - це аргументи, які будуть вставлені на місце "%s" та "%d" відповідно.
Результатом буде: "Джон має 25 років".

System.out.printf("Ціна: %.2f грн", 12.3456);
Тут %.2f вказує на виведення числа з плаваючою комою з двома знаками після коми. Результатом буде: "Ціна: 12.35 грн".

String name = "Василь";
int age = 30;
System.out.printf("%s має %d років", name, age);
У цьому прикладі аргументи беруться з змінних. Результатом буде: "Василь має 30 років".

*/