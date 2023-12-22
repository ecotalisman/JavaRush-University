/*
Ох вже ці заочники
Напиши запит, який покаже кількість студентів (таблиця students) заочного відділення (is_full_time = 'no') та стаціонару (is_full_time = 'yes').

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT is_full_time, COUNT(*) FROM students GROUP BY is_full_time;