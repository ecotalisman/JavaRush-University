/*
Події за поточний місяць
Напиши запит, який з таблиці event вибере всі поля подій, що відбулися протягом поточного місяця.
Дата та час подій зберігаються у полі date_time. Використовуй YEAR(), MONTH() та CURDATE().

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM event WHERE YEAR(date_time) = YEAR(CURDATE()) AND MONTH(date_time) = MONTH(CURDATE());