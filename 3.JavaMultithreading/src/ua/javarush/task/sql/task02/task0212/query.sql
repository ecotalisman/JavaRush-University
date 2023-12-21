/*
3 IF-и
Напиши запит, який згідно з даними з таблиці employee для міста (city) 'London' поверне таку інформацію:
- 'good', якщо посада (position) 'manager' та зарплата (salary) більше 10000
- 'good', якщо посада (position) НЕ 'manager' та зарплата (salary) більше 5000
- 'bad', якщо посада (position) 'manager' і зарплата (salary) менша або дорівнює 10000
- 'bad', якщо посада (position) НЕ 'manager' і зарплата (salary) менша або дорівнює 5000
Використовуй запит виду SELECT IF(<умова>, IF(...), IF(...)) FROM <таблиця> WHERE ...

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT IF(city = 'London',
          IF(position = 'manager',
             IF(salary > 10000, 'good', 'bad'),
               IF(salary > 5000, 'good', 'bad')),
    'NOT LONDON')
FROM employee;
