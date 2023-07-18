package ua.javarush.task.jdk13.task35.task3503;

/* 
Декілька суперкласів для дженерика
Є клас Solution, який параметризировано T.
Обмежте параметр T.
T повинен бути нащадком класу ClassForGenerics і одночасно реалізувати інтерфейс InterfaceForGenerics.
Змінювати можна лише клас Solution.

Requirements:
1. Клас Solution має бути параметризировано типом, який є нащадком класу ClassForGenerics і одночасно реалізувати
інтерфейс InterfaceForGenerics.
2. Інтерфейс InterfaceForGenerics не має розширяти інші інтерфейси.
3. Клас ClassForGenerics не повинен підтримувати інтерфейс InterfaceForGenerics.
4. Клас Solution не має бути нащадком класу ClassForGenerics.
*/

public class Solution<T extends ClassForGenerics & InterfaceForGenerics> {
    public static void main(String[] args) {
        Solution<TestClassGood> testClassSolution = new Solution<>();
        testClassSolution.check();

        //!!! Обидва варіанти, наведені нижче, не мають працювати, закоментуй їх:
//        Solution<TestClassWrong1> wrong1Solution = new Solution<>();
//        wrong1Solution.check();
//
//        Solution<TestClassWrong2> wrong2Solution = new Solution<>();
//        wrong2Solution.check();
    }

    public void check() {
        System.out.println("Works!");
    }

    public static class TestClassGood extends ClassForGenerics implements InterfaceForGenerics {

    }

    public static class TestClassWrong1 extends ClassForGenerics {

    }

    public static class TestClassWrong2 implements InterfaceForGenerics {

    }

}

/*

`&`:
&& та & в Java мають різні значення. && це логічний оператор AND, що використовується в логічних виразах, де обидва
операнди є булевими значеннями.

& є побітовим оператором AND, який може використовуватися з цілими числами, а також є "одночасним" обмежувачем у дженериках.

В контексті дженериків, коли ви хочете вказати більше ніж одне обмеження, ви використовуєте & для вказівки того,
що параметр типу повинен відповідати всім обмеженням. Синтаксис T extends ClassForGenerics & InterfaceForGenerics означає,
що T повинен бути підтипом ClassForGenerics і реалізувати InterfaceForGenerics.

Тому, в декларації дженериків використовується &, а не &&.

`|`:
В декларації дженериків в Java неможливо використати оператор | для вказання альтернативного обмеження типу. В Java
оператор | використовується як побітовий оператор OR або в конструкції switch як оператор випадкового вибору.

Якщо вам потрібно обмежити параметр типу дженерика таким чином, що він повинен бути підтипом одного або іншого класу,
ви не зможете це зробити напряму, оскільки Java не підтримує такого синтаксису.

Замість цього, ви маєте створити спільний надклас або інтерфейс, який об'єднує обидва типи, і потім використати цей
надклас або інтерфейс у якості обмеження.

*/
