/*
Оператор AND
Вибрати з таблиці employee вміст колонок id, salary, department, name (у вказаному порядку), у яких значення
поля salary строго менше 5000 І значення поля department дорівнює dev.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT id, salary, department, name FROM employee WHERE salary < 5000 AND department = 'dev';