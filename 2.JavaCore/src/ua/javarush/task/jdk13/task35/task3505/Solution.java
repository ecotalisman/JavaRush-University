package ua.javarush.task.jdk13.task35.task3505;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
Wildcards
Перепиши дженерики в методі add за допомогою wildcards.
Логіку не змінюй.
Не залишай закоментований код.

Requirements:
1. Виведення на екран має бути відповідним до умови завдання.
2. Логіка методу add повинна зберегтися.
3. У методі add повинні використовуватися wildcards.
4. Метод add має бути статичним.
*/

public class Solution {

//    public static <D, H extends D, S extends H> void add(List<D> destinationList, List<S> sourceList) {
//        ListIterator<D> destListIterator = destinationList.listIterator();
//        ListIterator<S> srcListIterator = sourceList.listIterator();
//        for (int i = 0; i < sourceList.size(); i++) {
//            destListIterator.add(srcListIterator.next());
//        }
//    }

    public static <A> void add(List<? super A> destinationList, List<? extends A> sourceList) {
        ListIterator<? super A> destListIterator = destinationList.listIterator();
        ListIterator<? extends A> srcListIterator = sourceList.listIterator();
        for (int i = 0; i < sourceList.size(); i++) {
            destListIterator.add(srcListIterator.next());
        }
    }

    public static void main(String[] args) {
        List<B> destination = new ArrayList<>();
        destination.add(new B());
        List<C> source = new ArrayList<>();
        source.add(new C());
        add(destination, source);
        System.out.println(destination);
        System.out.println(source);
    }

    static class A {
    }

    static class B extends A {
    }

    static class C extends B {
    }
}

/*

У даному випадку, маємо наступну ієрархію класів:

class A {}
class B extends A {}
class C extends B {}

public static <D, H extends D, S extends H> void add(List<D> destinationList, List<S> sourceList) це дженерик-метод,
який приймає список destinationList типу D і sourceList типу S. S є підтипом H, який є підтипом D.

Проте в умові вам кажуть "перепиши дженерики в методі add за допомогою wildcards".

Wildcard'и в Java використовуються для того, щоб дати більше гнучкості при праці з дженериками. Якщо ви використовуєте
List<?>, ви говорите, що список може бути будь-якого типу, але ви не зможете додавати в цей список, бо компілятор не
знає якого саме типу цей список.

Тому нам потрібно використовувати bounded wildcards, тобто обмежити типи, які можуть бути використані з цим дженериком.
У вашому випадку, ми знаємо, що destinationList може приймати будь-який тип, що є суперкласом для A (A включно),
а sourceList може бути будь-якого типу, що є підкласом A (A включно).

Ви маєте вказати параметр типу після слова static, щоб вказати, що метод є дженерик-методом. Параметр типу <A> вказує,
що метод може працювати з будь-яким типом A.

*****************************************************************************************************************************

"Bounded Wildcards" у Java Generics це механізм, який дозволяє вказувати обмеження на невідомі типи.

Вони додаються з використанням ключових слів extends або super при визначенні типу.

1) extends використовується для обмеження "верхнього кордону". Це означає, що тип може бути будь-яким типом, який є
підтипом (або самим типом) вказаного класу або інтерфейсу. Наприклад, в List<? extends Number>, список може бути
параметризований будь-яким класом, який є підтипом Number (наприклад, Integer, Float, Double тощо).

2) super використовується для обмеження "нижнього кордону". Це означає, що тип може бути будь-яким типом, який є
надтипом (або самим типом) вказаного класу. Наприклад, в List<? super Integer>, список може бути параметризований
будь-яким класом, який є надтипом Integer (в даному випадку це може бути Number або Object).

Ці обмеження дають більше гнучкості при роботі з колекціями та іншими дженериками, дозволяючи вам працювати з об'єктами,
що є підтипами або надтипами конкретного типу, замість того, щоб бути обмеженими лише одним конкретним типом.

*****************************************************************************************************************************

public static <D, H extends D, S extends H> void add(List<D> destinationList, List<S> sourceList)

В цьому випадку ми визначаємо відносини між типами за допомогою механізму обмежень (bounds) у Java Generics.

1) D - це "базовий" тип, який не має обмежень. Він може бути будь-яким типом об'єкта (наприклад, Object, Number, String тощо).

2) H extends D - це обмеження, яке вказує, що H повинен бути підтипом D. Тобто H може бути D або будь-яким типом, який є
підтипом D. Наприклад, якщо D є Number, H може бути Number, Integer, Double, тощо.

3) S extends H - це обмеження, яке вказує, що S повинен бути підтипом H, а отже, і D. Тобто S може бути H або будь-яким
типом, який є підтипом H. Наприклад, якщо H є Integer, S може бути Integer.

Таким чином, ми встановлюємо ієрархію типів, де D є "верхнім" типом, H є підтипом D, а S є підтипом H.

Цей механізм дозволяє вам контролювати типи, які ви можете передавати у метод add(), забезпечуючи дотримання правил ієрархії типів.


Вибір букв D, H, S не має спеціального значення та був зроблений просто для демонстрації. Вони є виключно формальними
параметрами типу і можуть бути будь-якими валідними ідентифікаторами в Java. Вибір конкретних букв не впливає на
обмеження типу чи ієрархію класів.

Наприклад, ви також могли б використати таке оголошення:

public static <A, B extends A, C extends B> void add(List<A> destinationList, List<C> sourceList) {...}
Це було б еквівалентно попередньому оголошенню з точки зору обмежень типів. Важливо лише те, що відношення між
типами (B наслідується від A, C наслідується від B) зберігаються, а самі букви можуть бути будь-якими.

Часто в Java Generics використовують однобуквенні ідентифікатори, такі як E (для "Element"),
K і V (для "Key" та "Value" в мапах), T (для "Type"), і так далі, але це не обов'язкові назви. Це просто стандартні
конвенції, які допомагають іншим розробникам зрозуміти ваш код.

*****************************************************************************************************************************
*****************************************************************************************************************************
*****************************************************************************************************************************

Ці обмеження дозволяють забезпечити безпеку типів при роботі зі списками.

В даному випадку:

1) List<? super A> destinationList: Це означає, що список призначення може бути списком A або будь-якого батьківського
типу до A. Ітератор ListIterator<? super A> destListIterator може додавати об'єкти типу A або будь-якого наслідника
типу A в список без ризику порушення безпеки типів.

2) List<? extends A> sourceList: Це означає, що список джерел може бути списком A або будь-якого наслідника типу A.
Ітератор ListIterator<? extends A> srcListIterator може витягувати об'єкти типу A або будь-якого наслідника типу A зі списку.

Під час ітерації ми беремо об'єкти з sourceList (які є A або наслідниками A) і додаємо їх до destinationList.
Оскільки destinationList може приймати A або будь-який тип, що є батьком до A, ця операція є безпечною. Тобто,
якщо A є наслідником B, ми не можемо додати об'єкт типу A до списку типу B, оскільки це порушить безпеку типів.

Це правило також відоме як принцип PECS (Producer Extends, Consumer Super), що в контексті дженериків Java означає,
що коли контейнер використовується як виробник (producer) типів T, ми повинні використовувати <? extends T>, і коли
контейнер використовується як споживач (consumer) типів T, ми повинні використовувати <? super T>.

*/