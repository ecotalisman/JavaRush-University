package ua.javarush.task.jdk13.task41.task4101;

import java.util.HashSet;
import java.util.Set;

/* 
Мікроскопом по цвяхах
Розберися, що робить програма. Як бачиш, під час створення другого робітника виникає помилка компіляції.

Потрібно вирішити цю проблему без зміни класів Hammer, Nail, HardWorker, Microscope.
Для цього створи новий клас MicroscopeAdapter, успадкований від Hammer. Додай йому поле microscope типу Microscope,
ініціалізуй його в конструкторі. Перевизнач метод hit, щоб він викликав у мікроскопа метод bang і завжди повертав false.
У методі main оберни мікроскоп, що передається другому робочому, в адаптер, що в тебе вийшов. Більше нічого не змінюй.

Адаптер вийшов простенький, тож подумай, як його можна вдосконалити.

Requirements:
1. Класи Hammer, Nail, HardWorker, Microscope не повинні змінюватись.
2. У кореневій папці завдання має бути клас MicroscopeAdapter, спадкоємець Hammer.
3. У класу MicroscopeAdapter має бути приватне нестатичне поле microscope типу Microscope.
4. У класу MicroscopeAdapter повинен бути конструктор з одним параметром, що ініціалізує поле.
5. У класу MicroscopeAdapter повинен бути перевизначений метод hit, що викликає метод bang і повертає false.
6. Метод main повинен створити об'єкт MicroscopeAdapter і передати його до конструктора другого робітника.
*/

public class Solution {

    public static void main(String[] args) {
        HardWorker worker1 = new HardWorker("Bob", getNailsPack(), new Hammer());
        HardWorker worker2 = new HardWorker("Bob Jr.", getNailsPack(), new MicroscopeAdapter(new Microscope()));

        worker1.hammerAllNails();
        worker2.hammerAllNails();
    }

    public static Set<Nail> getNailsPack() {
        Set<Nail> nailPack = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            nailPack.add(new Nail());
        }
        return nailPack;
    }
}
