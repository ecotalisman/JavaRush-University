/*
Рік і місяць народження
Напиши запит, який із таблиці employee на основі дати народження (date_of_birth) вибере рік та місяць (номер) народження
кожного працівника.
Рік та місяць потрібно вибрати до різних колонок.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date_of_birth), MONTH(date_of_birth) FROM employee;