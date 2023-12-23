/*
2 чи 3
Напиши запит, який з таблиці employee вибере департамент (department), позицію (position) та кількість співробітників
у цьому департаменті на цій позиції. До вибірки мають потрапити лише дані з кількістю більше 1 і менше 4.
Для кількості використовуй аліас total і цей аліас використовуй для перевірки умови.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, position, COUNT(*) AS total
FROM employee
GROUP BY department, position
HAVING total > 1
   AND total < 4;