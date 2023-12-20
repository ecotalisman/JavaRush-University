/*
Дії з NULL
Вибрати всі колонки (використовуй *) з таблиці parts, які мають значення поля id між 7 і 23 включно І значення
поля identifier дорівнює NULL. Вибери лише перші 2 записи.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM parts WHERE id BETWEEN 7 AND 23 AND identifier IS NULL LIMIT 2;