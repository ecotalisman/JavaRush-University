/*
Погані і хороші машини
Напиши запит, який згідно даних з поля euro таблиці cars поверне таку інформацію:
- 'best', якщо значення euro більше 5
- 'good', якщо значення euro дорівнює 5
- 'bad' у разі будь-якого іншого значення euro
Результат обмеж 5 записами, відсортуй за ціною (поле price). Рік випуску (prod_year) має бути більшим (новішим) за 2020 рік.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT CASE
    WHEN euro > 5 THEN 'best'
    WHEN euro = 5 THEN 'good'
    ELSE 'bad'
    END
FROM cars WHERE prod_year > 2020 ORDER BY price LIMIT 5;