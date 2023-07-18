package ua.javarush.task.jdk13.task35.task3506;

import java.util.List;

/* 
extends vs super
Логіка всіх методів - додати source до destination.
!!!Розстав ?, extends та super там, де це необхідно:!!!
1) one - повинен працювати з одним і тим самим типом;
2) two - повинен додавати будь-яких нащадків типу T до списку, що вміє зберігати лише тип T;
3) three - повинен додавати об'єкти типу T до будь-якого списку, що параметризовано будь-яким батьківським класом;
4) four - повинен додавати будь-яких нащадків типу T до списку, що параметризовано будь-яким батьківським класом.
Не залишай закоментований код.

Requirements:
1. Метод one потрібно змінити відповідно до умови завдання.
2. Метод two потрібно змінити відповідно до умови завдання.
3. Метод three потрібно змінити відповідно до умови завдання.
4. Метод four потрібно змінити відповідно до умови завдання.

    // It was a condition:
public abstract class Solution {
    public abstract <T> void one(List destination, List source);

    public abstract <T> void two(List destination, List source);

    public abstract <T> void three(List destination, List source);

    public abstract <T> void four(List destination, List source);
}

*/

    // Change code here:
public abstract class Solution {
    public abstract <T> void one(List<T> destination, List<T> source);

    public abstract <T> void two(List<T> destination, List<? extends T> source);

    public abstract <T> void three(List<? super T> destination, List<T> source);

    public abstract <T> void four(List<? super T> destination, List<? extends T> source);
}


/*

Давайте розглянемо кожен метод окремо:

one(List<T> destination, List<T> source): Цей метод використовує один і той же тип T для обох списків. Це означає,
що обидва списки повинні бути однакового типу.

two(List<T> destination, List<? extends T> source): Цей метод дозволяє додати об'єкти з source до destination. Source
може бути списком будь-якого типу, що є нащадком T. Destination є списком, що приймає лише об'єкти типу T.

three(List<? super T> destination, List<T> source): Цей метод дозволяє додати об'єкти з source (що є типу T) до
destination. Destination може бути списком будь-якого типу, що є батьківським для T.

four(List<? super T> destination, List<? extends T> source): Цей метод дозволяє додати об'єкти з source до destination.
Source може бути списком будь-якого типу, що є нащадком T. Destination може бути списком будь-якого типу, що є
батьківським для T.

*/