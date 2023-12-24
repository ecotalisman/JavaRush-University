/*
Починаємо роботу з JOIN
У цьому завданні тобі буде потрібно:
1. Вибрати всі колонки з таблиць top_retailers та suppliers, об'єднавши їх у своїй оператором JOIN.
2. Додати умову, що ret_location таблиці top_retailers дорівнює sup_country таблиці suppliers.
Використовуй оператори JOIN та ON.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM top_retailers t JOIN suppliers s ON t.ret_location = s.sup_country;