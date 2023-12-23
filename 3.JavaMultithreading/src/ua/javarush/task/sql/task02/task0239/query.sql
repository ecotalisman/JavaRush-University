/*
Народжені взимку
Напиши запит, який із таблиці employee на основі дати народження (date_of_birth) вибере рік та місяць (номер) народження працівників,
народжених узимку. Рік та місяць потрібно вибрати до різних колонок.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date_of_birth), MONTH(date_of_birth) FROM employee WHERE MONTH(date_of_birth) IN (12, 1, 2);