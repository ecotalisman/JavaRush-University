/*
Створюємо таблицю 2
У цьому завданні тобі знадобиться:
1. Створити таблицю під назвою users.
2. Додати обов'язкову колонку user_id з типом INT без обмеження та з auto increment.
3. Додати обов'язкову колонку first_name з типом VARCHAR та обмеженням на 255 символів.
4. Додати обов'язкову колонку last_name з типом VARCHAR та обмеженням на 255 символів.
5. Додати обов'язкову колонку date з типом DATE без обмеження та зверненням до методу GETDATE() як дефолтне значення.
6. Додати необов'язкову колонку weight із типом FLOAT та обмеженням на 10 символів.
7. Вказати колонку user_id як PRIMARY KEY.

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
CREATE TABLE users (
    user_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    date DATE NOT NULL DEFAULT GETDATE(),
    weight FLOAT(10) NULL,
    PRIMARY KEY (user_id)
);