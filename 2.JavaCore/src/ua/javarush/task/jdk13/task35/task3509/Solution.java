package ua.javarush.task.jdk13.task35.task3509;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Wildcards для колекцій
У класі Solution реалізовано 4 методу для роботи зі списками:
sum - підсумовує всі елементи списку, в якому знаходяться будь-які числа,
multiply - перемножує між собою всі елементи списку, в якому знаходяться будь-які числа,
concat - об'єднує всі елементи списку в один рядок,
combine - приймає на вхід список будь-яких колекцій та повертає результуючий список, в якому знаходяться всі елементи зі списків.

Додай для кожного вхідного типу List оптимальний шаблон (wildcard), щоб метод міг приймати лише ті елементи, які може обробити.

Requirements:
1. Для типу параметра методу sum(List list) необхідно додати оптимальний шаблон (wildcard).
2. Для типу параметра методу multiply(List list) необхідно додати оптимальний шаблон (wildcard).
3. Для типу параметра методу concat(List list) необхідно додати оптимальний шаблон (wildcard).
4. Для типу параметра методу combine(List list) необхідно додати оптимальний шаблон (wildcard).
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static Double sum(List<? extends Number> list) {
        Double result = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Number numb = (Number) list.get(i);
            result += numb.doubleValue();
        }
        return result;
    }

    public static Double multiply(List<? extends Number> list) {
        Double result = 1.0;
        for (int i = 0; i < list.size(); i++) {
            Number numb = (Number) list.get(i);
            result *= numb.doubleValue();
        }
        return result;
    }

    public static String concat(List<?> list) {
        StringBuilder builder = new StringBuilder();
        for (Object obj : list) {
            builder.append(obj);
        }
        return builder.toString();
    }

    public static List combine(List<? extends Collection> list) {
        List result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Collection collection = (Collection) list.get(i);
            result.addAll(collection);
        }
        return result;
    }
}

/*

розглянемо, як ваші зміни застосовуються до кожного з методів:

1) sum(List<? extends Number> list) та multiply(List<? extends Number> list): Ці методи можуть працювати з
будь-якими списками, що містять елементи, які наслідують від Number (або є екземплярами Number). Це означає,
що ви можете передати список будь-яких чисел (Integer, Double, Float і т.д.).

2) Метод concat(List<?> list) тепер приймає список будь-якого типу об'єктів, а не обмежується лише String.
Це відбувається тому, що ви використовуєте метод StringBuilder.append(Object obj), який може прийняти будь-який об'єкт,
а не тільки String.

3) Метод combine(List<? extends Collection> list) тепер може приймати список будь-якого типу колекцій, а не тільки List.
Це включає в себе такі типи колекцій, як Set або Queue.

Ваша реалізація методів дозволяє безпечно працювати з об'єктами відповідних типів без створення помилок компіляції
або ClassCastException у часі виконання.

Такі зміни роблять ваш код більш гнучким і універсальним. Якщо ви впевнені, що об'єкти, які передаються в метод concat,
мають відповідний метод toString(), тоді цей підхід працюватиме коректно. Щодо методу combine, він також буде працювати
коректно з будь-яким типом колекцій.

*/