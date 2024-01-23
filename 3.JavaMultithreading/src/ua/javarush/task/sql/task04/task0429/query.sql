/*
Події за останні 2 тижні
Напиши запит, який з таблиці event вибере всі поля подій, що сталися протягом останніх двох тижнів.
Дата та час подій зберігаються у полі date_time. Використовуй BETWEEN, DATE_SUB() та CURDATE().

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM event WHERE date_time BETWEEN DATE_SUB(CURDATE(), INTERVAL 2 WEEK) AND CURDATE();