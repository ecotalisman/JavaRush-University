/*
Рейтинг має значення
Напиши запит, який з таблиці employee вибере рейтинг (rating) співробітників та список імен (name) співробітників
з цим рейтингом. До вибірки мають потрапити лише ті, у кого рейтинг вищий за 2 (строго більший).
Результат виведи у порядку зростання рейтингу.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT rating, GROUP_CONCAT(name) FROM employee GROUP BY rating HAVING rating > 2 ORDER BY rating;