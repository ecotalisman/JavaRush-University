/*
Вставка 3
Додай до таблиці lego_set чотири набори:
number name released inventory
- 42110 Land Rover Defender 2019 2573
- 75192 Millennium Falcon 2017 7541
- 70676 Lloyd's Titan Mech 2019 878
- 71043 Hogwarts Castle 2018 6020

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
INSERT INTO lego_set (number, name, released, inventory)
VALUES (42110, 'Land Rover Defender', 2019, 2573),
       (75192, 'Millennium Falcon', 2017, 7541),
       (70676, 'Lloyd''s Titan Mech', 2019, 878),
       (71043, 'Hogwarts Castle', 2018, 6020)
;