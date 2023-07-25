package ua.javarush.task.jdk13.task15.task1510;

/* 
Статики й винятки
У статичному блоці класу Solution напиши код, виконання якого призведе до появи винятку.
У результаті клас не завантажиться, і замість значення змінної B з'явиться повідомлення про помилку:
Exception in thread "main" java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.javarush.task.task15.task1517.Solution.<clinit>(Solution.java:22)

Hint: Потрібно погуглити причину, якщо сталося таке:
java: initializer must be able to complete normally
java: unreachable statement

Requirements:
1. У класі Solution у статичному блоці має виникати виняток (Exception).
2. Програма не має виводити на екран нічого, окрім автоматичного повідомлення про виняток.
3. Програма не повинна зчитувати дані з клавіатури.
4. Клас Solution має бути public.
*/

public class Solution {
    public static int A = 0;

    static {
        // throw an exception here - викиньте ексепшн тут
        if (true) {
            throw new RuntimeException();
        }
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

/*

ExceptionInInitializerError це виняток, який виникає, коли Java намагається завантажити клас і виникає помилка в
статичному блоку ініціалізації класу (відсюда і назва - помилка при ініціалізації).

У коді виникає цей виняток, але він замаскований іншим винятком (RuntimeException), який ми самі кидаємо в
статичному блоку. ExceptionInInitializerError "обгортає" наш RuntimeException як свою причину (cause).

У повідомленні про помилку ми бачимо стек викликів (stack trace), що веде до винятка. Це не обов'язково має бути
точно таким самим у нашому середовищі виконання. Він може відрізнятися в залежності від версії Java, середовища
виконання (IDE), операційної системи тощо.

Отже, наш виняток є ExceptionInInitializerError, і він виник через RuntimeException, який ми кинули в статичному блоку.
Це повідомлення про помилку може виглядати трохи інакше, але суть та сама.

if (true) в цьому контексті використовується для того, щоб обійти обмеження компілятора Java на статичних блоках.
Компілятор Java вимагає, щоб статичні блоки завжди мали змогу завершити виконання нормально. Це означає, що ми не можемо
просто викласти код, який обов'язково кине виняток, як ми намагалися зробити.

Ось чому нам потрібен if (true). Це грубий трюк, який дозволяє обійти обмеження компілятора. if (true) завжди
виконується, але компілятор "бачить" його як код, який можливо не виконається, тому ми можемо кинути виняток
всередині цього блоку.

У нашому випадку, без if (true), компілятор бачить, що ми намагаємося завантажити клас, який обов'язково кине виняток
під час ініціалізації, і він відмовляється компілювати такий код.

*/