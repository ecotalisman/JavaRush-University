/*
Дивне групування
Напиши запит, який згідно з даними з таблиці cars вибере поля name та prod_year. У підсумковій вибірці інформація має
бути згрупована за колонками name, prod_year та price.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, prod_year, price, COUNT(*) FROM cars GROUP BY name, prod_year, price;