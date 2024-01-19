/*
Робота з підзапитом
У цьому завданні тобі буде потрібно:
1. Вибрати стовпчик year_born з таблиці authors.
2. Використовуючи оператор WHERE, додати умову, що year_born таблиці authors має бути менше або дорівнювати максимальному
значенню date_released з таблиці books.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT year_born FROM authors WHERE year_born <= (SELECT MAX(date_released) FROM books);