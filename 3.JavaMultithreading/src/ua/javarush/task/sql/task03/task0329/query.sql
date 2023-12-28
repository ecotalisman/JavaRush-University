/*
JOIN та аліаси таблиць
У цьому завданні тобі буде потрібно:
1. Вибрати стовпчик customer_id з таблиці customers і стовпчик order_status з таблиці orders.
2. Об'єднати таблиці customers і orders оператором JOIN, змінивши їх назви на c і o, відповідно (використовуючи оператор AS).
3. Використовуючи оператор ON, додати умову, що колонка customer_id таблиці customers дорівнює колонці customer_id таблиці orders.
Використовуй оператори JOIN, ON та AS.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT c.customer_id, o.order_status FROM customers c JOIN orders o ON c.customer_id = o.customer_id;