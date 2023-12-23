/*
Рік і місяць народження з кількістю
Напиши запит, який із таблиці employee на основі дати народження (date_of_birth) вибере рік, місяць (номер) народження
та кількість співробітників, що народилися цього року та місяця.
Рік та місяць потрібно вибрати до різних колонок.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date_of_birth), MONTH(date_of_birth), COUNT(*) FROM employee GROUP BY YEAR(date_of_birth), MONTH(date_of_birth);