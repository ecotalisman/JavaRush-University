/*
Групування
Отримай з таблиці lego_set кількість наборів кожного року. Має вийти дві колонки: released і count(*).

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT released, COUNT(*) FROM lego_set GROUP BY released;