package ua.javarush.task.pro.task12.task1212;

/* 
Створюємо свій список
ArrayList — це список, який зберігає динамічно розширюваний масив елементів. Зараз ми будемо реалізовувати свою версію
списку, в якому зберігаються рядки. Клас CustomStringArrayList має три поля:
String[] elements — це масив поточних елементів (у схожому масиві зберігає значення ArrayList). Початково його розмір
дорівнює 10 (capacity = 10).
int size — кількість заповнених елементів, початкове значення — 0.
int capacity — поточна місткість масиву (elements) даних, яка збільшуватиметься в ході додавання даних.
Для простоти реалізації ми будемо використовувати лише два методи:

Публічний метод add(String), який додає елементи в масив. Цей метод дасть нам змогу побачити, як масив динамічно
розширюється.
Коли масив заповнено (size == capacity), викликається метод grow() для розширення масиву.
Приватний метод grow(), який має присвоїти полю elements новий масив у півтора раза більшої місткості (capacity),
ніж у старого масиву, і скопіювати дані зі старого масиву в новий у тому самому порядку. Поле capacity має збільшитися
так само, як і розмір масиву.

Requirements:
1. Клас CustomStringArrayList має містити нестатичні приватні поля int size, int capacity, String[] elements.
2. Клас CustomStringArrayList має містити конструктор без параметрів, який ініціалізує поле size значенням 0, поле
capacity — значенням 10, поле elements — новим масивом (розмір масиву — capacity).
3. Клас CustomStringArrayList має містити метод public void add(String).
4. Клас CustomStringArrayList має містити метод private void grow().
5. Метод grow() має працювати згідно з умовою.
6. Метод add(String) змінювати не можна.
*/

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишіть тут ваш код
        capacity *= 1.5;
        String[] newElements = new String[capacity];
        newElements = Arrays.copyOf(elements, capacity);
        elements = newElements;

//        capacity *= 1.5;
//        String[] newElements = new String[capacity];
//        System.arraycopy(elements, 0, newElements, 0, size);
//        elements = newElements;
    }
}


/*

System.arraycopy() - це інший спосіб копіювання елементів масиву. Він працює наступним чином:

System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);

src - вихідний масив, з якого копіюються елементи.
srcPos - початкова позиція в вихідному масиві, з якої починається копіювання.
dest - призначений масив, в який копіюються елементи.
destPos - початкова позиція в призначеному масиві, куди будуть копіюватися елементи.
length - кількість елементів, які будуть скопійовані з вихідного масиву в призначений масив.

Ось приклад використання System.arraycopy() для копіювання елементів:

private void grow() {
    capacity = (int) (capacity * 1.5);
    String[] newElements = new String[capacity];
    System.arraycopy(elements, 0, newElements, 0, size);
    elements = newElements;
}
Цей код робить те ж саме, що й код з використанням Arrays.copyOf(). Обидва підходи правильні
та працездатні, можна вибрати той, який зручніший.

*/