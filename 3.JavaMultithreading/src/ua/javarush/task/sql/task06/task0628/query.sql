/*
Видаляємо індекси
Напиши запит, який видалить індекси name_index та salary_index з таблиці employee. Використовуй ALTER TABLE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
ALTER TABLE employee DROP INDEX name_index;
ALTER TABLE employee DROP INDEX salary_index;