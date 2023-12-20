/*
Оператор BETWEEN
Вибрати з таблиці car (використовуй *) всі колонки, у яких значення різниці кількості (quantity) та
заброньованої кількості (booked_quantity) МІЖ 10 та 100 включно. Використовуй оператор BETWEEN

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM car WHERE (quantity - booked_quantity) BETWEEN 10 AND 100;