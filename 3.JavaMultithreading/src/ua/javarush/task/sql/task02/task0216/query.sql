/*
Потрібні лише backend та frontend
Напиши запит, який згідно з даними з поля position таблиці employee поверне таку інформацію:
- 'yes', якщо значення position дорівнює 'backend developer'
- 'yes', якщо значення position дорівнює 'frontend developer'
- 'no' у разі будь-якого іншого значення position

Обмеж вибірку співробітниками, у яких department = 'cool devs'.
Використовуй CASE виду CASE WHEN condition1 THEN result1 WHEN condition2 ... FROM table

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT CASE
           WHEN position = 'backend developer' THEN 'yes'
           WHEN position = 'frontend developer' THEN 'yes'
           ELSE 'no'
           END
FROM employee
WHERE department = 'cool devs';