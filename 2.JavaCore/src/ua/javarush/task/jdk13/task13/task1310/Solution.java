package ua.javarush.task.jdk13.task13.task1310;


/* 
Виправлення помилок
Перероби успадкування в класах та интерфейсах таким чином, щоб програма компілювалася та продовжувала робити те ж саме.
Клас Hobby має реалізувати інтерфейси Desire, Dream.

Requirements:
1. Інтерфейс Desire потрібно реалізувати в класі Hobby.
2. Інтерфейс Dream потрібно реалізувати в класі Hobby.
3. Клас Hobby має містити статичну змінну INDEX.
4. Метод toString у класі Hobby має інкрементувати та повертати змінну INDEX у вигляді рядка.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
