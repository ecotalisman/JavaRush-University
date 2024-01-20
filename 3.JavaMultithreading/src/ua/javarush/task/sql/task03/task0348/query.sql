/*
Оператор WITH
У цьому завданні тобі знадобиться:
1. Використовуючи оператор WITH, створити тимчасову таблицю grossed_total.
2. Використовуючи оператор AS, додати підзапит, у якому потрібно знайти SUM колонки grossed таблиці films та назвати її total.
3. Використовуючи оператори SELECT та AVG, знайти середній дохід колонки total та назвати колонку-результат average_grossed.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
WITH grossed_total AS (SELECT SUM(grossed) AS total FROM films)
SELECT AVG(total) AS average_grossed
FROM grossed_total;