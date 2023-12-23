/*
Більше одного
Напиши запит, який з таблиці cars вибере назву (name) та кількість автомобілів із певною назвою.
До вибірки мають потрапити лише автомобілі з кількістю більше 1.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, COUNT(*) AS total FROM cars GROUP BY name HAVING total > 1;