package ua.javarush.task.jdk13.task12.task1206;

/* 
Кити та корови
Перевизнач метод getName у класі Whale(Кит), щоб програма виводила:

Я не корова, Я - кит.

Requirements:
1. Програма має виводити текст на екран.
2. Клас Whale має наслідуватися від класу Cow.
3. Клас Whale має перевизначати метод getName().
4. Метод main() має викликати метод getName() в об'єкта cow.
5. Перевизначити метод getName у класі Whale(Кит), щоб програма виводила на экран: "Я не корова, Я - кит."
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
            return "Я не корова, Я - кит.";
        }
    }
}
