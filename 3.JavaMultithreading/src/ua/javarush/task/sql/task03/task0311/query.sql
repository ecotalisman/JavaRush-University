/*
Дії з колонками
У цьому завданні тобі буде потрібно: 1. Вибрати колонки name і hq_location із таблиці top_retailers,
але тимчасово замінити звернення до колонки top_retailers.name на retailer, а до колонки
top_retailers.hq_location — на retailer_hq. 2. Також слід вибрати стовпчик country з таблиці suppliers,
тимчасово замінивши назву на supplier_country.
Використовуй AS.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT top_retailers.name AS retailer, top_retailers.hq_location AS retailer_hq, suppliers.country AS supplier_country
FROM top_retailers,
     suppliers;
