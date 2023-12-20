/*
Оператор DISTINCT
Вибрати з таблиці ip2country всі унікальні значення колонки country_name, у яких у назві (колонка country_name)
немає символу пробіл. Потрібно використовувати: DISTINCT, WHERE та NOT LIKE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT DISTINCT country_name FROM ip2country WHERE country_name NOT LIKE '% %';