/*
Функції дати
Отримай з таблиці object (схема space) дані про дату відкриття.
Результат повинен містити чотири колонки:
- name;
- колонку d_year, що містить рік відкриття об'єкта;
- колонку d_month, що містить назву місяця відкриття об'єкта;
- колонку d_day, що містить назву дня тижня відкриття об'єкта.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, YEAR(discovery_date) AS d_year, MONTHNAME(discovery_date) AS d_month, DAYNAME(discovery_date) AS d_day
FROM
    object;
