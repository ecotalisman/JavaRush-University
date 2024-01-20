/*
Підзапити, фільтри та обмеження
У цьому завданні тобі знадобиться:
1. Вибрати всі стовпчики з таблиці film_directors.
2. Використовуючи оператор RIGHT JOIN, додати підзапит, у якому потрібно вибрати стовпчик title таблиці films, з фільтром WHERE,
який повинен знаходити фільми, що вийшли після 1990 року.
3. Таблиця films має бути перейменована на film.
4. Таблиці мають бути пов'язані за полями id (таблиці film_directors) та director_id (таблиці films).
5. І врешті-решт потрібно додати фільтр WHERE, який буде знаходити режисерів лише з USA і з обмеженням до 5 результатів.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT *
FROM film_directors
         RIGHT JOIN (SELECT films.title, director_id FROM films WHERE year_released > 1990) AS film
                    ON film_directors.id = film.director_id WHERE film_directors.country = 'USA' LIMIT 5;
