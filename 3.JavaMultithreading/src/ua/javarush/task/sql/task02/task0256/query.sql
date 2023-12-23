/*
Сума та середнє
Напиши запит, який з таблиці автомобілів (cars) вибере назву (name), сумарну та середню вартість (price).

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, SUM(price), AVG(price) FROM cars GROUP BY name;