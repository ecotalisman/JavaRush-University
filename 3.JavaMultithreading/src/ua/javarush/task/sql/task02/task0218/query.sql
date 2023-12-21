/*
NULL = 6
Напиши запит, який згідно з даними з поля euro таблиці cars поверне таку інформацію:
- 'best', якщо значення euro більше 5
- 'good', якщо значення euro дорівнює 5
- 'bad' у разі будь-якого іншого значення euro
Якщо значення euro дорівнює NULL, перед порівнянням заміни його на 6.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT CASE
           WHEN IFNULL(euro, 6) > 5 THEN 'best'
           WHEN IFNULL(euro, 6) = 5 THEN 'good'
           ELSE 'bad'
           END
FROM cars;