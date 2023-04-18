package ua.javarush.task.pro.task05.task0504;

/* 
Об'єднуємо масиви
Реалізувати метод main(String[]), який має скопіювати вміст масивів firstArray і secondArray в один масив resultArray.
Масив firstArray має бути розташований на початку нового масиву resultArray, а secondArray — після першого.


Requirements:
1. У класі Solution має бути публічна статична змінна firstArray типу int[], проініціалізована масивом з 10 значеннями.
2. У класі Solution має бути публічна статична змінна secondArray типу int[], проініціалізована масивом з 10 значеннями.
3. У класі Solution має бути публічна статична змінна resultArray типу int[].
4. Реалізуй метод main(String[]) згідно з умовою.
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //напишіть тут ваш код
        resultArray = new int[firstArray.length + secondArray.length];

        int index = 0;

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[index++] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            resultArray[index++] = secondArray[i];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
