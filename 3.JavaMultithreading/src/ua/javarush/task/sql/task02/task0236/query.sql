/*
Розподіл співробітників за департаментом та позиції
Напиши запит, який з таблиці employee вибере інформацію про те, скільки співробітників у визначеному
департаменті (department) на певній посаді (position).

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, position, COUNT(*) FROM employee GROUP BY department, position;