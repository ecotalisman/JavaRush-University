/*
Ох уж ці заочники
Напиши запит, який згідно з даними з поля is_full_time таблиці students поверне таку інформацію:
- 'true', якщо значення is_full_time дорівнює 1
- 'false', якщо значення is_full_time дорівнює 0

Використовуй CASE виду CASE case_value WHEN value1 THEN result1 ... FROM table
Значення поля is_full_time може бути відмінним від 0 та 1. Цей кейс обробляти не потрібно.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT CASE is_full_time
           WHEN 1 THEN 'true'
           WHEN 0 THEN 'false'
           END
FROM students;
