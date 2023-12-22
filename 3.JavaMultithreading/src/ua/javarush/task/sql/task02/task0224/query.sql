/*
Скільки співробітників?
Напиши запит, який із таблиці employee вибере інформацію про те, скільки в кожному департаменті (department)
співробітників зі спеціальністю (position) 'backend developer'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, COUNT(*) FROM employee WHERE position = 'backend developer' GROUP BY department;