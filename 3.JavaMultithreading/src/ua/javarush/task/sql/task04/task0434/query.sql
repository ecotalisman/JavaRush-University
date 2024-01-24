/*
Довгі та короткі імена
Напиши запит, який із таблиці employee вибере довжини імен (name) співробітників у байтах та символах.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT LENGTH(name), CHAR_LENGTH(name) FROM employee;