/*
Сортування за кількома колонками
Вибрати всі колонки (використовуй *) з таблиці parts. Результат відсортуй за полем required у спадному порядку,
і за полем id — у порядку зростання. Потрібно використовувати: ORDER BY, DESC, ASC.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM parts ORDER BY required DESC, id ASC;