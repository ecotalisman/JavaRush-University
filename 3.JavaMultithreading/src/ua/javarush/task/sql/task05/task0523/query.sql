/*
Числові функції 2
Отримай з таблиці lego_set стовпчики номера та inventory. Значення колонки inventory збільш на 1 відсоток,
і те, що вийшло, округли до найближчого цілого.
Колонку із округленими значеннями назви with_spare_parts.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT number, ROUND(inventory * 1.01) AS with_spare_parts FROM lego_set;