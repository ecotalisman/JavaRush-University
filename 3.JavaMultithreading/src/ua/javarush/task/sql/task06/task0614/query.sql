/*
Підвищуємо зарплату правильно
Напиши запит, який підніме зарплату (поле salary) на 1000 працівникам (таблиця employee),
у яких на дату (поле exp_date) '2022-10-01' немає прострочених завдань (таблиця task).
Зв'язок співробітників зі завданнями реалізований через поле employee_id у таблиці task.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
UPDATE employee
SET employee.salary = employee.salary + 1000
WHERE employee.id IN (SELECT task.employee_id FROM task WHERE task.exp_date > '2022-10-01');