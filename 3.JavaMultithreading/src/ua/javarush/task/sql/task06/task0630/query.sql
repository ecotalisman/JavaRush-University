/*
Додавання до таблиці FOREIGN KEY
Напиши скрипт додавання FOREIGN KEY до таблиці event за полем user_id із посиланням на поле id таблиці users.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
ALTER TABLE event ADD FOREIGN KEY (user_id) REFERENCES users(id);