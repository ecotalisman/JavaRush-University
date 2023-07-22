package ua.javarush.task.pro.task18.task1817;

import java.util.stream.Stream;

/* 
Аналіз потоку чисел
Програма аналізує потік чисел. Логіка програми така:

Метод hasNegativeEvenNumbers(Stream<Integer>) повертає true, якщо у вхідному потоці є щонайменше одне від'ємне
парне число, і false, якщо таких чисел немає. Для пошуку чисел у потоці використай метод anyMatch() об'єкта
типу Stream<Integer>.

Метод hasOnlyPositiveNumbers(Stream<Integer>) повертає true, якщо у вхідному потоці є тільки додатні числа,
і false, якщо є щонайменше одне від'ємне число. Для пошуку чисел у потоці використай метод allMatch() об'єкта
типу Stream<Integer>.

Метод hasOnlyNegativeNumbers(Stream<Integer>) повертає true, якщо у вхідному потоці є тільки від'ємні числа, і false,
якщо є щонайменше одне додатне число. Для пошуку чисел у потоці використай метод noneMatch() об'єкта типу Stream<Integer>.

Метод main() під час тестування не перевіряється.

Requirements:
1. Публічний статичний метод hasNegativeEvenNumbers(Stream<Integer>) потрібно реалізувати згідно з умовою.
2. Публічний статичний метод hasOnlyPositiveNumbers(Stream<Integer>) потрібно реалізувати згідно з умовою.
3. Публічний статичний метод hasOnlyNegativeNumbers(Stream<Integer>) потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        String answerYes = "Yes";
        String answerNo = "No";

        Stream<Integer> stream1 = Stream.of(10, -22, 3, 12, -85, 0, 142);

        String answerNegativeEvenNumbers = hasNegativeEvenNumbers(stream1) ? answerYes : answerNo;
        System.out.println("Any negative even numbers in the stream? " + answerNegativeEvenNumbers);

        Stream<Integer> stream2 = Stream.of(10, 22, 3, 12, 85, 142);

        String answerOnlyPositiveNumbers = hasOnlyPositiveNumbers(stream2) ? answerYes : answerNo;
        System.out.println("Only positive numbers in the stream? " + answerOnlyPositiveNumbers);

        Stream<Integer> stream3 = Stream.of(-10, -22, -3, -12, -85, -142);

        String answerOnlyNegativeNumbers = hasOnlyNegativeNumbers(stream3) ? answerYes : answerNo;
        System.out.println("Only negative numbers in the stream? " + answerOnlyNegativeNumbers);
    }

    public static boolean hasNegativeEvenNumbers(Stream<Integer> stream) {
        //напишіть тут ваш код
        return stream.anyMatch(x -> x < 0 && x % 2 == 0);
    }

    public static boolean hasOnlyPositiveNumbers(Stream<Integer> stream) {
        //напишіть тут ваш код
        return stream.allMatch(x -> x > 0);
    }

    public static boolean hasOnlyNegativeNumbers(Stream<Integer> stream) {
        //напишіть тут ваш код
        return stream.noneMatch(x -> x > 0);
    }
}
