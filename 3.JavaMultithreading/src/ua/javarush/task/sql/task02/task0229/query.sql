/*
Наскільки багато машин
Напиши запит, який із таблиці cars вибере інформацію про те, скільки яких назв (name) автомобілів є в наявності.
Колонка з ім'ям у результаті повинна мати назву car_name, а колонка з кількістю — car_count.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name AS car_name, COUNT(*) AS car_count FROM cars GROUP BY name;