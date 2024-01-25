/*
Оператор JOIN 5
Таблиця book пов'язана з таблицею author через колонку author_id, значенням у якій є id авторів.
Таблиця book пов'язана з таблицею publisher через колонку publisher_id, що містить id видавців.
Отримай назви всіх видавців, які видавали книги автора 'Mark Twain' (full_name). Результат має містити одну колонку name.
Значення у колонці не повинні повторюватися.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT DISTINCT publisher.name
FROM book
         LEFT JOIN author ON author.id = book.author_id
         LEFT JOIN publisher ON publisher.id = book.publisher_id
WHERE author.full_name = 'Mark Twain';
