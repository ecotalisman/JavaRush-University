/*
Створюємо таблицю
У цьому завданні тобі знадобиться:
1. Створити таблицю під назвою users.
2. Додати обов'язкову колонку user_id з типом INT без обмеження та з auto increment.
3. Додати обов'язкову колонку first_name з типом VARCHAR та обмеженням на 255 символів.
4. Додати обов'язкову колонку last_name з типом VARCHAR та обмеженням на 255 символів.
5. Зазначити стовпчик user_id як PRIMARY KEY.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
CREATE TABLE users (
    user_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    PRIMARY KEY (user_id)
);