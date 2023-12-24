/*
Далі працюємо з JOIN
У цьому завданні тобі буде потрібно:
1. Вибрати колонки ret_name і ret_revenue з таблиці top_retailers, колонки sup_name і sup_revenue з таблиці suppliers.
2. Об'єднати таблиці оператором JOIN.
3. Додати умову, що ret_revenue таблиці top_retailers дорівнює sup_revenue таблиці suppliers.
Використовуй оператори JOIN та ON.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT t.ret_name, t.ret_revenue, s.sup_name, s.sup_revenue
FROM top_retailers t
         JOIN suppliers s ON t.ret_revenue = s.sup_revenue;
