package ua.javarush.task.jdk13.task34.task3401;

/* 
Числа Фібоначчі за допомогою рекурсії
Почитай про числа Фібоначчі.
Реалізуй рекурсивну логіку методу fibonacci, де n - це номер елементу у послідовності Фібоначчі.
Не створюй в класі Solution додаткові поля.

Requirements:
1. У класі Solution не має бути створено додаткових полів.
2. Метод fibonacci повинен приймати порядковий номер шуканого числа послідовності Фібоначчі та повертати його значення.
3. Метод fibonacci не має бути статичним.
4. Метод fibonacci має бути рекурсивним.
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.fibonacci(9));     //34
        System.out.println(solution.fibonacci(5));     //5
        System.out.println(solution.fibonacci(2));     //1
        System.out.println(solution.fibonacci(1));     //1
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

/*

Послідовність Фібоначчі - це ряд чисел, в якому кожне число є сумою двох попередніх чисел. Вона починається з 0 і 1.
Ось перші десять чисел цієї послідовності:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Умова для створення чисел Фібоначчі може бути записана так:

Перше та друге числа послідовності Фібоначчі визначені як F(0) = 0 і F(1) = 1.
Для всіх n > 1, F(n) = F(n-1) + F(n-2).
Це означає, що кожне наступне число послідовності є сумою двох попередніх чисел.

*/