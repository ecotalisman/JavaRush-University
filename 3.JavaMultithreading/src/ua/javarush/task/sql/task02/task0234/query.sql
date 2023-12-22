/*
Розподіл іменинників за роками народження 2
Напиши запит, який із таблиці employee вибере інформацію про те, скільки співробітників народилося (date_of_birth) у визначеному році.
Колонка з роком у результаті повинна мати назву year_of_birth.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date_of_birth) AS year_of_birth, COUNT(*) FROM employee GROUP BY year_of_birth;