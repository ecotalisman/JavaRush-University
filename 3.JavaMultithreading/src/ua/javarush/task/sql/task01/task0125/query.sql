/*
Оператор NOT LIKE
Вибрати з таблиці car колонки brand, model, booked_quantity (у вказаному порядку), у яких значення поля model
не містить комбінації букв ea (літери — латиниця, малі) Використай оператор NOT LIKE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT brand, model, booked_quantity FROM car WHERE model NOT LIKE '%ea%';