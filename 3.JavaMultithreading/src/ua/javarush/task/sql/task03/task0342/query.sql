/*
Оператори LIKE і CONCAT
У цьому завдання тобі знадобиться:
1. Вибрати всі стовпчики з таблиці film_directors.
2. Використовуючи оператори WHERE, LIKE та CONCAT, додати умову, що колонка full_name повинна містити результат підзапиту.
3. У підзапиті слід вибрати дві колонки, first_name та last_name (таблиці film_directors), розділивши їх пробілом і обмеживши результат до одного.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM film_directors WHERE full_name LIKE (SELECT CONCAT(first_name, ' ', last_name) FROM film_directors LIMIT 1);