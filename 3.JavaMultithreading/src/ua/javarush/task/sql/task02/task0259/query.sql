/*
Девелепори за позиціями
Напиши запит, який з таблиці employee вибере позиції (position) та список імен (name) співробітників на кожної позиції.
До вибірки повинні потрапити лише позиції зі словом "developer" у назві. Використовуй GROUP_CONCAT та HAVING.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT position, GROUP_CONCAT(name) FROM employee GROUP BY position HAVING position LIKE '%developer%';