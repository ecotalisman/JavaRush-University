package ua.javarush.task.jdk13.task34.task3404;

/* 
Ханойські вежі
Є три стрижня. На стрижень A нанизано numRings кілець, при цьому кільця відрізняються за розміром і лежать менше
на більшому. Потрібно перенести піраміду з numRings кілець зі стрижня A на стрижень B за найменшу кількість ходів.
За один раз дозволяється переносити лише одне кільце, при цьому не можна класти більше кільце на менше.
Треба реалізувати публічний статичний метод void moveRing(char a, char b, char c, int numRings), який виведе
послідовність дій, які необхідні для переміщення кілець зі стрижня A на стрижень B.

Параметри методу:
char a - ім'я стрижня, на якому спочатку знаходяться всі кільця;
char b - ім'я стрижня, на який потрібно перенести всі кільця;
char c - ім'я допоміжного стрижня;
int numRings - загальна кількість кілець, які необхідно перенести.
Завдання потрібно вирішити за допомогою рекурсивного виклику методу moveRing.

Приклад 1:
Метод moveRing викликається з параметрами: 'A', 'B', 'C', 1

Очікуване виведення:
from A to B

Приклад 2:
Метод moveRing викликається з параметрами: 'A', 'B', 'C', 3

Що очікуємо побачити у виведенні:
from A to B
from A to C
from B to C
from A to B
from C to A
from C to B
from A to B

Підказка: загальна кількість дій дорівнює 2 в степені numRings мінус 1.

Requirements:
1. У класі Solution повинен існувати публічний статичний метод void moveRing(char, char, char, int).
2. Метод moveRing має бути рекурсивним.
3. Кількість дій із переміщення кілець має дорівнювати 2 в степені numRings мінус 1.
4. Виведення методу moveRing має бути відповідним до умови завдання.
*/

public class Solution {
    public static void main(String[] args) {
        int numRings = 3;
        moveRing('A', 'B', 'C', numRings);
    }

    public static void moveRing(char a, char b, char c, int numRings) {
        //напишіть тут ваш код
        if (numRings > 0) {

            // Перенесемо n-1 кілець на допоміжний стрижень
            moveRing(a, c, b, numRings - 1);

            // Перенесемо найбільше кільце на кінцевий стрижень
            System.out.println("from " + a + " to " + b);

            // Перенесемо n-1 кілець з допоміжного стрижня на кінцевий
            moveRing(c, b, a, numRings - 1);
        }
    }
}

/*

код реалізує алгоритм Ганоївої вежі, і в цьому контексті 'A', 'B' та 'C' представляють стержні.
Давайте подивимося, як алгоритм працює на прикладі трьох кілець:

Ітерація 1:
Викликається функція moveRing('A', 'B', 'C', 3).
numRings більше нуля, тому ми виконуємо рекурсивний виклик moveRing('A', 'C', 'B', 2).

Ітерація 2:
Зараз ми виконуємо moveRing('A', 'C', 'B', 2).
Знову, numRings більше нуля, тому ми робимо рекурсивний виклик moveRing('A', 'B', 'C', 1).

Ітерація 3:
Зараз ми виконуємо moveRing('A', 'B', 'C', 1).
Так як numRings більше нуля, виконуємо ще один рекурсивний виклик moveRing('A', 'C', 'B', 0).

Ітерація 4:
Виконуємо moveRing('A', 'C', 'B', 0).
numRings рівне нулю, тому виходимо з цієї функції.

Ітерація 5:
Повертаємося до ітерації 3. Ми вже виконали перший рекурсивний виклик, тому тепер виводимо повідомлення
"from A to B" і виконуємо наступний рекурсивний виклик moveRing('C', 'B', 'A', 0).

Так само продовжується для всіх наступних ітерацій. Головне розуміння в цьому випадку - це те, що рекурсія вкладена
в рекурсію. Кожен виклик moveRing викликає два інших виклики moveRing, а результати кожного з цих викликів впливають
на наступні виклики.

Змінні a, b та c змінюються для кожного рекурсивного виклику, бо кожен виклик moveRing вимагає переміщення кілець
між різними стержнями.

*/