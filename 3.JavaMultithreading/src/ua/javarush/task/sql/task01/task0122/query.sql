/*
Оператор IN
Вибрати з таблиці car (використовуй *) всі колонки, у яких значення поля brand ОДНЕ З: mazda, toyota, nissan.
Використовуй оператор IN.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT * FROM car WHERE brand IN ('mazda', 'toyota', 'nissan');