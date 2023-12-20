/*
Оператор IN
Вибрати з таблиці car (використовуй *) всі колонки, які мають значення поля brand ОДНЕ З: renault, opel, seat, skoda.
Використовуй оператор IN.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM car WHERE brand IN ('renault', 'opel', 'seat', 'skoda');