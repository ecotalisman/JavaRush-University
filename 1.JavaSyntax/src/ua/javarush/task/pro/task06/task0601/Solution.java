package ua.javarush.task.pro.task06.task0601;

/* 
Розділяй поняття
Метод main виводить надто багато рядків інформації щодо різних понять.
Логічним було б розподілити виведення інформації про водень і про острів Ява по різних методах.
Створи метод public static void printHydrogenInfo(), який має виводити всі рядки про водень.
Також створи метод public static void printJavaInfo(), який виводитиме всі рядки про острів Ява.
Насамкінець у методі main() виклич ці два методи.
Загальний результат виведення в консоль не повинен змінитися.


Requirements:
1. Має бути наявним метод public static void printHydrogenInfo().
2. Має бути наявним метод public static void printJavaInfo().
3. Метод printHydrogenInfo() має виводити всі наявні рядки щодо водню.
4. Метод printJavaInfo() має виводити всі наявні рядки щодо острова Ява.
5. У методі main() потрібно викликати методи printHydrogenInfo() і printJavaInfo().
6. Загальний результат виведення в консоль не повинен змінитися.
*/

public class Solution {
    public static void main(String[] args) {

        printHydrogenInfo();
        printJavaInfo();
    }

    //напишіть тут ваш код
    public static void printHydrogenInfo() {

        System.out.println("Водень:");
        System.out.println("Це хімічний елемент періодичної системи, який позначається символом H і має атомний номер 1.");
        System.out.println("Найлегший елемент в таблиці.");
        System.out.println("Водень застосовують у:");
        System.out.println("-Хімічній промисловості;");
        System.out.println("-Нафтопереробній промисловості;");
        System.out.println("-Авіації;");
        System.out.println("-Електроенергетиці.");
    }

    public static void printJavaInfo() {

        System.out.println("Острів Ява:");
        System.out.println("Входить до складу Індонезії.");
        System.out.println("На острові виникли держави Матарам, Маджапагіт, Демак.");
        System.out.println("Ява є найбільш населеним островом у світі:");
        System.out.println("Загальна чисельність населення — 140 млн осіб.");
        System.out.println("Густота населення — 1061 особа/кв. км");
        System.out.println("Тут виготовляють один із широковідомих сортів кави — Копі Лувак.");
    }
}
