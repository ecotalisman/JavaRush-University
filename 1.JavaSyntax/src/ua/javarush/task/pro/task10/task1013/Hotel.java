package ua.javarush.task.pro.task10.task1013;

/* 
Правильно розстав поверхи
В алгоритмі роботи готельного ліфта прописано: щоб піднятися з третього поверху на шостий, потрібно проїхати до
четвертого, потім — до п'ятого, ну, і нарешті до шостого.
Але в нашій програмі всі поверхи переплуталися! Тому наразі клас Hotel не компілюється. Розстав поля класу в такому
порядку, щоб клас компілювався й ліфт їхав правильно.


Requirements:
1. Не можна видаляти поля з класу Hotel, змінювати їх або додавати нові.
2. Порядок полів класу Hotel має бути правильним.
*/

public class Hotel {

//    It was a condition of the task:

//    public int fourthFloor = thirdFloor + 1;
//    public int sixthFloor = fifthFloor + 1;
//    public int thirdFloor = 3;
//    public int fifthFloor = fourthFloor + 1;

    public int thirdFloor = 3;
    public int fourthFloor = thirdFloor + 1;
    public int fifthFloor = fourthFloor + 1;
    public int sixthFloor = fifthFloor + 1;
}
