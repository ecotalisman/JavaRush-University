/*
Народжені в першій 200-ці
Напиши запит, який з таблиці employee вибере ім'я (name) та департамент (department) співробітників, які народилися у перші 200 днів року.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, department FROM employee WHERE DAYOFYEAR(date_of_birth) <= 200;