/*
LEFT JOIN та аліаси колонок
У цьому завданні тобі буде потрібно:
1. Вибрати колонку zip_code з таблиці customers, перейменувавши їх на cust_zip_code, і колонку order_status з таблиці orders,
перейменувавши їх на status.
2. Об'єднати таблиці customers та orders оператором LEFT JOIN.
3. Використовуючи оператор ON, додати умову, що колонка customer_id таблиці customers дорівнює колонці customer_id таблиці orders.
Використовуй оператори LEFT JOIN, ON та AS.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT c.zip_code AS cust_zip_code, o.order_status AS status FROM customers AS c LEFT JOIN orders AS o ON c.customer_id = o.customer_id;