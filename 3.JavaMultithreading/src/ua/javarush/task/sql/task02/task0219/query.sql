/*
NULL не завжди погано
Напиши запит, який згідно з даними з поля euro таблиці cars поверне таку інформацію:
- 'good', якщо значення euro дорівнює NULL
- 'bad' у разі будь-якого іншого значення euro

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT CASE
           WHEN euro IS NULL THEN 'good'
           ELSE 'bad'
           END
FROM cars
