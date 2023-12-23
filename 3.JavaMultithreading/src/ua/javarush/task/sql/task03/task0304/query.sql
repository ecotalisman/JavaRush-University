/*
Різні колонки, різні таблиці
Потрібно знайти колонки name і location з таблиці gyms, і колонки sex та location з таблиці customers.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT gyms.name, gyms.location, customers.sex, customers.location FROM gyms, customers;