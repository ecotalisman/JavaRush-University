/*
Індексуємо позицію та зарплату
Напиши запит, який створить індекси в таблиці employee: position_index за колонкою position і salary_index за колонкою salary.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
ALTER TABLE employee ADD INDEX position_index (position);
ALTER TABLE employee ADD INDEX salary_index (salary);