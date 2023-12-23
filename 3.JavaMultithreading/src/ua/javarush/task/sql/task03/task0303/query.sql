/*
Коли ім'я та назва рівні
Потрібно знайти всі записи з таблиць gyms і customers, де name з gyms таблиці дорівнює name з таблиці customers.
Використовуй WHERE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM gyms, customers WHERE gyms.name = customers.name;