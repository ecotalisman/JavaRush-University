/*
Де ж ви є, красуні
Потрібно знайти колонку location з таблиці gyms, і колонки name та sex з таблиці customers, але водночас замінивши
назву таблиці gyms на 'gym', а назву таблиці customers на 'visitor'.
Використовуй AS для тимчасової заміни назв.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT gym.location, visitor.name, visitor.sex FROM gyms AS gym, customers AS visitor;