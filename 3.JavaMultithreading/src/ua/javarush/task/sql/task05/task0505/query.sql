/*
Вставка 5
Додай до таблиці object чотири об'єкти:
- відкритий 12 грудня 2020 року системою 'Pan-STARRS 1' астероїд '2020 XL5';
- супутник Землі 'Moon', відкривача та дату відкриття залишити null;
- планету 'Jupiter';
- відкриту 17 січня 1910 року астрономом 'Robert T. A. Innes' комету 'C/1910 A1'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
INSERT INTO object (name, type, discoverer, discovery_date)
VALUES ('2020 XL5', 'ASTEROID', 'Pan-STARRS 1', '2020-12-12'),
    ('Moon', 'SATELLITE', null, null),
    ('Jupiter', 'PLANET', null, null),
    ('C/1910 A1', 'COMET', 'Robert T. A. Innes', '1910-01-17');