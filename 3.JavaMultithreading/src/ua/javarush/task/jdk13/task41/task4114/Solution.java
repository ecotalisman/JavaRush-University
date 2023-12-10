package ua.javarush.task.jdk13.task41.task4114;

/* 
Калькулісімо
Дано: процесор, що вміє здійснювати арифметичні операції над двома числами.
За допомогою патерну Команда потрібно створити калькулятор, який буде інтерфейсом між користувачем та процесором.

Створи спільний інтерфейс команд Operation з одним методом void execute(int, int).
Створи клас Calculator. У ньому зберігатимуться операції, що підтримуються (команди). Також він прийматиме запити
користувача і за допомогою команд, що зберігаються, переадресовувати їх процесору.

1. У класі Calculator додай приватне фінальне поле Map<String, Operation> operationMap.
2. У класі Calculator додай конструктор без параметрів, у якому створи процесор і додай до operationMap чотири операції
з ключами "+", "-", "*", "/". Додавати можна, наприклад, так:

operationMap.put("+", processor::plus);

3. У класі Calculator додай метод public void calculate(int , String, int). У ньому за допомогою другого аргументу
отримай операцію з operationMap. Якщо такої операції немає, кинь IllegalStateException з повідомленням
такого типу: no operation registered for '%'.

Якщо в calculate другим аргументом прийшов рядок "%", наприклад, далі в отриманій операції виклич метод
execute і передай у нього перший і третій аргумент.

Готово! Тепер можна видалити main код роботи з процесором і розкоментувати код роботи з калькулятором.

Requirements:
1. Клас Processor не повинен змінюватись.
2. У класі Calculator має бути поле operationMap відповідно до умови.
3. У класі Calculator має бути конструктор, реалізований згідно з умовою.
4. У класі Calculator має бути метод calculate, реалізований згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        // It was a condition:
//        Processor processor = new Processor();
//        processor.plus(3, 9);
//        processor.minus(3, 9);
//        processor.multiply(3, 9);
//        processor.divide(3, 9);
//        processor.divide(-234, 12);
//        processor.plus(123, -631);

        Calculator calculator = new Calculator();
        calculator.calculate(3, "+", 9);
        calculator.calculate(3, "-", 9);
        calculator.calculate(3, "*", 9);
        calculator.calculate(3, "/", 9);
        calculator.calculate(-234, "/", 12);
        calculator.calculate(123, "+", -631);
    }
}
