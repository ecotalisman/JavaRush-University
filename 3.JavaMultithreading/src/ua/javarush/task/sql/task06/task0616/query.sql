/*
Видалення за діапазоном id
Видали з таблиці task записи з ID в діапазоні від 5 до 10.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
DELETE FROM task WHERE id >= 5 AND id <= 10;