/*
Знайомимося з RIGHT JOIN
У цьому завданні тобі буде потрібно:
1. Вибрати колонку email з таблиці customers і всі колонки з таблиці orders.
2. Об'єднати таблиці customers та orders оператором RIGHT JOIN.
3. Використовуючи оператор ON, додати умову, що колонка customer_id таблиці customers дорівнює колонці customer_id таблиці orders.
Використовуй оператори RIGHT JOIN та ON.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT customers.email, orders.* FROM customers RIGHT JOIN orders ON customers.customer_id = orders.customer_id;