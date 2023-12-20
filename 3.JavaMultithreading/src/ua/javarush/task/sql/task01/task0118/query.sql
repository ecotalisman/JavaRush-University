/*
Оператор OR
Вибрати з таблиці employee вміст колонок department, salary, name (у вказаному порядку), у яких значення
поля salary строго менше 1000 АБО значення поля salary більше або дорівнює 5000. Використовуй OR.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, salary, name FROM employee WHERE salary < 1000 OR salary >= 5000;