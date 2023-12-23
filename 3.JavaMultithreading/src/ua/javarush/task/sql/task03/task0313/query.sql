/*
Працюємо з AS та аліасом таблиць
У цьому завданні тобі буде потрібно:
1. Вибрати колонку name із таблиці top_retailers, але тимчасово замінити звернення до колонки на ret_name.
2. Вибрати колонки name та country з таблиці suppliers, тимчасово замінити name на sup_name, а country — на sup_country.
3. Тимчасово замінити назви таблиць з top_retailers на retailers і suppliers — на sup.
Використовуй AS.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT retailers.name AS ret_name, sup.name AS sup_name, sup.country AS sup_country
FROM top_retailers retailers,
     suppliers sup;
