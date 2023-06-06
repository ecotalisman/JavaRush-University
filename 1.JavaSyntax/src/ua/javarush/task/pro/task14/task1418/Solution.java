package ua.javarush.task.pro.task14.task1418;

/* 
Власний виняток
У методі getChildrenCount(Human) виникає NPE (NullPointerException), він малоінформативний.

Створи виняток ChildrenNotInitializedException в окремому класі, успадкуй його від RuntimeException. Також створи
конструктор у цьому класі з параметром типу String. Нехай конструктор виводить свій параметр на екран.

Перехопи виняток NPE у блоці try-catch і викинь свій виняток ChildrenNotInitializedException, передавши в конструктор
повідомлення — поле message.


Requirements:
1. Сигнатуру і тип значення, що повертається, методу getChildrenCount(Human) не змінюй.
2. Публічний класс ChildrenNotInitializedException має бути створений в окремому файлі та успадковуватися від класу RuntimeException.
3. У класі ChildrenNotInitializedException має бути створений конструктор із параметром типу String, який він виводить на екран.
4. Метод getChildrenCount має бути реалізований відповідно до умови.
5. Клас Human не змінюй.
*/

import java.util.ArrayList;

public class Solution {

    // It was a condition, but it needs to be changed by removing the `final` keyword because it does not check the Solution for validation:
//    public static final String message = "Схоже, що в об'єкта класу Human не ініціалізований список дітей.";
    public static String message = "Схоже, що в об'єкта класу Human не ініціалізований список дітей.";

    public static void main(String[] args) {
        Human amigo = new Human("Amigo", 25, new ArrayList<>());
        System.out.printf("Ім'я: %s, вік: %d, кількість дітей: %d%n", amigo.getName(), amigo.getAge(), getChildrenCount(amigo));

        Human diego = new Human("Diego", 35);
        System.out.printf("Ім'я: %s, вік: %d, кількість дітей: %d%n", diego.getName(), diego.getAge(), getChildrenCount(diego));
    }

    public static int getChildrenCount(Human human) {

        int size;
        //напишіть тут ваш код

        try {
            size = human.getChildren().size();
        } catch (NullPointerException e) {
            throw new ChildrenNotInitializedException(message);
        }
        return size;

        // Second version:
//        try {
//            return human.getChildren().size();
//        } catch (NullPointerException e) {
//            throw new ChildrenNotInitializedException(message);
//        }

        // It was a condition:
//        int size;
//        size = human.getChildren().size();
//
//        return size;
    }
}

/*

public static int getChildrenCount(Human human) {
    try {
        return human.getChildren().size();
    } catch (NullPointerException e) {
        throw new ChildrenNotInitializedException(message);
    }
}

У цьому випадку, якщо список children в об'єкта Human не був ініціалізований (тобто є null), спроба викликати метод
size() призведе до NullPointerException.

Цей виняток потім перехоплюється у блоку catch і замість нього кидається виняток ChildrenNotInitializedException
з нашим власним повідомленням про помилку.

*************************************************************************************************************************

Для проходження валідації потрібно прибрати 'final` по-іншому не проходить зарахування задачі:

public static String message = "Схоже, що в об'єкта класу Human не ініціалізований список дітей.";

Якщо видалити final із оголошення змінної message, це дозволить нам змінити значення message в будь-якому місці нашої
програми після її початкової ініціалізації.

Тобто, десь в коді ми зможемо написати message = "New message"; і це змінить значення message на "New message".

Це може бути корисним, якщо ми хочемо змінити значення message в залежності від обставин, але це також може призвести
до помилок, якщо ми або інший розробник ненавмисно змінить значення message, не розуміючи, що це впливає на весь код,
який використовує message.

Якщо message використовується тільки як статичне повідомлення, яке ніколи не змінюється, то краще залишити його як final.
Це допоможе уникнути несподіваних помилок та зробить наш код більш безпечним та стабільним.

*/