package ua.javarush.task.pro.task12.task1217;

/* 
Назад у минуле
У класі Solution є поле intArray, гетер і сетер для нього, і метод main з оголошеними в ньому змінними.
Тобі потрібно замінити тип змінних var на конкретний тип об'єкта (змінювати назви та ініціалізацію об'єктів не можна),
а також полагодити гетер і сетер поля intArray.

Приклад:
var console = new Scanner(System.in);
замінити на:
Scanner console = new Scanner(System.in);


Requirements:
1. Заміни тип змінних var на конкретний тип об'єкта.
2. Полагодь гетер і сетер для поля intArray.
*/

public class Solution {

    // It was a condition:
//    private var intArray = new int[4];
//
//    public var getIntArray() {
//        return intArray;
//    }
//
//    public void setIntArray(var intArray) {
//        this.intArray = intArray;
//    }

    private int[] intArray = new int[4];

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {

        // It was a condition:
//        var solution = new Solution();
//        var string = new String("Hello");
//        var stringBuilder = new StringBuilder();

        Solution solution = new Solution();
        String string = new String("Hello");
        StringBuilder stringBuilder = new StringBuilder();
    }
}
