package ua.javarush.task.jdk13.task23.task2301;

/* 
Inner
Реалізувати метод getTwoSolutions, який має повертати масив з 2-х экземплярів класу Solution.
Для кожного екземпляра класу Solution ініціалізувати поле innerClasses двома значеннями.
Ініціалізація всіх даних має відбуватися лише в методі getTwoSolutions.

Requirements:
1. У класі Solution потрібно реалізувати метод getTwoSolutions.
2. Метод getTwoSolutions має бути статичним.
3. Метод getTwoSolutions має бути публічним.
4. Метод getTwoSolutions має повертати масив типу Solution, який заповнено відповідно до умов завдання.
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static void main(String[] args) {

    }

    public static Solution[] getTwoSolutions() {
        // It was a condition:
//        return null;

        // Change code here:
        Solution[] solutions = new Solution[2];

        for (int i = 0; i < solutions.length; i++) {
            Solution solution = new Solution();
            solution.innerClasses[0] = new InnerClass();
            solution.innerClasses[1] = new InnerClass();
            solutions[i] = solution;
        }

        return solutions;
    }

    public static class InnerClass {
    }
}
