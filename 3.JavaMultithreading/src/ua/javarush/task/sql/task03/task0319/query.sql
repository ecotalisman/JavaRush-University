/*
Працюємо з JOIN, AS і ON
У цьому завданні тобі буде потрібно:
1. Вибрати колонки ret_name і ret_location з таблиці top_retailers, колонки sup_name і sup_country з таблиці suppliers.
2. Об'єднати таблиці оператором JOIN, надавши їм у своїй тимчасові назви r і s (для top_retailers і suppliers, відповідно).
3. Додати умову, що ret_location дорівнює sup_country.
Використовуй оператори JOIN, AS та ON.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT r.ret_name, r.ret_location, s.sup_name, s.sup_country
FROM top_retailers r
         JOIN suppliers s ON r.ret_location = s.sup_country;
