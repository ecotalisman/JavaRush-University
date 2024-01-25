/*
Оператор JOIN 3
Таблиці book пов'язані з таблицею author через колонку author_id, значенням у якій є id авторів.
Таблиці book пов'язані з таблицею publisher через колонку publisher_id, що містить id видавців.
Отримай всі книги з таблиці book.
Результат повинен містити п'ять колонок:
- рік публікації, isbn та title книги;
- колонку, що називається author та містить full_name автора книги;
- колонку, що називається publisher та містить ім'я видавця книги.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT book.title, book.publication_year, book.isbn, author.full_name as author, publisher.name as publisher
FROM book
         LEFT JOIN author ON author.id = book.author_id
         LEFT JOIN publisher ON publisher.id = book.publisher_id;
