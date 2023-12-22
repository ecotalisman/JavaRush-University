/*
Авто і роки 2 2
Напиши запит, який із таблиці cars вибере рік випуску (prod_year) із зазначенням кількості машин, випущених
у визначений рік. Колонка з кількістю в результаті повинна мати назву car_count.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT prod_year, COUNT(*) AS car_count FROM cars GROUP BY prod_year;