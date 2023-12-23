/*
Або 1 або менеджер
Напиши запит, який з таблиці employee вибере два департаменти (department), позиції (position) та кількість співробітників
у даних департаментах. До вибірки повинні потрапити лише дані з кількістю, що дорівнює 1 або з позицією 'manager'.
Перший рядок результату слід пропустити. Для кількості використовуй аліас total, і цей аліас використовуй для перевірки умов.
Усі перевірки виконуй за допомогою оператора HAVING.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT department, position, COUNT(*) AS total
FROM employee
GROUP BY department, position
HAVING total = 1
    OR position = 'manager'
LIMIT 2 OFFSET 1;