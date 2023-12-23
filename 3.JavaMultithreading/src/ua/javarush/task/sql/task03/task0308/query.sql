/*
Знайди Халка
Потрібно знайти стовпчик location з таблиці gyms, і колонки name, email та telephone з таблиці customers,
водночас замінивши назву таблиці gyms на 'g', а назву таблиці customers на 'person'.
Також нам потрібен person тільки з ім'ям 'Hulk'.
Використовуй AS та WHERE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT g.location, person.name, person.email, person.telephone
FROM gyms AS g,
     customers AS person
WHERE person.name = 'Hulk';
