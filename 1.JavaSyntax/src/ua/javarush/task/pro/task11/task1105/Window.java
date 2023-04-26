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

public class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width){

//      Was condition:

//        height = height;
//        width = width;

        this.height = height;
        this.width = width;
    }

    public void printSize(){
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}
