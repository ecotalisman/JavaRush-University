/*
Оператор OFFSET
Вибрати з таблиці ip2country колонки country_code, ip_from, ip_to (у вказаному порядку). Під час вибору пропусти
перші 78 рядків. Потрібно використати: OFFSET.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT country_code, ip_from, ip_to FROM ip2country LIMIT 50 OFFSET 78;