package ua.javarush.task.jdk13.task34.task3405;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/* 
Порушення приватності
Реалізуй метод getFields(T), який приймає об'єкт будь-якого типу і повертає мапу Map<String, Object>. Ключем мапи буде
ім'я поля об'єкту, а значенням — значення цього поля. Зауваж, що поля потрібно брати лише приватні, але вони також
можуть бути статичними та фінальними.

Сигнатуру методу getFields(T) не змінюй. Методи main() і print() не беруть участі в тестуванні.

Requirements:
1. Сигнатуру і тип значення, що повертається, методу getFields(Object) не змінюй.
2. Метод getFields(Object) потрібно реалізувати згідно з умовою завдання.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User("Amigo", 21);
        print(getFields(user));

        Task task = new Task("task3405", true);
        print(getFields(task));
    }

    public static Map<String, Object> getFields(Object object) throws Exception {
        //write code here:
        HashMap<String, Object> map = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
                map.put(field.getName(), field.get(object));
            }
        }

        return map;
    }

    public static void print(Map<?, ?> fields) {
        System.out.println("-------------------");
        fields.forEach((fieldName, fieldValue) -> System.out.println(fieldName + " = " + fieldValue));
    }
}
