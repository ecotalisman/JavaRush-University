/*
Сортування за кількома колонками
Вибрати з таблиці parts колонки id, identifier, description (у вказаному порядку). Результат відсортувати за
полем identifier — за спаданням, за полем required — за спаданням і за полем description — за зростанням.
Потрібно використовувати: ORDER BY, DESC, ASC.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT id, identifier, description FROM parts ORDER BY identifier DESC, required DESC, description ASC;