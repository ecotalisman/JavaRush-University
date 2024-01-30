/*
Зміна за developer-ами
Напиши запит, який усім співробітникам (таблиця employee), що мають в назві позиції (поле position) слово "developer",
встановить зарплату (поле salary) у розмірі 5000 і змінить назву позиції на fullstack developer.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
UPDATE employee SET salary = 5000, position = 'fullstack developer' WHERE position LIKE '%developer%';