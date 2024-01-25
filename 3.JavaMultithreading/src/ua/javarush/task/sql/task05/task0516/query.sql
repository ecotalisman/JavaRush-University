/*
Фільтрація 3
Отримай з таблиці part колонку name.
Відфільтруй дані: потрібні тільки ті значення, які двічі містять рядок 'Slope' або двічі містять рядок 'Clip'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT name FROM part WHERE name LIKE '%Slope%Slope%' OR name LIKE '%Clip%Clip%';