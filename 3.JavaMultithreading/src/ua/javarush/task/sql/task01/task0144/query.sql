/*
Сортування за кількома колонками
Вибрати стовпчик description з таблиці parts. Результат відсортувати за полем required — за спаданням,
за полем identifier — зао спаданням і за полем description — за спаданням. Пропусти перші 23 рядки.
Потрібно використовувати: ORDER BY, DESC, OFFSET.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT description
FROM parts
ORDER BY required DESC, identifier DESC, description DESC
LIMIT 50 OFFSET 23;
