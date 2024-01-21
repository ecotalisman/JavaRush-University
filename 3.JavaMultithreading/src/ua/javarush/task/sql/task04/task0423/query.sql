/*
Народжені в понеділок
Напиши запит, який із таблиці employee вибере ім'я (name) та позицію (position) співробітників, які народилися в понеділок.
Використовуй DAYNAME().

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name, position FROM employee WHERE DAYNAME(date_of_birth) = 'Monday';