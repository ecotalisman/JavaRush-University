/*
Оператор LIKE
Вибрати з таблиці car стовпчики brand, model, booked_quantity (у вказаному порядку), у яких значення поля model
починається на букву k. Використовуй оператор LIKE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT brand, model, booked_quantity FROM car WHERE model LIKE 'k%';