/*
LEFT JOIN і WHERE
У цьому завданні тобі буде потрібно:
1. Вибрати стовпчик customer_id з таблиці customers і стовпчик order_id з таблиці orders.
2. Об'єднати таблиці customers та orders оператором LEFT JOIN, замінивши їх імена на c та o відповідно за допомогою оператора AS.
3. Використовуючи оператор ON, додати умову, що колонка customer_id таблиці customers дорівнює колонці customer_id таблиці orders.
4. Використовуючи оператор WHERE, додати умову, що shipped_date таблиці orders IS NULL.
Використовуй оператори LEFT JOIN, AS, ON та IS NULL.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT c.customer_id, o.order_id
FROM customers c
         LEFT JOIN orders o ON c.customer_id = o.customer_id
WHERE o.shipped_date IS NULL;