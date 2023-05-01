package ua.javarush.task.pro.task12.task1205;

/* 
Метод ділення
Реалізуй метод divide(double a, double b) так, щоб у консоль виводився результат ділення числа a на число b.
Має бути виведено таке значення:
Double.POSITIVE_INFINITY, якщо істинне будь-яке з таких тверджень:
a додатне і b дорівнює 0;
a дорівнює Double.POSITIVE_INFINITY і b >= 0 і b не дорівнює Double.POSITIVE_INFINITY;
a дорівнює Double.NEGATIVE_INFINITY і b < 0 і b не дорівнює Double.NEGATIVE_INFINITY;
Double.NEGATIVE_INFINITY, якщо істинне будь-яке з таких тверджень:
a від'ємне і b дорівнює 0;
a дорівнює Double.NEGATIVE_INFINITY і b >= 0 і b не дорівнює Double.POSITIVE_INFINITY;
a дорівнює Double.POSITIVE_INFINITY і b < 0 і b не дорівнює Double.NEGATIVE_INFINITY;
Double.NaN, якщо істинне будь-яке з таких тверджень:
a дорівнює 0 і b дорівнює 0;
принаймні один із операндів дорівнює Double.NaN;
a дорівнює Double.POSITIVE_INFINITY і b дорівнює Double.POSITIVE_INFINITY;
a дорівнює Double.POSITIVE_INFINITY і b дорівнює Double.NEGATIVE_INFINITY;
a дорівнює Double.NEGATIVE_INFINITY і b дорівнює Double.POSITIVE_INFINITY;
a дорівнює Double.NEGATIVE_INFINITY і b дорівнює Double.NEGATIVE_INFINITY;
Інакше — виводити результат ділення a на b.

Requirements:
1. Метод divide(double a, double b) має виводити в консоль результат ділення числа a на число b.
2. Метод divide(double a, double b) має виводити в консоль "Infinity" згідно з пунктом 1 умови.
3. Метод divide(double a, double b) має виводити в консоль "-Infinity" згідно з пунктом 2 умови.
4. Метод divide(double a, double b) має виводити в консоль "NaN" згідно з пунктом 3 умови.
*/

public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        //напишіть тут ваш код
        double c = a / b;
        System.out.println(c);

        // Якщо потрібно явно визначити поведінку для кожного випадку, як описано в умовах задачі:

//        double c;
//
//        if ((a > 0 && b == 0) ||
//                (a == Double.POSITIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY) ||
//                (a == Double.NEGATIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY)) {
//            c = Double.POSITIVE_INFINITY;
//        } else if ((a < 0 && b == 0) ||
//                (a == Double.NEGATIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY) ||
//                (a == Double.POSITIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY)) {
//            c = Double.NEGATIVE_INFINITY;
//        } else if ((a == 0 && b == 0) ||
//                (Double.isNaN(a) || Double.isNaN(b)) ||
//                (a == Double.POSITIVE_INFINITY && b == Double.POSITIVE_INFINITY) ||
//                (a == Double.POSITIVE_INFINITY && b == Double.NEGATIVE_INFINITY) ||
//                (a == Double.NEGATIVE_INFINITY && b == Double.POSITIVE_INFINITY) ||
//                (a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY)) {
//            c = Double.NaN;
//        } else {
//            c = a / b;
//        }
//
//        System.out.println(c);
//    }

    }
}
