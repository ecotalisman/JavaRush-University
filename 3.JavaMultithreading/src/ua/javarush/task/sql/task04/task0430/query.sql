/*
Більше 5 подій на день
Напиши запит, який з таблиці event вибере рік, місяць, день з поля date_time та кількість подій, які належать до цього року, місяця та дня.
Вибрати дані лише в ті дні, де більше 5 подій.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date_time), MONTH(date_time), DAY(date_time), COUNT(*)
FROM event
GROUP BY YEAR(date_time), MONTH(date_time), DAY(date_time)
HAVING COUNT(*) > 5;
