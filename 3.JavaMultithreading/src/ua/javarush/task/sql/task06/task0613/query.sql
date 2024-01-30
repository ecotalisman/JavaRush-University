/*
Підвищуємо зарплату менеджерам
Напиши запит, який підніме зарплату (поле salary) на 500 працівникам (таблиця employee), у яких позиція (поле position) менеджер ('manager').

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
UPDATE employee SET salary = salary + 500 WHERE position = 'manager';