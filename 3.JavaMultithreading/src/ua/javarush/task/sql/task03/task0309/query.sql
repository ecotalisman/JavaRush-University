/*
Сортуємо за локаціями
Насамперед потрібно вибрати колонки location з таблиць gyms і customers, але замінити при цьому назву таблиці
gyms на 'gym', а назву таблиці customers на 'person'. Також нам потрібно виключити з результату location 'London'
таблиці особи. І, зрештою, слід згрупувати результат за колонками location таблиць gym і person.
Для вирішення тобі знадобляться AS, WHERE та GROUP BY.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT gym.location, person.location
FROM gyms AS gym,
     customers AS person
WHERE person.location != 'London'
GROUP BY gym.location, person.location;
