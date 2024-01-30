/*
Додаємо адреси
Додай до таблиці sale_addresses інформацію з колонок
street, city, state, zip_code та country таблиці customers, але без даних з країни під назвою Testostan.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
INSERT INTO sale_addresses (street, city, state, zip_code, country)
SELECT street, city, state, zip_code, country FROM customers WHERE country NOT LIKE '%Testostan%';