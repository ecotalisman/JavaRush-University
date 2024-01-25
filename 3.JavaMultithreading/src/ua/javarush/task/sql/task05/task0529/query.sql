/*
Оператор JOIN 6
Таблиці book пов'язані з таблицею author через колонку author_id, значенням у якій є id авторів.
Таблиці book пов'язані з таблицею publisher через колонку publisher_id, що містить id видавців.
Для кожного автора отримай кількість видавців, які видавали їх книжки.
Результат повинен містити дві колонки: - full_name автора; - колонку publishers з кількістю видавців.
Якщо у БД немає книг якогось автора, то в колонці publishers має бути 0.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT author.full_name, COUNT(DISTINCT publisher.id) AS publishers
FROM author
         LEFT JOIN book ON author.id = book.author_id
         LEFT JOIN publisher ON book.publisher_id = publisher.id
GROUP BY author.full_name;