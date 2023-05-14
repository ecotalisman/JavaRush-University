package ua.javarush.task.pro.task13.task1314;

/* 
StringLinkedList, частина 2
Розв'язуючи цю задачу, ти навчишся видобувати елемент із двобічно зв'язаного списку.
Ми реалізували метод add, який додає елементи в кінець списку. Тобі потрібно реалізувати метод get(int),
який поверне рядок з індексом, переданим у метод. Якщо рядка з таким індексом немає, слід повернути null.
Пам'ятай, що first і last не мають значень, а лише посилаються відповідно на перший і останній елементи.


Requirements:
1. Метод get(int index) має повертати елемент списку з індексом index.
*/

public class Solution {

    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        System.out.println(stringLinkedList.get(4)); // 5
    }
}
