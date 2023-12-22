/*
Розподіл іменинників за роками народження 3
Напиши запит, який з таблиці employee вибере інформацію про те, скільки є співробітників, у посаді (position)
яких присутнє слово "developer", народилося (date_of_birth) у певному році.
Колонка з роком у результаті повинна мати назву year_of_birth.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date_of_birth) AS year_of_birth, COUNT(*)
FROM employee
WHERE position LIKE '%developer%'
GROUP BY year_of_birth;
