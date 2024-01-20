/*
WITH із додатковою умовою
У цьому завданні тобі знадобиться:
1. Використовуючи оператор WITH, створити тимчасову таблицю tempTable з колонкою averageDOB.
2. Використовуючи оператор AS, додати підзапит, у якому потрібно знайти середнє значення колонки year_born таблиці film_directors.
3. Вибрати колонки id, full_name та year_born з таблиці film_directors та tempTable.
4. Додати умову, що колонка year_born таблиці film_directors повинна бути меншою за колонку averageDOB таблиці tempTable.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
WITH tempTable AS (SELECT AVG(year_born) AS averageDOB FROM film_directors)
     SELECT id, full_name, year_born FROM film_directors fd, tempTable WHERE fd.year_born < tempTable.averageDOB;