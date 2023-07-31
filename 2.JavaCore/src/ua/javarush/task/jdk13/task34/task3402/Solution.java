package ua.javarush.task.jdk13.task34.task3402;

/* 
Факторіал за допомогою рекурсії
Почитай про обчислення факторіалу.
Реалізуй рекурсивну логіку методу factorial, де n - це число, факторіал якого потрібно обчислити.
Не створюй у класі Solution додаткові поля.

Requirements:
1. У класі Solution не має бути створено додаткових полів.
2. Метод factorial повинен повертати факторіал числа, яке прийняли за параметр.
3. Метод factorial не має бути статичним.
4. Метод factorial має бути рекурсивним.
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.factorial(9));     //362880
        System.out.println(solution.factorial(0));     //1
        System.out.println(solution.factorial(1));     //1
    }

    public int factorial(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
