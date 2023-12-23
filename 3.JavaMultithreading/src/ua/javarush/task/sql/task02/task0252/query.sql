/*
Вартість всіх авто
Напиши запит, який з таблиці cars вибере назву (name) та суму (price).

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, SUM(price) FROM cars GROUP BY name;