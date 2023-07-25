package ua.javarush.task.jdk13.task15.task1505;

import java.io.Serializable;

/* 
Максимально простий код-1
Спрости код: прибери всі успадкування та реалізації, які автоматично додаються при компіляції.
Взаємозв'язок між об'єктами me та zapp — Has-a: http://ru.wikipedia.org/wiki/Has-a

Requirements:
1. Інтерфейс SpecificSerializable повинен розширювати (extends) інтерфейс Serializable.
2. Клас JavaDev повинен реалізувати інтерфейс SpecificSerializable.
3. У коді не має бути явного успадкування від Object (extends Object).
4. Клас JuniorJavaDev не повинен явно успадковувати інтерфейс SpecificSerializable.
*/

public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about ua.javarush.task.jdk13.task15.task1505?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}
