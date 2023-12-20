/*
Комбінування операторів
Вибрати з таблиці car колонки brand, model, quantity, booked_quantity (у вказаному порядку), у яких значення
поля model європейське (renault, opel, seat, skoda) АБО різниця між quantity та booked_quantity МЕНШЕ 10.
Потрібно використовувати: IN, OR.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT brand, model, quantity, booked_quantity
FROM car
WHERE model IN ('renault', 'opel', 'seat', 'skoda')
   OR (quantity - booked_quantity) < 10;
