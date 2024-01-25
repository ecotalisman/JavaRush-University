/*
Сортування 4
Отримай з таблиці lego_set колонки name, released, inventory.
Відсортуй дані за роками: спочатку більш старі.
Усередині одного року відсортуй за inventory у порядку зростання.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, released, inventory FROM lego_set ORDER BY released, inventory;