/*
Трійка найдовших міст
Напиши запит, який із таблиці cities вибере 3 міста (city), у яких найбільша кількість літер у назві міста.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT city FROM cities ORDER BY CHAR_LENGTH(city) DESC LIMIT 3;