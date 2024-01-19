/*
Тільки не Війна і Мир
У цьому завданні тобі буде потрібно:
1. Вибрати всі колонки з таблиці authors.
2. Додати умову, що колонка id таблиці authors не повинна включати автора з author_id 7 (з таблиці books) та з title 'War and Peace'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM authors WHERE author_id NOT IN (SELECT author_id FROM books WHERE author_id = 7 AND title = 'War and Peace');