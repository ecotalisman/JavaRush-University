/*
Ім'я-позиція
Напиши запит, який з таблиці employee вибере імена (name) та позиції (position) співробітників через дефіс ('-'). Результат — одна колонка.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT CONCAT(name, '-', position) FROM employee;