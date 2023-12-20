/*
Оператор OFFSET
Вибрати з таблиці ip2country всі стовпчики (використовуй *). Під час вибору пропусти перші 50 рядків.
Потрібно використати: OFFSET.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM ip2country LIMIT 50 OFFSET 50;