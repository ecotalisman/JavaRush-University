package ua.javarush.task.jdk13.task41.task4116;

import ua.javarush.task.jdk13.task41.task4116.animals.*;
import ua.javarush.task.jdk13.task41.task4116.visitor.JsonExportVisitor;
import ua.javarush.task.jdk13.task41.task4116.visitor.YamlExportVisitor;

/* 
Шерсть та зірки
Завдання: реалізувати можливість експорту класів тварин у json та yaml формати. Для цього використовуй шаблон Відвідувач:

1. Створи пакет visitor, а в ньому – інтерфейс Visitor. Оголоси в ньому методи відвідування для класів Cat, Cow та Dog.
Наприклад, для класу Cat має бути такий метод: String visitCat(Cat).

2. У базовому класі Animal оголоси абстрактний метод прийняття відвідувачів: String accept(Visitor).

3. Реалізуй методи прийняття у всіх тварин. У цих методах переадресуй виклик методу відвідувача, в якому тип параметра
збігається з поточним класом.

4. У пакеті visitor створи конкретний клас відвідувача JsonExportVisitor.

Його методи повинні повертати рядок json-подання тварини, наприклад:
{
"name" : "Кіт"
"mice" : "0"
"kilogramsOfFur" : "0.0"
}

Значення у прикладі отримано за допомогою методів getName, miceCaught та furEaten.

5. Аналогічно створи клас YamlExportVisitor. Приклад значення, що повертається:
--- !<Dog>
name: "Пес"
bones: 0

Розкоментуй код у методі main і перевір, чи все працює.

Requirements:
1. У кореневій папці завдання має бути пакет visitor та інтерфейс у ньому згідно з умовою.
2. У класі Animal має бути метод accept згідно з умовою.
3. У класах тварин має бути реалізовано метод accept згідно з умовою.
4. У пакеті visitor має бути клас JsonExportVisitor, реалізований згідно з умовою.
5. У пакеті visitor має бути клас YamlExportVisitor, реалізований згідно з умовою.
*/


public class Solution {

    public static void main(String[] args) {
        System.out.println(new Cat().accept(new JsonExportVisitor()));
        System.out.println(new Cow().accept(new JsonExportVisitor()));
        System.out.println(new Dog().accept(new JsonExportVisitor()));

        System.out.println(new Cat().accept(new YamlExportVisitor()));
        System.out.println(new Cow().accept(new YamlExportVisitor()));
        System.out.println(new Dog().accept(new YamlExportVisitor()));
    }
}
