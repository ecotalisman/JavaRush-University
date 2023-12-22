/*
Скільки фронтендників?
Напиши запит, який із таблиці employee вибере інформацію про те, скільки в кожному департаменті (department) співробітників
зі спеціальністю (position) "frontend developer". Колонка з департаментом у результаті повинна мати назву department_name,
а колонка з кількістю — count.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department AS department_name, COUNT(*) AS count
FROM employee
WHERE position = 'frontend developer'
GROUP BY department;
