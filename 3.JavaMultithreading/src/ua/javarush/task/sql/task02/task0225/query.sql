/*
Скільки в нас синіх авто?
Напиши запит, який з таблиці cars вибере інформацію про те, скільки синіх автомобілів (name дорівнює 'Blue Car')
випущено кожного року (prod_year), в якому вони випускалися.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT prod_year, COUNT(*) FROM cars WHERE name = 'Blue Car' GROUP BY prod_year;