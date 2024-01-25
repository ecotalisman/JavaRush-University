/*
Оператор BETWEEN
Отримай з таблиці object (схема space) всі об'єкти, відкриті з початку 2010 до кінця 2020 року.
Результат повинен містити усі колонки таблиці.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM object WHERE discovery_date BETWEEN '2010-01-01' AND '2020-12-31';