package ua.javarush.task.jdk13.task35.task3508;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Вхід заборонено!
Проаналізуй класи в задачі.
У методі main створено два будинки: один для котів і один для собак.
Втім зараз, коли до будинку для кішок заходить собака, виникає конфлікт, і всі коти, які знаходяться в ньому, вимушені
покинути будинок (метод checkConflicts).

Допоможи котам захистити свій будинок від сторонніх, а також не дозволити їм випадково заходити до будинку для собак.
Для цього параметризируй House типом T і внеси відповідні правки до реалізації класу.

Метод main не бере участі в тестуванні.

Requirements:
1. Клас House має бути параметризованим з типом T.
2. Поле residents у класі House має бути параметризованим типом T.
3. Метод enter у класі House повинен приймати об'єкт типу T.
4. Метод leave у класі House повинен приймати об'єкт типу T.
5. Метод checkConflicts у класі House більше не потрібен - його необхідно видалити.
*/

public class House<T> {

    private List<T> residents = new ArrayList<>();

    public void enter(T resident) {
        residents.add(resident);
//        checkConflicts();
    }

    public void leave(T resident) {
        residents.remove(resident);
    }

//    private void checkConflicts() {
//        boolean conflict = false;
//        for (Object resident : residents) {
//            if (resident instanceof Dog) {
//                conflict = true;
//            }
//        }
//
//        if (conflict) {
//            Iterator iterator = residents.iterator();
//            while (iterator.hasNext()) {
//                Object resident = iterator.next();
//                if (resident instanceof Cat) {
//                    iterator.remove();
//                }
//            }
//        }
//    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("У будинку знаходяться:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Dog bruno = new Dog("Bruno");
        Puppy larsik = new Puppy("Larsik");
        Cat barsik = new Cat("Barsik");
        Kitten keksik = new Kitten("Keksik");

        House dogHouse = new House();
        dogHouse.enter(bruno);
        dogHouse.enter(larsik);
        dogHouse.enter(barsik);
        System.out.println(dogHouse.toString());

        House catHouse = new House();
        catHouse.enter(barsik);
        catHouse.enter(keksik);
        catHouse.enter(bruno);
        System.out.println(catHouse.toString());
    }
}
