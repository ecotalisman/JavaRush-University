/*
Користувач вирішує задачі
Напиши запит, який з таблиці event вибере рік, місяць, день з поля date та кількість подій, які належать до цього року, місяця та дня.
Вибрати дані для користувача з id = 3 (user_id), подія — вирішення задачі (поле type дорівнює 'SOLVE_TASK') з успішним статусом (поле status дорівнює 'OK').

Requirements:
1. Запит має бути реалізований згідно з умовою.
*/
-- Write your code here:
SELECT YEAR(date), MONTH(date), DAY(date), COUNT(*)
FROM event
WHERE user_id = 3
  AND type = 'SOLVE_TASK'
  AND status = 'OK'
GROUP BY YEAR(date), MONTH(date), DAY(date);
