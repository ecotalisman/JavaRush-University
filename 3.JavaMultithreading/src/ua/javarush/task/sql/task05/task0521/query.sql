/*
Рядкові функції 2
Отримай з таблиці lego_set номери та імена у вигляді однієї колонки з ім'ям full_name за принципом:
якщо номер був 71761, а ім'я — 'Zane’s Power Up Mech EVO', в колонці full_name має вийти: 71761, Zane’s Power Up Mech EVO
Тобто, номер та ім'я розділені комою та пробілом. Відсортуй результат за довжиною name у порядку зростання.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT CONCAT(number, ', ', name) AS full_name FROM lego_set ORDER BY LENGTH(name);