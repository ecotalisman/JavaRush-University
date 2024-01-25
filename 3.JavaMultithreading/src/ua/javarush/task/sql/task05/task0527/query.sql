/*
Оператор JOIN 4
Таблиці book пов'язані з таблицею author через колонку author_id, значенням у якій є id авторів.
Отримай назви всіх книг автора 'Edgar Allan Poe'. Результат повинен містити одну колонку title.
Значення у колонці не повинні повторюватися.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT DISTINCT book.title
FROM book
         JOIN author ON author.id = book.author_id
WHERE author.full_name = 'Edgar Allan Poe';
