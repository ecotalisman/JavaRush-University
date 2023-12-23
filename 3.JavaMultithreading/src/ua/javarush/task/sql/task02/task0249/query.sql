/*
Один бекендер
Напиши запит, який з таблиці employee вибере департамент (department), позицію (position) та кількість співробітників
у цьому департаменті на позиції "backend developer". До вибірки мають потрапити лише дані з кількістю, що дорівнює 1.
Для кількості використовуй аліас total і цей аліас використовуй для перевірки умови.
Всі перевірки виконуй за допомогою оператора HAVING.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, position, COUNT(*) AS total
FROM employee
WHERE position = 'backend developer'
GROUP BY department, position
HAVING total = 1;