/*
JOIN, аліаси, WHERE, GROUP BY і ORDER BY
У цьому завданні тобі буде потрібно:
1. Вибрати колонки sex і country з таблиці authors, перейменувавши їх на author_sex і author_country відповідно.
Також вибрати колонку copies_sold_millions з таблиці books та перейменувати її на books_sold.
2. Об'єднати таблиці authors і books оператором JOIN, перейменувавши на a і b відповідно.
3. Використовуючи оператор ON, додати умову, що колонка author_id таблиці authors дорівнює колонці author_id таблиці books.
4. Використовуючи оператор WHERE, додати умову, що copies_sold_millions таблиці books має бути більше 10.
5. Використовуючи оператор GROUP BY, згрупувати результат за колонками sex та country таблиці authors
та колонці copies_sold_millions таблиці books.
6. Використовуючи оператори ORDER BY і DESC, відсортуй результат за спаданням, за колонцою copies_sold_millions таблиці books.
Використовуй оператори JOIN, AS, ON, WHERE, GROUP BY, ORDER BY та DESC.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT a.sex AS author_sex, a.country AS author_country, b.copies_sold_millions AS books_sold
FROM authors a
         JOIN books b ON a.author_id = b.author_id
WHERE b.copies_sold_millions > 10
GROUP BY a.sex, a.country, b.copies_sold_millions
ORDER BY b.copies_sold_millions DESC;
