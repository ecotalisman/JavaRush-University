/*
Додавання до таблиці FOREIGN KEY з опціями
Напиши скрипт додавання FOREIGN KEY з опціями ON UPDATE CASCADE, ON DELETE SET NULL до таблиці event за полем user_id
із посиланням на поле ID таблиці users.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
ALTER TABLE event ADD FOREIGN KEY (user_id) REFERENCES users(ID) ON UPDATE CASCADE ON DELETE SET NULL;