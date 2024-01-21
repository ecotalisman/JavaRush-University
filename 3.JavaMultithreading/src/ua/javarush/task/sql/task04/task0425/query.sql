/*
Департамент, рік і місяць нарождення
Напиши запит, який з таблиці employee вибере рік, місяць згідно з датою народження (date_of_birth) та кількість працівників,
які народилися у цей рік та місяць.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date_of_birth), MONTH(date_of_birth), COUNT(*) FROM employee GROUP BY YEAR(date_of_birth), MONTH(date_of_birth);