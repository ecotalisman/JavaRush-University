/*
Групування за аліасами
Напиши запит, який із таблиці cars на основі дати виробництва (prod_date) вибере рік, місяць (номер) виробництва
та кількість автомобілів, вироблених у цей рік та місяць.
Рік та місяць потрібно вибрати до різних колонок. Колонкам рік і місяць привласни аліаси prod_year і prod_month відповідно.
Групування роби за аліасом.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(prod_date) AS prod_year, MONTH(prod_date) AS prod_month, COUNT(*) FROM cars GROUP BY prod_year, prod_month;