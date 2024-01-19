/*
Всі люблять Спілберга
У цьому завданні тобі знадобиться:
1. Вибрати стовпчик title з таблиці films.
2. Використовуючи оператор LEFT JOIN, додати підзапит, в якому потрібно вибрати колонку last_name таблиці film_directors,
з фільтром WHERE, який повинен знаходити лише "Spielberg".
3. Таблиця film_directors має бути перейменована на director.
4. Таблиці мають бути пов'язані за полями id (таблиці film_directors) та director_id (таблиці films).

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT title
FROM films
         LEFT JOIN (SELECT last_name, id FROM film_directors WHERE last_name = 'Spielberg') AS director
                   ON director.id = films.director_id;
