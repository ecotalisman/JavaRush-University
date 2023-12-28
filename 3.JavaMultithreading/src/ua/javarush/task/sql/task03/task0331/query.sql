/*
RIGHT JOIN, аліаси і WHERE
У цьому завданні тобі буде потрібно:
1. Вибрати колонку last_name з таблиці authors, перейменувавши їх на author, і колонки title та copies_sold_millions з таблиці books,
перейменувавши на book_title і books_sold відповідно.
2. Об'єднати таблиці authors і books оператором RIGHT JOIN, перейменувавши на а і b відповідно.
3. Використовуючи оператор ON, додати умову, що колонка author_id таблиці authors дорівнює колонці author_id таблиці books.
4. Використовуючи оператор WHERE, додати умову, що copies_sold_millions таблиці books має бути більше 50.
Використовуй оператори RIGHT JOIN, AS, ON та WHERE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT a.last_name AS author, b.title AS book_title, b.copies_sold_millions AS books_sold
FROM authors a
         RIGHT JOIN books b ON a.author_id = b.author_id
WHERE b.copies_sold_millions > 50;

