/*
Найневдаліший місяць
Напиши запит, який з таблиці event вибере місяць (назву) з поля date та кількість подій, які сталися цього місяця
і були неуспішними (поле status дорівнює 'ERROR' або 'FAILED'). До вибірки повинні потрапити лише дані про самий неуспішний місяць.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT MONTHNAME(date), COUNT(*) FROM event WHERE status IN  ('ERROR', 'FAILED') GROUP BY MONTHNAME(date) ORDER BY COUNT(*) DESC LIMIT 1;