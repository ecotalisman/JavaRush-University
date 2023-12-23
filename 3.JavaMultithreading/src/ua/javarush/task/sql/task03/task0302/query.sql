/*
Мені наснилося небо Лондона
Потрібно знайти всі записи з таблиць gyms і customers, де location дорівнює London. Використовуй WHERE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM gyms, customers WHERE gyms.location = 'London' AND customers.location = 'London';