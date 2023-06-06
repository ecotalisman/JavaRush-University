package ua.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Стек в домашніх умовах
У класі MyStack потрібно реалізувати свою версію структури зберігання даних «стек» на базі ArrayList.
Всі елементи зберігаються в приватному списку storage. Твоє завдання — реалізувати всі оголошені методи класу MyStack, де

метод push(String) додає елемент у початок списку storage;
метод pop() повертає перший елемент списку storage, а потім видаляє його з цього списку;
метод peek() повертає перший елемент списку storage.
Метод empty() перевіряє, чи не є список storage порожнім.
Метод search(String) шукає елемент у списку storage і повертає його індекс; якщо елемента немає в списку — повертає -1.


Requirements:
1. Метод push(String) слід реалізувати згідно з умовою.
2. Метод pop() слід реалізувати згідно з умовою.
3. Метод peek() слід реалізувати згідно з умовою.
4. Метод empty() слід реалізувати згідно з умовою.
5. Метод search(String) слід реалізувати згідно з умовою.
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        //напишіть тут ваш код
        storage.add(0, s);
    }

    public String pop() {
        //напишіть тут ваш код
        String s = storage.get(0);
        storage.remove(0);
        return s;
    }

    public String peek() {
        //напишіть тут ваш код
        return storage.get(0);
    }

    public boolean empty() {
        //напишіть тут ваш код
        return storage.isEmpty();
    }

    public int search(String s) {
        //напишіть тут ваш код
        return storage.indexOf(s);
    }
}
