/*
Співробітними за позиціями
Напиши запит, який з таблиці employee вибере позиції (position) та список імен (name) співробітників на кожної позиції.
Використовуй GROUP_CONCAT.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT position, GROUP_CONCAT(name) FROM employee GROUP BY position;