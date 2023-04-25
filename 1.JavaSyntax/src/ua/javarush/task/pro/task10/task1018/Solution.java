package ua.javarush.task.pro.task10.task1018;

/* 
Гетер і сетер в ділі
Клас Coordinate містить 2 гетери й 2 сетери, але сетери не встановлюють значення змінним.
Розберися, чому так відбувається й виправ ситуацію. Метод main у перевірці не використовується.


Requirements:
1. Клас Coordinate має містити два приватних нестатичних поля x, y типу int.
2. У класі Coordinate має бути гетер getX для поля x.
3. У класі Coordinate має бути гетер getY для поля y.
4. Клас Coordinate має містити сетер setX(int) для поля x.
5. Клас Coordinate має містити сетер setY(int) для поля y.
6. Сетери мають ініціалізувати відповідні поля.
*/

public class Solution {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }
}
