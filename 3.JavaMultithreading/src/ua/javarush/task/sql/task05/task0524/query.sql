/*
Оператор JOIN 1
Таблиці book пов'язані з таблицею author через колонку author_id, що містить id авторів.
Отримай всі книги, у авторів яких last_name починається на 'S'. Результат повинен містити дві колонки: isbn та title.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT book.isbn, book.title FROM book JOIN author ON book.author_id = author.id WHERE author.last_name LIKE '%S%';