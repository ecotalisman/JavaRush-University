/*
Зміна 2
Внеси зміни до таблиці part:
- у деталі з номером 92909 зміни назву на 'Technic, Steering Wheel Hub 3 Pin Round';
- у деталі з номером 19916 зміни назву на 'Minifigure, Headgear Helmet SW Darth Vader Type 2 Top'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
UPDATE part
SET name = 'Technic, Steering Wheel Hub 3 Pin Round'
WHERE number = 92909;

UPDATE part
SET name = 'Minifigure, Headgear Helmet SW Darth Vader Type 2 Top'
WHERE number = 19916;