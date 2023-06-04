package ua.javarush.task.pro.task14.task1407;


public class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("шукає їжу");
            System.out.println("знайшов " + food.name);
            System.out.println("усе з'їв");
        } catch (NullPointerException e) {
            System.out.println("нічого не знайшов");
            return;
        } //напишіть тут ваш код
        finally {
            System.out.println("ліг спати" + (food == null ? " голодним" : ""));
        }

        // It was a condition:
//        System.out.println("ліг спати" + (food == null ? " голодним" : ""));
    }
}


