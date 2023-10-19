package ua.javarush.task.jdk13.task38.task3804;

import java.lang.reflect.Field;

import static java.util.Objects.isNull;

/*
Обробка анотацій
- створи анотацію Entity;
- додай їй три параметри:
String name без дефолтного значення,
int value по дефолту 45,
boolean required по дефолту true;

- додай їй можливість позначати класи;
- анотація повинна бути доступною під час виконання програми;
- познач цією анотацією класи User і SocialUser.

Requirements:
1. Потрібно створити анотацію Entity.
2. У Entity має бути три параметри name, value і required.
3. У Entity має бути можливість позначати класи.
4. Entity повинна бути доступною під час виконання програми.
5. Класи User і SocialUser потрібно позначити анотацією Entity.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        printIfAnnotated(new User(28219, "Poulo", "poulo@javarush.co"));
        printIfAnnotated(new SocialUser(1, "Jackl", "jackl@javarush.co", "temp+7132293185974599@javarush.ru"));
    }

    public static void printIfAnnotated(Object instance) throws Exception {
        Entity entity = instance.getClass().getAnnotation(Entity.class);
        if (isNull(entity) || !entity.required()) {
            return;
        }

        System.out.println(entity.name() + ", " + entity.value());
        for (Field declaredField : instance.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);
            System.out.printf("\t%s: %s\n", declaredField.getName(), declaredField.get(instance));
        }
    }
}
