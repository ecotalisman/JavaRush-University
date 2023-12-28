/*
RIGHT JOIN і WHERE
У цьому завданні тобі буде потрібно:
1. Вибрати стовпчик city з таблиці customers і стовпчик store_id з таблиці orders.
2. Об'єднати таблиці customers та orders оператором RIGHT JOIN.
3. Використовуючи оператор ON, додати умову, що колонка customer_id таблиці customers дорівнює колонці customer_id таблиці orders.
4. Використовуючи оператори WHERE і AND, додати умову, що order_status і total_cost таблиці orders повинні дорівнювати 'SHIPPED'
та більше 100 відповідно.
Використовуй оператори RIGHT JOIN, ON, WHERE та AND.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT customers.city, orders.store_id
FROM customers
         RIGHT JOIN orders ON customers.customer_id = orders.customer_id
WHERE orders.order_status = 'SHIPPED'
  AND orders.total_cost > 100;

