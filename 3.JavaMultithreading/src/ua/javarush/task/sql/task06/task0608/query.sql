/*
Додаємо постачальників до покупців
Додай до таблиці customers всі колонки таблиці suppliers.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
INSERT INTO customers
SELECT * FROM suppliers;