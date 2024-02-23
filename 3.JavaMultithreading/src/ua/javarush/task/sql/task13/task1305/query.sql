/*
Створюємо таблицю зв'язку ManyToMany
Припустимо, в нас є дві таблиці:

таблиця author з колонками id, first_name, last_name, full_name;
таблиця book з колонками id, title, publication_year, isbn.
У кожного автора може бути кілька книг, а кожна книга має кілька авторів.

Тобі потрібно створити таблицю author_book, в якій зберігатиметься інформація про зв'язок авторів та книг.

Напиши SQL скрипт, який виконає:

Створення таблиці під назвою author_book.
Додавання колонки author_id з типом INT, значення в ній не можуть бути null.
Додавання колонки book_id з типом INT, значення в ній теж не можуть бути null.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
CREATE TABLE author_book
(
    `author_id` INT not null,
    `book_id`   INT not null,
    PRIMARY KEY (author_id, book_id),
    FOREIGN KEY (author_id) REFERENCES author(id),
    FOREIGN KEY (book_id) REFERENCES book(id)
);