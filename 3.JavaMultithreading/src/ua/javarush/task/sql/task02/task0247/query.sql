/*
Один в полі воїн
Напиши запит, який з таблиці employee вибере департамент (department), позицію (position) та кількість співробітників
у цьому департаменті на цій позиції. До вибірки мають потрапити лише дані з кількістю, що дорівнює 1.
Для кількості використовуй аліас total, і цей аліас використовуй для перевірки умови.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, position, COUNT(*) AS count FROM employee GROUP BY department, position HAVING count = 1;