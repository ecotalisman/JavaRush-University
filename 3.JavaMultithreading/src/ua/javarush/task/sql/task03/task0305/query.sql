/*
Робота з аліасами таблиць
Потрібно знайти колонки id та name з таблиці gyms, та колонки name та email з таблиці customers,
але водночас замінивши назву таблиці gyms на 'g', а назву таблиці customers на 'c'.
Використовуй AS для тимчасової заміни назв.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT g.id, g.name, c.name, c.email FROM gyms AS g, customers AS c;