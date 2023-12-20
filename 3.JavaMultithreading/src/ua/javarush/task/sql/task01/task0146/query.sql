/*
Дії з NULL
Вибрати всі колонки (використовуй *) з таблиці parts, у яких значення поля description дорівнює NULL І значення
поля required дорівнює true.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM parts WHERE description IS NULL AND required = true;