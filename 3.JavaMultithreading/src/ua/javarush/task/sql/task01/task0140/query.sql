/*
Сортування результату (ORDER BY)
Вибрати з таблиці ip2country стовпчики ip_from, ip_to, country_name (у вказаному порядку).
Результат відсортуй за колонкою ip_to у спадному порядку. Під час вибору пропусти перші 74 рядки.
Потрібно використовувати: ORDER BY, DESC, OFFSET.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT ip_from, ip_to, country_name FROM ip2country ORDER BY ip_to DESC LIMIT 50 OFFSET 74;