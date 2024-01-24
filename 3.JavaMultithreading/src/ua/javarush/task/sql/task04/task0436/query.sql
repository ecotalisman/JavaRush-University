/*
Скорочуємо позиції
Напиши запит, який із таблиці employee вибере перші 8 символів позиції (position) співробітників.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT SUBSTR(position, 1, 8) FROM employee;