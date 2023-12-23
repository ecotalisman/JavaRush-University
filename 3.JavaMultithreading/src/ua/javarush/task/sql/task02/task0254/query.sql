/*
Мінімальна і максимальна вартість
Напиши запит, який з таблиці автомобілів (cars) вибере назву (name), мінімальну та максимальну вартість (price).

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, MIN(price), MAX(price) FROM cars GROUP BY name;