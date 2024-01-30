/*
Індексуємо популяцію
Напиши запит, який створить індекс population_index у таблиці cities за колонкою population.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
ALTER TABLE cities ADD INDEX population_index (population);