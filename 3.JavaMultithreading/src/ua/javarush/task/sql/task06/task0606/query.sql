/*
Заповнюємо таблицю гравцями
Давай спробуємо створити найкращу команду в історії футболу. Додай до таблиці team наступних 11 гравців:
position full_name number

Goalkeeper Gianluigi Buffon 1
Right-back Cafu 2
Centre-back Franz Beckenbauer 3
Centre-back Bobby Moore 4
Left-back Paolo Maldini 5
Midfield Johan Cruyff 6
Midfield Zinedine Zidane 7
Midfield Andrea Pirlo 8
Midfield Lothar Matthaus 9
Striker Pele 10
Forward Marco van Basten 11

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
INSERT INTO team (position, full_name, number)
VALUES
    ('Goalkeeper', 'Gianluigi Buffon', 1),
    ('Right-back', 'Cafu', 2),
    ('Centre-back', 'Franz Beckenbauer', 3),
    ('Centre-back', 'Bobby Moore', 4),
    ('Left-back', 'Paolo Maldini', 5),
    ('Midfield', 'Johan Cruyff', 6),
    ('Midfield', 'Zinedine Zidane', 7),
    ('Midfield', 'Andrea Pirlo', 8),
    ('Midfield', 'Lothar Matthaus', 9),
    ('Striker', 'Pele', 10),
    ('Forward', 'Marco van Basten', 11)
;