/*
Сортування за кількома колонками
Вибрати з таблиці parts колонки id, identifier, description (у вказаному порядку). Результат відсортувати за
полем identifier — за зростанням, за полем required — за спаданням і за полем description — за спаданням.
Вибери лише перших 7 рядків. Потрібно використовувати: ORDER BY, DESC, ASC, LIMIT.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT id, identifier, description
FROM parts
ORDER BY identifier ASC, required DESC, description DESC
LIMIT 7;
