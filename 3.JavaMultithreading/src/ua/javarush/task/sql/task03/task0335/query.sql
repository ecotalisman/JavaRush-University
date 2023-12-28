/*
Де більше романістів
У цьому завданні тобі буде потрібно:
1. Вибрати колонку country з таблиці authors, перейменувати її на author_country.
2. Передати оператору COUNT колонку book_id таблиці books, перейменувати їх у book_count.
3. Об'єднати таблиці authors та books оператором JOIN, перейменувати їх на author та book відповідно.
4. Використовуючи оператор ON, додати умову, що колонка id таблиці authors дорівнює колонці author_id таблиці books.
5. Використовуючи оператор WHERE, додати умову, що genre таблиці books має дорівнювати 'novel'.
6. Використовуючи оператор GROUP BY, згрупувати результат за колонкою country таблиці authors.
7. Використовуючи оператори HAVING та COUNT вказати, що кількість book_id має бути більшою за 2.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT author.country AS author_country, COUNT(book.book_id) AS book_count
FROM authors author
         JOIN books book ON author.id = book.author_id
WHERE book.genre = 'novel'
GROUP BY author_country
HAVING book_count > 2;
