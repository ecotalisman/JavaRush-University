/*
Продовжуємо працювати з AS, WHERE та аліасом таблиць
У цьому завданні тобі буде потрібно:
1. Вибрати колонки name і hq_location із таблиці top_retailers, тимчасово замінити name на ret_name, а hq_location — на ret_location.
2. Вибрати колонку name із таблиці suppliers, тимчасово замінити ім'я колонки на sup_name.
3. Тимчасово замінити назви таблиць з top_retailers на retailer і suppliers — на supplier.
4. Відфільтрувати пошук за рітейлерами з доходом понад 100.
Використовуй AS та WHERE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT retailer.name AS ret_name, retailer.hq_location AS ret_location, supplier.name AS sup_name
FROM top_retailers retailer,
     suppliers supplier
WHERE retailer.annual_revenue_billions > 100;