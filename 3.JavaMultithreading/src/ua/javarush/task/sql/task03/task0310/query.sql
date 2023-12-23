/*
Змінюємо назви колонок
Потрібно вибрати колонки location з таблиць gyms і customers, але замінити у їх назви з location на city
для таблиці gyms, і з location — на address для таблиці customers.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT gyms.location AS city, customers.location AS address FROM gyms, customers;