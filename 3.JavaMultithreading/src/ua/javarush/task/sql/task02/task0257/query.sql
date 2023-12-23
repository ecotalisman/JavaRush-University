/*
Сума та середнє
Напиши запит, який з таблиці автомобілів (cars) вибере назву (name), середню та сумарну вартість (price).
До результату мають потрапити лише ті авто, середня вартість яких понад 100 000.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, AVG(price) AS avg, SUM(price) FROM cars GROUP BY name HAVING avg > 100000;