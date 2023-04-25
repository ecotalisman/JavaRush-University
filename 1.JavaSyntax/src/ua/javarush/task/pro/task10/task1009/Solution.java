package ua.javarush.task.pro.task10.task1009;

/* 
Порівняння рядків
У методі main оголошено змінні типу String. У консоль виводиться результат їх порівняння: якщо рядки однакові,
виводиться true, інакше — false. Тобі потрібно розкоментувати один рядок так, щоб у консоль виводилося
true
true

Тіло методу main змінювати не можна: дозволено лише розкоментувати один рядок.


Requirements:
1. У методі main потрібно тільки розкоментувати один рядок: додавати або змінювати решту коду не можна.
2. Результат виведення має відповідати умові.
*/

public class Solution {

    public static void main(String[] args) {
        String s1 = new String("JavaRush");
        s1 = "JavaRush";    // My uncomment row
        String s2 = "JavaRush";
//        s2 = new String("JavaRush");
        String s3 = "JavaRush";
//        s3 = new String("JavaRush");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
