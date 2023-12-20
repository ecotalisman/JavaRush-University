/*
Дії з NULL
Вибрати з таблиці parts колонки required, identifier, description (у вказаному порядку), у яких значення
поля description не дорівнює NULL.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT required, identifier, description FROM parts WHERE description IS NOT NULL;