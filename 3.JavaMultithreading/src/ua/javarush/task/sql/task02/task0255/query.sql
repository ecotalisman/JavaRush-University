/*
Мінімальна і обмежена максимальна вартість
Напиши запит, який з таблиці автомобілів (cars) вибере назву (name), мінімальну та максимальну вартість (price).
До результату повинні потрапити лише ті авто, максимальна вартість яких менша за 200000.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, MIN(price), MAX(price) AS max FROM cars GROUP BY name HAVING max < 200000;