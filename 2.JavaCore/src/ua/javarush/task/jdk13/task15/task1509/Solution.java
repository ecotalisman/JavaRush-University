package ua.javarush.task.jdk13.task15.task1509;

/* 
Дефолтні значення
У цьому завданні тобі потрібно:

Створити 7 нестатичних полів класу:
intVar типу int
doubleVar типу double
DoubleVar типу Double
booleanVar типу boolean
ObjectVar типу Object
ExceptionVar типу Exception
StringVar типу String
Переконайся, що вони ініціалізуються дефолтними значеннями.
Виведи їх значення у встановленому порядку в методі main()

Requirements:
1. У класі Solution потрібно оголосити поле intVar типу int.
2. У класі Solution потрібно оголосити поле doubleVar типу double.
3. У класі Solution потрібно оголосити поле DoubleVar типу Double.
4. У класі Solution потрібно оголосити поле booleanVar типу boolean.
5. У класі Solution потрібно оголосити поле ObjectVar типу Object.
6. У класі Solution потрібно оголосити поле ExceptionVar типу Exception.
7. У класі Solution потрібно оголосити поле StringVar типу String.
8. Метод main має виводити значення полів на екран (кожне — з нового рядка чи через пробіл) у встановленому порядку.
Ініціалізувати змінні не потрібно.
*/

public class Solution {
    // Write code here:
    int intVar;
    double doubleVar;
    Double DoubleVar;
    boolean booleanVar;
    Object ObjectVar;
    Exception ExceptionVar;
    String StringVar;
    public static void main(String[] args) {

        // Write code here:
        Solution solution = new Solution();

        System.out.println(solution.intVar + " " + solution.doubleVar + " " +
                solution.DoubleVar + " " + solution.booleanVar + " " +
                solution.ObjectVar + " " + solution.ExceptionVar + " " + solution.StringVar);
    }
}
