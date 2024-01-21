/*
Рік, місяць, день і день місяця
Напиши запит, який поверне рік, місяць, день та день місяця поточної дати.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(NOW()), MONTH(NOW()), DAY(NOW()), DAYOFMONTH(NOW());