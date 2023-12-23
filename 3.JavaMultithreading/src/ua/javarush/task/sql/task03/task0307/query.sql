/*
Фільтруємо за id
Потрібно знайти колонки id та name з таблиці gyms, та колонку id з таблиці customers, водночас замінивши назву
таблиці gyms на 'gym', а назву таблиці customers на 'cust'. Також нам не потрібні всі id з таблиці cust,
а лише ті, що менше 50.
Використовуй AS та WHERE.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT gym.id, gym.name, cust.id FROM gyms AS gym, customers AS cust WHERE cust.id < 50;