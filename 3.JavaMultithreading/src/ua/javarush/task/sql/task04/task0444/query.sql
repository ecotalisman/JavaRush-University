/*
Трійка найкоротших міст
Напиши запит, який з таблиці cities вибере 3 міста (city), що мають найменшу кількість літер у назві міста.
Після назви додай через дефіс кількість літер у назві.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT CONCAT(city, '-', CHAR_LENGTH(city)) FROM cities ORDER BY CHAR_LENGTH(city) LIMIT 3;