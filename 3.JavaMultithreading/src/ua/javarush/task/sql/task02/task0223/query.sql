/*
Скільки співробітників?
Напиши запит, який з таблиці employee вибере інформацію про те, скільки в кожному департаменті є співробітників.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, COUNT(*) FROM employee GROUP BY department;