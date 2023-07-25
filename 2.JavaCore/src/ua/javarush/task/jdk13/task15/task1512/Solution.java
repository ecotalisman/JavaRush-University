package ua.javarush.task.jdk13.task15.task1512;

/* 
Порядок завантаження змінних
Розберися, що та в якій послідовності ініціалізується в цій програмі, а потім:
Постав брейкпоінти та використовуй дебагер.
Виправ порядок ініціалізації даних таким, щоб результат був таким:
static void init()
Static block
public static void main
Non-static block
static void printAllFields
0
null
Solution constructor
static void printAllFields
6
First name

Requirements:
1. Програма має виводити дані на екран.
2. Виведення на екран має відповідати умові задачі.
3. Результатом роботи статичного ініціалізатора класу Solution має бути виведення на екран рядків "static void init()"
і "Static block".
4. Програма не повинна зчитувати дані з клавіатури.
*/

public class Solution {
    // Change code: init() - run first before "Static block"
    static {
        init();
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");

        // It was a condition:
//        System.out.println(obj.name);
//        System.out.println(obj.i);

        // Change code here:
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
