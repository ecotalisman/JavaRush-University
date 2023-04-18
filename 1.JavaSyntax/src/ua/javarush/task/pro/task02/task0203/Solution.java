package ua.javarush.task.pro.task02.task0203;

/* 
Остання цифра числа
У змінній number записане число.
У змінну lastDigit потрібно записати останню цифру цього числа.
Для обчислення використовуй змінну number і оператор «остача від ділення».
Для оголошення та ініціалізації змінної lastDigit використовуй одну команду.

Підказка: ділити потрібно на 10.


Requirements:
1. Не змінюй значення змінної number.
2. Для обчислення lastDigit потрібно використовувати number і оператор «остача від ділення».
3. Програма повинна виводити на екран значення змінної lastDigit.
*/

public class Solution {

    public static void main(String[] args) {
        int number = 546;

        int lastDigit = number % 10; //напишіть тут ваш код

        System.out.println(lastDigit);
    }
}