package ua.javarush.task.pro.task13.task1326;

import java.util.*;

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        // It was a condition:
//        return null;

        //напишіть тут ваш код
        return values.iterator();
    }

    @Override
    public int size() {
        // It was a condition:
//        return 0;

        //напишіть тут ваш код
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        // It was a condition:
//        return false;

        //напишіть тут ваш код
        return values.add(o);
    }

    @Override
    public String poll() {
        // It was a condition:
//        return null;

        //напишіть тут ваш код
        if (values.isEmpty()) {
            return null;
        } else {
            return values.remove(0);    // видаляє і повертає перший елемент
        }
    }

    @Override
    public String peek() {
        // It was a condition:
//        return null;

        //напишіть тут ваш код
        if (values.isEmpty()) {
            return null;
        } else {
            return values.get(0);
        }
    }
}


/*

Метод offer використовує метод add списку values для додавання елементу в кінець.

Метод poll перевіряє, чи values порожній, і якщо ні, видаляє і повертає перший елемент. Якщо values порожній,
він повертає null.

Метод peek перевіряє, чи values порожній, і якщо ні, повертає перший елемент без його видалення. Якщо values порожній,
він повертає null.

Метод remove(int index) у ArrayList не тільки видаляє елемент зі списку, але й повертає його. Тобто, він робить обидві
операції, які ви хочете зробити: він повертає елемент і видаляє його зі списку.

Цей код працюватиме так, як ви хочете: він поверне перший елемент списку values і видалить його зі списку. Якщо список
values порожній, він поверне null.

*/