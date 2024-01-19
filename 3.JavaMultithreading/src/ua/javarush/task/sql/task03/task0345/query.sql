/*
Підзапит і множинні фільтри
У цьому завданні тобі знадобиться:
1. Вибрати колонку last_name із таблиці film_directors.
2. Використовуючи оператор LEFT JOIN, додати підзапит, в якому потрібно вибрати стовпчик grossed таблиці films, з фільтром WHERE,
який повинен знаходити фільми, що принесли більше 100.
3. Таблиця films має бути перейменована на film.
4. Таблиці мають бути пов'язані за полями id (таблиці film_directors) та director_id (таблиці films).
5. І врешті-решт потрібно додати фільтр WHERE, який буде знаходити режисерів лише з UK.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT last_name
FROM film_directors
         LEFT JOIN (SELECT grossed, director_id FROM films WHERE grossed > 100) AS film
                   ON film_directors.id = film.director_id WHERE film_directors.country = 'UK';