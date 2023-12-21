/*
Нове, новіше, та ще новіше
Напиши запит, який згідно з даними з поля prod_year таблиці cars поверне name і таку інформацію:
- 'new', якщо значення prod_year дорівнює 2020
- 'newer', якщо значення prod_year дорівнює 2021
- 'even newer', якщо значення prod_year дорівнює 2022
У підсумковій вибірці не має бути повторів.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT DISTINCT name, CASE prod_year
        WHEN 2020 THEN 'new'
        WHEN 2021 THEN 'newer'
        WHEN 2022 THEN 'even newer'
        END
FROM cars;
