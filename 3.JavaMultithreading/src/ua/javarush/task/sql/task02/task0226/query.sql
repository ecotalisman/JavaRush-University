/*
Авто 2021 року
Напиши запит, який із таблиці cars вибере інформацію про те, скільки яких автомобілів (name) було випущено у 2021 році (prod_year).

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, COUNT(*) FROM cars WHERE prod_year = 2021 GROUP BY name;