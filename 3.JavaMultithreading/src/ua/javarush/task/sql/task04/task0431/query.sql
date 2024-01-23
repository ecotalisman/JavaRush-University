/*
День реєстрацій
Напиши запит, який з таблиці event вибере день тижня на основі дати (date) та кількість реєстрацій (поле type дорівнює 'REGISTRATION').
Вибрати потрібно лише той день, у якому зареєструвалося найбільше користувачів. Використовуй DAYNAME().

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT DAYNAME(date), COUNT(*) FROM event WHERE type = 'REGISTRATION' GROUP BY DAYNAME(date) ORDER BY COUNT(*) DESC LIMIT 1;