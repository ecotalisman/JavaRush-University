/*
Базуємо ім'я
Напиши запит, який з таблиці employee вибере імена (name) співробітників: перша колонка — просто ім'я, друга — ім'я, перетворене на base64.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, TO_BASE64(name) FROM employee;