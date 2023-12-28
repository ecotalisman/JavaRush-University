/*
Продовжуємо роботу з RIGHT JOIN і WHERE
У цьому завданні тобі буде потрібно:
1. Вибрати колонку phone з таблиці customers та перейменувати її на cust_phone (використовуй оператор AS).
Також треба вибрати колонки order_date, total_cost та store_id з таблиці orders.
2. Об'єднати таблиці customers та orders оператором RIGHT JOIN.
3. Використовуючи оператор ON, додати умову, що колонка customer_id таблиці customers дорівнює колонці customer_id таблиці orders.
4. Використовуючи оператори WHERE і AND, додати умову, що колонка city таблиці customers повинна дорівнювати 'Dallas',
а колонка order_status таблиці orders повинна дорівнювати 'PROCESSING'.
Використовуй оператори AS, RIGHT JOIN, ON, WHERE та AND.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT c.phone AS cust_phone, o.order_date, o.total_cost, o.store_id
FROM customers c
         RIGHT JOIN orders o on c.customer_id = o.customer_id
WHERE c.city = 'Dallas'
  AND o.order_status = 'PROCESSING';
