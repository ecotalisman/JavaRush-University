/*
Фільтрація 1
Отримай з таблиці part колонку name.
Відфільтруй дані: потрібні тільки ті значення, які містять рядок 'Special'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name FROM part WHERE name LIKE '%Special%';