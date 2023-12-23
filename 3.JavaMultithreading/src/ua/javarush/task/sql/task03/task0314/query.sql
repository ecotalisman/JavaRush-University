/*
І ще трохи роботи з AS та аліасом таблиць
У цьому завданні тобі буде потрібно:
1. Вибрати колонки name та annual_revenue_billions з таблиці top_retailers, але тимчасово замінити звернення до колонки name на ret_name,
а до колонки annual_revenue_billions — на ret_revenue.
2. Вибрати стовпчик name з таблиці suppliers, тимчасово замінити name на sup_name.
3. Тимчасово замінити назви таблиць з top_retailers на ret і suppliers — на supplier.
Використовуй AS.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT ret.name AS ret_name, ret.annual_revenue_billions AS ret_revenue, supplier.name AS sup_name
FROM top_retailers ret,
     suppliers supplier;
