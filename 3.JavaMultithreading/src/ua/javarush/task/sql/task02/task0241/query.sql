/*
Рік і місяць народження з групуванням
Напиши запит, який із таблиці employee на основі дати народження (date_of_birth) вибере рік та
місяць (номер) народження кожного працівника. Рік та місяць потрібно вибрати до різних колонок.
Згрупуй дані за роком та місяцем.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date_of_birth), MONTH(date_of_birth) FROM employee GROUP BY YEAR(date_of_birth), MONTH(date_of_birth);