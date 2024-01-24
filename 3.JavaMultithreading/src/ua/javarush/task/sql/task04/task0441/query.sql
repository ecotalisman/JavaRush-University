/*
Дебазуємо ім'я
Напиши запит, який з таблиці employee вибере імена (name_b64) співробітників base64 до першої колонки та імена, перетворені з base64, на другу.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name_b64, FROM_BASE64(name_b64) FROM employee;