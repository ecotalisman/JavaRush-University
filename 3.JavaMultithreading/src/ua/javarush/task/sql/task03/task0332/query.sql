/*
RIGHT JOIN, аліаси, WHERE і GROUP BY
У цьому завданні тобі буде потрібно:
1. Вибрати колонку last_name з таблиці authors, перейменувавши її на author, і колонки genre та date_released з таблиці books,
перейменувавши genre на book_genre.
2. Об'єднати таблиці authors і books оператором RIGHT JOIN, перейменувавши на аuth і book, відповідно.
3. Використовуючи оператор ON, додати умову, що колонка author_id таблиці authors дорівнює колонці author_id таблиці books.
4. Використовуючи оператор WHERE, додати умову, що date_released таблиці books має бути менше 1900.
5. Використовуючи оператор GROUP BY, згрупуй результат за колонками genre та date_released таблиці books.
Використовуй оператори RIGHT JOIN, AS, ON, WHERE та GROUP BY.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT a.last_name AS author, b.genre AS book_genre, b.date_released
FROM authors a
         RIGHT JOIN books b ON a.author_id = b.author_id
WHERE b.date_released < 1900 GROUP BY b.genre, b.date_released;