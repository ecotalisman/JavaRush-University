/*
Оператор OR
Вибрати з таблиці employee всі колонки (використовуй *), у яких значення поля department dev або qa.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM employee WHERE department = 'dev' OR department = 'qa';