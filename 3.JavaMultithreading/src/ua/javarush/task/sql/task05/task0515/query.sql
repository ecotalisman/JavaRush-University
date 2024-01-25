/*
Фільтрація 2
Отримай з таблиці part колонку name.
Відфільтруй дані: потрібні тільки ті значення, які містять рядок 'Slope' і не містять рядок '45°'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name FROM part WHERE name LIKE '%Slope%' AND name NOT LIKE '%45°%';