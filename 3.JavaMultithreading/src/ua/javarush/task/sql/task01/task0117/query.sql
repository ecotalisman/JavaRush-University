/*
Оператор AND NOT
Вибрати з таблиці employee вміст колонок department, salary, name (у вказаному порядку), у яких значення
поля salary строго більше 2200 І значення поля department не дорівнює qa. Використовуй AND NOT.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, salary, name FROM employee WHERE salary > 2200 AND NOT department = 'qa';