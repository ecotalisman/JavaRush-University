package ua.javarush.task.jdk13.task41.task4104;

/* 
Фантастичні звірі
Розберися, які класи є і що вони роблять.
Зараз кожен клас кодує три параметри: вид істоти, спосіб її пересування та звуки, які вона видає. На кожне поєднання
доводиться створювати окремий клас. Нині класів шість, і це далеко не всі можливі комбінації параметрів. Уже зараз все
схоже на мішанину, а що буде, якщо додати ще кілька параметрів? Тобі потрібно навести лад за допомогою патерну Міст.

Створи базовий клас абстракції та загальні інтерфейси реалізацій, розмісти їх в окремих пакетах:
- створи пакет creature та абстрактний клас Creature в ньому;
- створи пакет move, а в ньому – інтерфейс MoveLogic з одним методом void move(String name);
- Створи пакет sound, а в ньому – інтерфейс SoundLogic з одним методом void sound(String name).

Створи класи конкретних реалізацій:
- у пакеті move створи класи Fly, Swim та Crawl. Усі вони повинні реалізовувати MoveLogic. Метод move кожного класу повинен
виводити в консолі рядок типу: name + " махає крилами."

- у пакеті sound створи класи Bark, Meow та Speak. Усі вони повинні реалізовувати SoundLogic. Метод sound кожного класу
повинен виводити в консолі рядок типу: name + " нявкає."

Додай до класу абстракції посилання на об'єкти реалізації: у класі Creature створи два protected поля: MoveLogic,
moveLogic та SoundLogic, soundLogic. Додай конструктор із двома параметрами, що ініціалізує ці поля.

У класі Creature додай три публічні методи:

1. Абстрактний метод String getName();
2. void howDoIMove(), що делегує роботу реалізації moveLogic. Приклад: moveLogic.move(getName());
3. void howDoISound(), що делегує роботу реалізації soundLogic.

Створи підкласи нашої абстракції: у пакеті creature створи клас Cat, що успадковує Creature. Реалізуй метод getName,
щоб він повертав рядок "Кішка". Додай ще один метод public void catchMice(), що виводить у консолі: getName() + " ловить мишей."

- у пакеті creature створи клас Cow, що успадковує Creature. Реалізуй метод getName, щоб він повертав рядок "Корова".
Додай ще один метод public void giveMilk(), що виводить у консолі: getName() + " дає молоко."

- у пакеті creature створи клас Human, що успадковує Creature. Реалізуй метод getName, щоб він повертав рядок "Людина".
Додай ще один метод public void searchMeaningOfLife(), що виводить у консолі: getName() + " шукає сенс життя."

- У методі main створи літаючу корову, що нявкає :)

Requirements:
1. У пакеті creature має бути клас Creature з двома полями, конструктором, та трьома методами згідно з умовою.
2. У пакеті move має бути інтерфейс MoveLogic та класи Fly, Swim, Crawl, що реалізовані згідно з умовою.
3. У пакеті sound має бути інтерфейс SoundLogic та класи Bark, Meow, Speak, що реалізовані згідно з умовою.
4. У пакеті creature мають бути класи Cat, Cow та Human, що реалізовані згідно з умовою.
5. У методі main має бути створена літаюча корова, що нявкає.
*/

import ua.javarush.task.jdk13.task41.task4104.creature.Cow;
import ua.javarush.task.jdk13.task41.task4104.move.Fly;
import ua.javarush.task.jdk13.task41.task4104.sound.Meow;

public class Solution {

    public static void main(String[] args) {
//        FlyingSpeakingСow cow = new FlyingSpeakingСow();
//        cow.move();
//        cow.sound();
//        cow.giveMilk();
//
//        SwimmingMeowingHuman human = new SwimmingMeowingHuman();
//        human.move();
//        human.sound();
//        human.searchMeaningOfLife();

        Cow cow = new Cow(new Fly(), new Meow());
        cow.howDoIMove();
        cow.howDoISound();
    }
}
