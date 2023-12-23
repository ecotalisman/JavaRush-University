/*
Вартість деяких авто
Напиши запит, який з таблиці автомобілів (cars) вибере назву (name) та суму (price).
До результату мають потрапити лише ті авто, сума вартості яких понад 200 000.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, SUM(price) AS sum FROM cars GROUP BY name HAVING sum > 200000;