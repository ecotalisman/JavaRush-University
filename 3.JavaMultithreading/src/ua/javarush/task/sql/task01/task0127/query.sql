/*
Комбінування операторів
Вибрати з таблиці car (використовуй *) всі колонки, у яких значення поля model не містить літери a (латиниця, рядкова)
І різниця між quantity та booked_quantity — МІЖ 5 та 500 включно. Потрібно використати: NOT LIKE, BETWEEN.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM car WHERE model NOT LIKE '%a%' AND (quantity - booked_quantity) BETWEEN 5 AND 500;