package ua.javarush.task.jdk13.task41.task4122;

/* 
Memento mori
Клас Notepad є текстовим редактором, в якому можна:

- додавати текст (метод write);
- отримувати весь текст, який додано (print);
- зберігати поточний стан (save);
- відкочуватися до раніше збереженого стану (undo).

Тобі треба реалізувати дві останні функції за допомогою патерну Хранитель.

1. Клас TextWindow буде зберігати свій стан. Створи в ньому вкладений статичний клас TextWindowState з приватним фінальним
полем text типу String та конструктором з одним параметром, що ініціалізує поле.

2. Додай до класу TextWindow публічний метод save, що повертає TextWindowState.
Метод повинен створювати та повертати об'єкт TextWindowState, передаючи до конструктора текст із currentText.

3. Додай у клас TextWindow метод public void restore(TextWindowState ).
Метод повинен замінювати значення поля currentText новим об'єктом StringBuilder, що містить текст із параметра методу.

4. До класу Notepad додай ще одне приватне поле savedTextWindow типу TextWindowState.

5. До методу save класу Notepad збережи поточний стан textWindow у savedTextWindow.

6. У методі undo класу Notepad віднови стан textWindow з savedTextWindow.

Перевір, щоб функціонал save та undo працював.

Requirements:
1. Клас Solution не повинен змінюватися.
2. У класі TextWindow повинен існувати вкладений клас TextWindowState із полем text та конструктором згідно з умовою.
3. У класі TextWindow повинні бути методи save та restore відповідно до умови.
4. У класі Notepad має бути поле savedTextWindow, а методи save та undo реалізовані відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) {
        Notepad notepad = new Notepad(new TextWindow());
        notepad.write("Шаблон проектування Хранитель.\n");
        notepad.write("Як його застосовувати в Java?\n");
        notepad.save();

        notepad.write("Візьміть 300г борошна, 0.5л молока та 2 яйця...\n");

        notepad.undo();

        System.out.println(notepad.print());
    }
}
