package ua.javarush.task.jdk13.task14.task1406;

/* 
Без помилок
Давай напишемо програму, яка створює мишеня.
Для цього ініціалізуй об'єкт obj таким класом, щоб метод main() виконався без помилок.

Requirements:
1. Клас GrayMouse має успадковуватися від класу Mouse.
2. Клас Jerry має успадковуватися від класу GrayMouse.
3. У змінній obj повинен зберігатися об'єкт, який буде одночасно і Mouse, і GrayMouse, і Jerry.
4. Метод main повинен викликати метод printClasses.
*/

import ua.javarush.task.jdk13.task14.task1406.Solution.Mouse;

public class Solution {
    public static void main(String[] args) {
        Object obj = new Jerry(); //напишіть тут ваш код

                Mouse mouse = (Mouse) obj;
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse {
    }

    static class GrayMouse extends Mouse {
    }

    static class Jerry extends GrayMouse {
    }
}

/*

код вже демонструє ідею висхідного і низхідного приведення.

Висхідне приведення (upcasting) - це процес приведення об'єкта до типу одного з його базових класів. Це дозволяє
використовувати об'єкт через змінну базового класу. Висхідне приведення відбувається автоматично, коли це можливо.

Низхідне приведення (downcasting) - це процес приведення об'єкта до типу одного з його підкласів. Це дозволяє
використовувати методи і поля, які є у підкласі, але відсутні в базовому класі. Низхідне приведення має бути виконано явно.

У коді:

Object obj = new Jerry(); // Висхідне приведення. Jerry приводиться до Object
Mouse mouse = (Mouse) obj; // Низхідне приведення. Object приводиться до Mouse
GrayMouse grayMouse = (GrayMouse) mouse; // Низхідне приведення. Mouse приводиться до GrayMouse
Jerry jerry = (Jerry) grayMouse; // Низхідне приведення. GrayMouse приводиться до Jerry

У коді ви створюєте об'єкт Jerry і приводите його до Object (це висхідне приведення). Потім ви приводите цей об'єкт
Object до Mouse, GrayMouse і Jerry (це низхідне приведення).

Отже, коли ви приводите об'єкт до типу одного з його базових класів, ви втрачаєте доступ до його специфічних методів,
але може стати можливим передача його методам, які очікують базовий тип. Коли ви приводите об'єкт до типу одного з його
підкласів, ви знову отримуєте доступ до його специфічних методів.

*/