/*
LEFT JOIN, аліаси, WHERE, GROUP BY, ORDER BY і LIMIT
У цьому завданні тобі буде потрібно:
1. Вибрати колонки last_name і country з таблиці authors, перейменувавши їх на author та author_country відповідно.
Також вибрати колонку genre з таблиці books, перейменувавши її в book_genre.
2. Об'єднати таблиці authors і books оператором LEFT JOIN, перейменувавши їх на author та book відповідно.
3. Використовуючи оператор ON, додати умову, що колонка id таблиці authors дорівнює колонці author_id таблиці books.
4. Використовуючи оператор WHERE, додати умову, що genre таблиці books має дорівнювати 'fantasy'.
5. Використовуючи оператор GROUP BY, згрупувати результат за колонками last_name та country таблиці authors і колонці genre таблиці books.
6. Використовуючи оператори ORDER BY і ASC, відсортувати результат за колонкою country таблиці authors.
7. Використовуючи оператор LIMIT, додати обмеження на кількість рядків у розмірі 5.
Використовуй оператори LEFT JOIN, AS, ON, WHERE, GROUP BY, ORDER BY, ASC та LIMIT.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT author.last_name AS author, author.country AS author_country, book.genre AS book_genre
FROM authors author
         LEFT JOIN books book ON author.id = book.author_id
WHERE book.genre = 'fantasy'
GROUP BY author.last_name, author.country, book.genre
ORDER BY author.country
LIMIT 5;
