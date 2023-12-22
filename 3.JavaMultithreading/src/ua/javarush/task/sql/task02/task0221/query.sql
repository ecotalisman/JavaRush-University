/*
Автівки та роки
Напиши запит, який із таблиці cars вибере року випуску (prod_year) із зазначенням кількості машин, випущених у визначений рік.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT prod_year, COUNT(*) FROM cars GROUP BY prod_year;