/*
Кількість у днях
Напиши запит, який з таблиці data вибере рік, місяць, день із поля date та загальну суму значень із поля total,
які належать до цього року, місяця та дня.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date), MONTH(date), DAY(date), SUM(total) FROM data GROUP BY YEAR(date), MONTH(date), DAY(date);