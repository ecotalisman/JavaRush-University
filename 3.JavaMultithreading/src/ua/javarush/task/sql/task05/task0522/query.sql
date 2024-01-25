/*
Числові функції 1
Отримай з таблиці part колонки name та weight. Значення стовпчика weight округлили вгору. Колонку з округленими значеннями назви ceil_weight.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, CEILING(weight) AS ceil_weight FROM part;