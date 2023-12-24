/*
Працюємо з JOIN, ON, AS, WHERE і OR
У цьому завданні тобі буде потрібно:
1. Вибрати колонки customer_id та email з таблиці customers та колонки order_id та order_status з таблиці orders.
2. Об'єднати таблиці customers та orders оператором JOIN, але водночас через оператор AS тимчасово замінити
назву таблиці customers на c, а таблиці orders — на o.
3. За допомогою оператора ON додати умову, що колонка customer_id таблиці customers дорівнює колонці customer_id таблиці orders.
4. За допомогою оператора WHERE додати умову, що order_status таблиці orders має містити 'PAID' або (використовуй OR) 'PROCESSING'.
Використовуй оператори JOIN, ON, AS, WHERE та OR.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT c.customer_id, c.email, o.order_id, o.order_status
FROM customers AS c
         JOIN orders AS o ON c.customer_id = o.customer_id
WHERE o.order_status = 'PAID'
   OR o.order_status = 'PROCESSING';
