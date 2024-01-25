/*
Групування та сортування 2
Отримай з таблиці lego_set кількість наборів кожного року.
Колонці з кількістю встанови ім'я total. Відфільтруй набори за колонкою number: зважай тільки на набори з number менше 10000.
Відсортуй результат за кількістю наборів за спаданням.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT released, COUNT(*) AS total FROM lego_set WHERE number < 10000 GROUP BY released ORDER BY total DESC;