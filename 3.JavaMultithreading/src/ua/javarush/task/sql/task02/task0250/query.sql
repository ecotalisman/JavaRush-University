/*
Одного фронтендера мало
Напиши запит, який з таблиці employee вибере один департамент (department), позицію (position) та
кількість співробітників у цьому департаменті на позиції "frontend developer".
До вибірки мають потрапити лише дані з кількістю більше 1.
Для кількості використовуй аліас total, і цей аліас використовуй для перевірки умови.
Всі перевірки виконуй за допомогою оператора HAVING.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, position, COUNT(*) AS total
FROM employee
GROUP BY department, position
HAVING total > 1
   AND position = 'frontend developer'
LIMIT 1;