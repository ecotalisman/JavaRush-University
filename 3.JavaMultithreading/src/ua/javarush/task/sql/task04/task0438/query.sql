/*
Регістр-овані імена
Напиши запит, який із таблиці employee вибере позиції (position) співробітників, але водночас,
якщо у позиції зустрічається слово "developer", заміни його на "software developer".

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT REPLACE(position, 'developer', 'software developer') FROM employee;