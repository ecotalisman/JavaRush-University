/*
Хто є хто
Напиши запит, який згідно з даними з поля number_of_season таблиці months поверне таку інформацію:
- 'winter', якщо значення number_of_season дорівнює 1
- 'spring', якщо значення number_of_season дорівнює 2
- 'summer', якщо значення number_of_season дорівнює 3
- 'autumn', якщо значення number_of_season дорівнює 4
- 'unknown' у разі будь-якого іншого значення number_of_season
Використовуй CASE виду CASE case_value WHEN value1 THEN result1 ... FROM table

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT CASE number_of_season
           WHEN 1 THEN 'winter'
           WHEN 2 THEN 'spring'
           WHEN 3 THEN 'summer'
           WHEN 4 THEN 'autumn'
           ELSE 'unknown'
           END
FROM months;