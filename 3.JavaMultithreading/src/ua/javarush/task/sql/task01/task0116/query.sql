/*
Оператор AND
Вибрати з таблиці employee (використовуй *) вміст всіх колонок, у яких значення поля salary
строго менше 5000 І значення поля salary строго більше 2000.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM employee WHERE salary < 5000 AND salary > 2000;