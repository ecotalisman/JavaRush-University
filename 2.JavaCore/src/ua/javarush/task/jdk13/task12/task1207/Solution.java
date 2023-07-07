package ua.javarush.task.jdk13.task12.task1207;

/* 
Кит, нащадок корови
Перевизнач метод getName у класі Whale(Кит), щоб програма виводила на екран порожній рядок.

Requirements:
1. Програма має виводити на екран порожній рядок.
2. Клас Whale має успадковуватися від класу Cow.
3. Клас Whale має перевизначати метод getName().
4. Метод main() має викликати метод getName() в об'єкта cow.
5. Реалізуй метод getName() класу Whale, щоб програма виводила на екран порожній рядок.
6. Метод main() має виводити на екран результат виклику методу getName().
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        // Write code here:
        @Override
        public String getName() {
            return "";
        }
    }
}
