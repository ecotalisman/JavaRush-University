/*
AS, WHERE та аліас таблиць
У цьому завданні тобі буде потрібно:
1. Вибрати колонку hq_location із таблиці top_retailers, тимчасово замінити ім'я колонки на ret_location.
2. Вибрати колонку annual_revenue_billions із таблиці suppliers, тимчасово замінити ім'я колонки на sup_revenue.
3. Тимчасово замінити назви таблиць з top_retailers на ret і suppliers — на sup.
4. Виключити з пошуку всі локації 'USA' таблиці top_retailers.
Використовуй AS та WHERE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT ret.hq_location AS ret_location, sup.annual_revenue_billions AS sup_revenue
FROM top_retailers ret,
     suppliers sup
WHERE ret.hq_location != 'USA';