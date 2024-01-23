/*
Події за останні 20 днів
Напиши запит, який з таблиці event вибере всі поля подій, які сталися протягом останніх 20 днів.
Дата та час подій зберігаються у полі date_time. Використовуй DATEDIFF() та CURDATE().

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM event WHERE DATEDIFF(CURDATE(), date_time) <= 20;