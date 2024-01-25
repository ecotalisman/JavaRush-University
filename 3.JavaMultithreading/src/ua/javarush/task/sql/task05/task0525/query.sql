/*
Оператор JOIN 2
Таблиці book пов'язані з таблицею author через колонку author_id, що містить id авторів.
Отримай усіх авторів, у яких у таблиці book більше однієї книги.
Результат повинен містити дві колонки: full_name автора та колонку books, що містить кількість книг автора.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT author.full_name, COUNT(book.author_id) AS books
FROM author
         JOIN book ON author.id = book.author_id
GROUP BY author.id
HAVING COUNT(book.author_id) > 1;
