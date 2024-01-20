/*
WITH із додатковою умовою 2
У цьому завданні тобі знадобиться:
1. Використовуючи оператор WITH, створити тимчасову таблицю tempTable з колонкою averageGrossed.
2. Використовуючи оператор AS, додати підзапит, у якому потрібно знайти середнє значення колонки grossed таблиці films.
3. Створити другу тимчасову таблицю tempTable2, та за допомогою оператора AS додати другий підзапит, в якому потрібно
    знайти середнє значення колонки year_released таблиці films.
4. Вибрати колонки title, genre, year_released і grossed з таблиць films, tempTable і tempTable2.
5. Додати умову, що колонка grossed таблиці films повинна бути більшою за колонку averageGrossed таблиці tempTable,
    а також колонка year_released таблиці films повинна бути більшою за колонку averageYearReleased таблиці tempTable2.
6. Згрупувати результат за колонкою year_released таблиці films.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
WITH tempTable (averageGrossed) AS (SELECT AVG(grossed) FROM films),
     tempTable2 (averageYearReleased) AS (SELECT AVG(year_released) FROM films)
SELECT title, genre, year_released, grossed
FROM films,
     tempTable,
     tempTable2
WHERE films.grossed > tempTable.averageGrossed
  AND films.year_released > tempTable2.averageYearReleased
GROUP BY films.year_released;
