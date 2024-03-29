/*
IF в IF-і
Напиши запит, який відповідно до значення поля age у таблиці customers повертає наступний текст: - 'child',
якщо вік менше або дорівнює 12 - 'adult', якщо вік більше або дорівнює 20 - 'teenager', якщо вік більше 12 і менше 20.
Обмеж вибірку 5 записами. Використовуй запит виду SELECT IF(<умова>, <якщо_істинно>, IF(...)) FROM <таблиця> LIMIT ...

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT IF(age <= 12, 'child', IF(age >= 20, 'adult', 'teenager')) FROM customers LIMIT 5;