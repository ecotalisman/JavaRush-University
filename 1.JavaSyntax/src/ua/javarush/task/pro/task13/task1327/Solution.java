package ua.javarush.task.pro.task13.task1327;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Як влізти без черги
У рядку оголошення поля queue ініціалізуй його іншим класом замість LinkedList так, щоб метод main вивів усі літери в алфавітному порядку.

Можеш пошукати серед наявних реалізацій черги або написати свою :)

Requirements:
1. У місці ініціалізації поля queue queue потрібно замінити LinkedList на інший клас.
2. Не можна змінювати метод main.
3. Метод main повинен надрукувати літери в алфавітному порядку.
*/

public class Solution {
    // It was a condition:
//    public static Queue<Character> queue = new LinkedList<>();

    // write code here:
    public static Queue<Character> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        queue.addAll(Arrays.asList('М', 'Ч', 'Р', 'Ж', 'Ц', 'В', 'С', 'А', 'Ф', 'Н', 'З', 'Б', 'Ш', 'К', 'О', 'У', 'Г', 'П', 'И', 'Е', 'Т', 'Х', 'Л'));

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}

/*
LinkedList (class) implements від Deque (interface)
а Deque (interface) extends Queu (interface)
Queu (interface) extends Collection (interface)
Collection (interface) extends Iterable (interface)

implements в Java використовується для вказівки на те, що клас реалізує певний інтерфейс. Інтерфейс у Java - це
контракт, який гарантує, що клас, який його реалізує, матиме певні методи. Коли клас реалізує інтерфейс, він повинен
надати реалізацію для всіх методів, визначених в інтерфейсі.

У вашому питанні, LinkedList - це клас, який реалізує інтерфейс Deque. Це означає, що LinkedList має реалізувати всі
методи, визначені в Deque.

extends в Java використовується, коли один інтерфейс наслідує інший, або коли один клас наслідує інший. Інтерфейс,
який розширює інший інтерфейс, успадковує всі його методи. Тому, коли Deque розширює Queue, він успадковує всі методи
Queue. Так само, коли Queue розширює Collection, він успадковує всі методи Collection, і коли Collection розширює
Iterable, він успадковує всі методи Iterable.

Отже, коли LinkedList реалізує Deque, він не тільки повинен реалізувати всі методи Deque, але й всі методи Queue,
Collection, і Iterable, які Deque успадковує.

***********************************************************************************************************************************

Використання PriorityQueue замість LinkedList для ініціалізації черги queue.

PriorityQueue - це реалізація черги з пріоритетами в Java, де елементи обробляються відповідно до їхнього природного
порядку або відповідно до порядку, встановленого компаратором (при використанні компаратора при створенні черги).

В даному випадку, ми додали символи до PriorityQueue без використання компаратора, отже, символи будуть оброблятися
відповідно до їхнього природного порядку (в алфавітному порядку для символів).

Метод poll() видаляє та повертає головний елемент черги (тобто елемент з найвищим пріоритетом - в даному випадку,
символ, що йде наступним в алфавітному порядку), або повертає null, якщо черга порожня.

Таким чином, коли ми викликаємо queue.poll() в циклі while, ми друкуємо символи в алфавітному порядку до тих пір, поки черга не опустіє.
*/