/*
Групування та сортування 1
Отримай з таблиці lego_set кількість наборів кожного року.
Колонці з кількістю встанови ім'я total. Повинно вийти дві колонки: released і total.
Відсортуйте результат за кількістю наборів зі спадання.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT released, COUNT(*) AS total FROM lego_set GROUP BY released ORDER BY total DESC;