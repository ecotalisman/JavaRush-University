/*
Без null-a, але з novel
У цьому завданні тобі буде потрібно:
1. Вибрати всі колонки з таблиці authors.
2. Використовуючи оператори WHERE і NOT IN, додати умову, що колонка id не повинна містити результат підзапиту.
3. У підзапиті слід вибрати колонку author_id таблиці books, потім додатково вказати, що колонка author_id не повинна містити NULL,
і колонка genre (також таблиці books) повинна дорівнювати 'novel'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM authors WHERE author_id NOT IN (SELECT author_id FROM books WHERE books.author_id IS NOT NULL AND genre = 'novel');