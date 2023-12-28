/*
Починаємо працювати з LEFT JOIN
У цьому завданні тобі буде потрібно:
1. Вибрати колонку last_name з таблиці customers, тимчасово змінивши назву на surname (використовуй AS)
та колонку order_id з таблиці orders.
2. Об'єднати таблиці customers та orders оператором LEFT JOIN.
3. За допомогою оператора ON додати умову, що колонка customer_id таблиці customers дорівнює колонці customer_id таблиці orders.
Використовуй оператори LEFT JOIN, AS та ON.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT customers.last_name AS surname, orders.order_id
FROM customers
         LEFT JOIN orders ON customers.customer_id = orders.customer_id;
