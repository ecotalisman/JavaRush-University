/*
Запізнілі задачі
Напиши запит, який з таблиці task вибере назви завдань (title), які закінчилися (поле exp_date) на дату '2022-10-01'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT title FROM task WHERE exp_date < '2022-10-01';