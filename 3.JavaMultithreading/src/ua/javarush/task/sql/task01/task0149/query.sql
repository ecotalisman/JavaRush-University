/*
Дії з NULL
Вибрати всі колонки (використовуй *) з таблиці parts, у яких значення поля description не дорівнює NULL
або значення поля identifier дорівнює NULL.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM parts WHERE description IS NOT NULL OR identifier IS NULL;