package ua.javarush.task.pro.task11.task1105;

/* 
Віконні роботи
У класі Window є метод changeSize, який має змінювати розміри вікна відповідно до переданих у метод значень.
Проте після запуску програми ти побачиш, що цей метод не діє. Тобі потрібно виправити помилки, щоб метод почав діяти.


Requirements:
1. Оголошення та ініціалізацію полів класу Window змінювати не можна.
2. Метод changeSize класу Window має змінювати значення полів класу згідно з переданими даними.
3. Оголошення методу changeSize і назви параметрів змінювати не можна.
*/

public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
