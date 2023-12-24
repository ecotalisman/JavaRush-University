/*
Працюємо з JOIN, AS, ON і WHERE
У цьому завданні тобі буде потрібно:
1. Вибрати колонки ret_name і ret_revenue з таблиці top_retailers, колонки sup_name і sup_revenue — з таблиці suppliers.
2. Об'єднати таблиці оператором JOIN, надавши їм у своїй тимчасові назви retailer і supplier (для top_retailers і suppliers, відповідно).
3. Додати умову, що ret_revenue дорівнює sup_revenue.
4. Додати умову, що sup_revenue має бути більше 50.
Використовуй оператори JOIN, AS, ON та WHERE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT retailer.ret_name, retailer.ret_revenue, supplier.sup_name, supplier.sup_revenue
FROM top_retailers AS retailer
         JOIN
     suppliers AS supplier
     ON retailer.ret_revenue = supplier.sup_revenue
WHERE supplier.sup_revenue > 50;
