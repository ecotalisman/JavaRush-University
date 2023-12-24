/*
Працюємо з JOIN, ON і WHERE
У цьому завданні тобі буде потрібно:
1. Вибрати всі колонки таблиці customers і з'єднати її з таблицею orders за допомогою оператора JOIN.
2. Додати умову, що колонка customer_id таблиці customers дорівнює колонці customer_id таблиці orders.
3. Додати умову, що total_cost таблиці orders має бути більше 100.
Використовуй оператори JOIN, ON та WHERE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT *
FROM customers
         JOIN orders ON customers.customer_id = orders.customer_id
WHERE orders.total_cost > 100;
