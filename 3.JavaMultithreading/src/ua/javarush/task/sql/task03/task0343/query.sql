/*
LEFT JOIN з підзапитом
У цьому завдання тобі знадобиться:
1. Вибрати стовпчик full_name з таблиці film_directors.
2. Використовуючи оператор LEFT JOIN, додати підзапит, у якому потрібно вибрати колонку title таблиці films, з фільтром WHERE,
який повинен знаходити лише комедії з колонки genre.
3. Таблиця films потрібно перейменувати f.
4. Таблиці мають бути пов'язані за полями id (таблиці film_directors) та director_id (таблиці films).

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT fd.full_name, f.title
FROM film_directors AS fd
         LEFT JOIN (SELECT title, director_id FROM films WHERE genre = 'comedy') AS f ON fd.id = f.director_id;