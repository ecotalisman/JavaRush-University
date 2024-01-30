/*
Додавання зарплати і департамента
Напиши запит, який додасть до таблиці employee колонку із зарплатою salary з типом INT та департаментом department із типом VARCHAR(20).

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
ALTER TABLE employee ADD COLUMN salary INT, ADD COLUMN department VARCHAR(20);