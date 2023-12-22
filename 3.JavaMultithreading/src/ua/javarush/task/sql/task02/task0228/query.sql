/*
Скільки співробітників у департаментах?
Напиши запит, який із таблиці employee вибере інформацію про те, скільки в кожному департаменті (department) співробітників.
Колонка з кількістю в результаті має мати назву number_of_employees.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, COUNT(*) AS number_of_employees FROM employee GROUP BY department;