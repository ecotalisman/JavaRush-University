/*
Працюємо з WHERE
У цьому завданні тобі буде потрібно:
1. Вибрати колонки rank і name із таблиці top_retailers, але тимчасово замінити звернення до колонки
top_retailers.rank на company_rank, а до колонки top_retailers.name — на company_name.
2. Вибрати стовпчик annual_revenue_billions з таблиці suppliers, тимчасово замінивши назву на supplier_revenue.
3. Додати фільтр за колонкою annual_revenue_billions таблиці suppliers, щоб у результаті відображалися suppliers
лише з доходом вище 25.
Використовуй AS та WHERE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT top_retailers.rank                AS company_rank,
       top_retailers.name                AS company_name,
       suppliers.annual_revenue_billions AS supplier_revenue
FROM top_retailers,
     suppliers
WHERE suppliers.annual_revenue_billions > 25;
