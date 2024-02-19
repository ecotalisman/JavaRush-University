package ua.javarush.task.sql.task12.task1201;

/* 
Створюємо Entity з класу
Якщо раніше не підключав залежності, підключи їх. Для цього Alt+Ctrl+Shift+S (в IDEA), вкладка Libraries.
Залежності можна завантажити тут.
Архів розпакуй, і кожну залежність додай до модуля. Ця частина завдання не перевіряється, але якщо її не зробити,
ти не зможеш локально виконувати код.

Додай до публічного класу Library приватні поля id (Long), status (PublicationStatus), publicationName (String) та isbn (String).

У класі повинні бути анотації @Entity та @Table (ім'я таблиці library_table).

У всіх полях повинні бути присутні геттери та сеттери.

У полі id має бути відповідна анотація.

У поля status має бути анотація @Enumerated, в якій зазначено ordinal enum тип, а також анотація @Column, в якій вказано ім'я колонки, яке збігається з назвою поля.

В інших полях має бути анотація @Column, в якій вказано ім'я колонки. Ім'я колонки має співпадати з назвою поля.

Requirements:
1. Не змінюй клас PublicationStatus.
2. Клас Library повинен бути публічним і містити чотири приватні поля.
3. У полів повинні бути публічні геттери та сеттери.
4. Анотації рівня класу мають бути розставлені відповідно до умови.
5. Анотації рівня поля мають бути розставлені відповідно до умови.
*/

public enum PublicationStatus {
    LENT,
    DUE,
    LEND_OVERDUE,
    AVAILABLE,
    LOST,
    LOST_AND_PAID,
    DAMAGED,
    DO_NOT_LEND
}
