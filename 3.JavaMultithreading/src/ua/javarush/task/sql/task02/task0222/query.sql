/*
Скільки в нас авто?
Напиши запит, який з таблиці cars вибере інформацію про те, скільки яких назв (name) автомобілів є в наявності.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, COUNT(*) FROM cars GROUP BY name;