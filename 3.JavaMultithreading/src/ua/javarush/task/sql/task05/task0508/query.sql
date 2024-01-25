/*
Зміна 3
Внеси зміни до таблиці author:
- В автора з повним ім'ям 'C. S. Lewis' зміни повне ім'я на 'Clive Staples Lewis';
- У автора з повним ім'ям 'J. R. R. Tolkien' зміни повне ім'я на 'John Ronald Reuel Tolkien';
- У автора з повним ім'ям 'Friedrich Nietzsche' зміни повне ім'я на 'Friedrich Wilhelm Nietzsche';
- У автора з повним ім'ям 'Stephen King' зміни повне ім'я на 'Stephen Edwin King';
- у автора з повним ім'ям 'Aldous Huxley' зміни повне ім'я на 'Aldous Leonard Huxley'.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
UPDATE author SET full_name = 'Clive Staples Lewis' WHERE full_name = 'C. S. Lewis';
UPDATE author SET full_name = 'John Ronald Reuel Tolkien' WHERE full_name = 'J. R. R. Tolkien';
UPDATE author SET full_name = 'Friedrich Wilhelm Nietzsche' WHERE full_name = 'Friedrich Nietzsche';
UPDATE author SET full_name = 'Stephen Edwin King' WHERE full_name = 'Stephen King';
UPDATE author SET full_name = 'Aldous Leonard Huxley' WHERE full_name = 'Aldous Huxley';
