/*
Тільки не Shakespeare
У цьому завданні тобі буде потрібно:
1. Вибрати всі колонки з таблиці authors.
2. Додати умову, що колонка full_name не повинна включати результат підзапиту (використовуй NOT LIKE).
3. У підзапиті через конкатенацію слід вибрати колонки first_name і last_name таблиці authors, додавши між ними пробіл.
Потім — додатково вказати, що last_name має дорівнювати 'Shakespeare'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM authors WHERE full_name NOT LIKE (SELECT CONCAT(first_name, ' ', last_name) FROM authors WHERE last_name = 'Shakespeare');