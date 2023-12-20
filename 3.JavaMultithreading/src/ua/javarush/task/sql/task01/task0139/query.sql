/*
Сортування результату (ORDER BY)
Вибрати з таблиці ip2country колонки country_code, ip_from, ip_to (у вказаному порядку).
Результат відсортуй за колонкою ip_from у порядку зростання. Вибрати потрібно лише 17 рядків.
Потрібно використовувати: ORDER BY, ASC, LIMIT.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT country_code, ip_from, ip_to FROM ip2country ORDER BY ip_from ASC LIMIT 17;