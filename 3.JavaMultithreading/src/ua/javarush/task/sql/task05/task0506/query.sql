/*
Зміна 1
У таблиці publisher у видавця під назвою 'Wordsworth Editions' зміни назву на 'Author''s Edition'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
UPDATE publisher SET name = 'Author''s Edition' WHERE name = 'Wordsworth Editions';