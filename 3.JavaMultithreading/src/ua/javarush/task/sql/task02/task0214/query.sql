/*
Хто є хто
Напиши запит, який згідно з даними з поля experience таблиці developers поверне таку інформацію:
- 'junior', якщо значення experience менше 1
- 'middle', якщо значення experience менше 3
- 'senior', якщо значення experience менше 5
Використовуй CASE виду CASE WHEN condition1 THEN result1 ... FROM table

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT CASE
           WHEN experience < 1 THEN 'junior'
           WHEN experience < 3 THEN 'middle'
           WHEN experience < 5 THEN 'senior'
           END
FROM developers;
