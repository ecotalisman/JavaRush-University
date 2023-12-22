/*
Розподіл іменинників за роками народження
Напиши запит, який з таблиці employee вибере інформацію про те, скільки співробітників народилося (date_of_birth) у визначеному році.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date_of_birth), COUNT(*) FROM employee GROUP BY YEAR(date_of_birth);