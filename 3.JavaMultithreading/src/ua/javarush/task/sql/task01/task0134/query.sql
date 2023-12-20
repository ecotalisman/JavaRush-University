/*
Оператори OFFSET та LIMIT
Вибрати з таблиці ip2country всі стовпчики (використовуй *). Під час вибору пропусти перші 62 рядки.
Вибрати потрібно лише 7 рядків. Потрібно використовувати: LIMIT та OFFSET.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM ip2country LIMIT 7 OFFSET 62;