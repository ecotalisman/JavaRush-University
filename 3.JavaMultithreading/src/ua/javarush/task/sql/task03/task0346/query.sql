/*
Для тих, хто любить sci-fi
У цьому завданні тобі знадобиться:
1. Вибрати всі колонки з таблиці films.
2. Використовуючи оператор JOIN, додати підзапит, у якому потрібно вибрати стовпчик year_born таблиці film_directors,
з фільтром WHERE, який повинен знаходити режисеров, які народилися до 1940 року.
3. Таблиця film_directors має бути перейменована на director.
4. Таблиці мають бути пов'язані за полями id (таблиці film_directors) та director_id (таблиці films).
5. І, зрештою, потрібно додати фільтр WHERE, який буде знаходити фільми тільки 'sci-fi' жанру.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT *
FROM films
         JOIN (SELECT film_directors.year_born, id FROM film_directors WHERE year_born < 1940) AS director
              ON director.id = films.director_id WHERE films.genre = 'sci-fi';
