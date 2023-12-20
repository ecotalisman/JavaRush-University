/*
Оператор BETWEEN
Вибрати з таблиці employee всі стовпчики (використовуй *), у яких значення поля salary МІЖ 1000 і 5000 включно.
Використовуй оператор BETWEEN

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM employee WHERE salary BETWEEN 1000 AND 5000;