/*
Шукаємо fantasy
У цьому завданні тобі буде потрібно:
1. Вибрати всі колонки з таблиці authors.
2. Використовуючи оператори WHERE та IN, додати умову, що колонка id повинна містити результат підзапиту.
3. У підзапиті слід вибрати колонку author_id таблиці books, потім додатково вказати, що колонка genre повинна містити тільки fantasy.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM authors WHERE author_id IN (SELECT author_id FROM books WHERE genre = 'fantasy');