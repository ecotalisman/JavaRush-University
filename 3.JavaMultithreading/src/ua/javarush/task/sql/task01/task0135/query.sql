/*
Оператори OFFSET та LIMIT
Вибрати з таблиці ip2country колонки country_code, ip_from, ip_to (у вказаному порядку), у яких country_code
дорівнює DE. Під час вибору пропустити перші 3 рядки. Вибрати потрібно лише 5 рядків.
Потрібно використовувати: WHERE, LIMIT та OFFSET.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT country_code, ip_from, ip_to FROM ip2country WHERE country_code = 'DE' LIMIT 5 OFFSET 3;
