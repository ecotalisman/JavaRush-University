package ua.javarush.task.jdk13.task41.task4108;

import ua.javarush.task.jdk13.task41.task4108.factories.JavaRush;

/* 
Фабрики кадрів
Дано: розробники різного рівня на різних мовах програмування.

Сформуй фабрики для їх виробництва:

1. Створи:
- пакет juniors та інтерфейс JuniorDeveloper у ньому з void методом fixBugs;
- пакет middles та інтерфейс MiddleDeveloper у ньому з void методом writeNewModule;
- пакет seniors та інтерфейс SeniorDeveloper у ньому з void методом designArchitecture;

2. Перемісти класи джуніорів у пакет juniors, мідлів — у middles, сіньйорів — у seniors.
Додай усім класам реалізацію відповідних інтерфейсів.

3. Створи пакет factories та інтерфейс DeveloperCourse у ньому (це буде наша абстрактна фабрика) з фабричними методами:
- JuniorDeveloper createJunior();
- MiddleDeveloper createMiddle();
- SeniorDeveloper createSenior().

4. У пакеті factories створи класи конкретних фабрик: JavaScriptCourse, PythonCourse, JavaRush.
Реалізуй у них інтерфейс абстрактної фабрики: методи мають повертати об'єкти відповідних розробників.

5. Розкоментуй код у класах Team та Solution — усе має працювати.
P.S. текст у класах розробників згенерований ШІ. Будь-які збіги є випадковими.

Requirements:
1. У кореневій папці завдання повинні бути пакети juniors, middles, seniors та інтерфейси у них відповідно до умови завдання.
2. Класи розробників повинні бути розподілені за відповідними пакетами та реалізовувати відповідні інтерфейси.
3. У кореневій папці завдання повинен бути пакет factories та інтерфейс у ньому згідно з умовою.
4. У пакеті factories мають бути класи JavaScriptCourse, PythonCourse та JavaRush, що реалізують DeveloperCourse відповідно до умови.
*/

public class Solution {

    public static void main(String[] args) {
        Team javaTeam = new Team(new JavaRush());
        javaTeam.hireSeniors(1);
        javaTeam.hireMiddles(3);
        javaTeam.hireJuniors(8);
        javaTeam.produceCode();
    }
}
