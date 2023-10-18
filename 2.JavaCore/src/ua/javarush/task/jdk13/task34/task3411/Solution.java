package ua.javarush.task.jdk13.task34.task3411;

import java.lang.reflect.Field;

/* 
Приватний батько
Реалізуй метод setPrivateParentField: він повинен приватному полю fieldName батьківського класу об'єкту childObject
присвоїти значення value. Очікуємо на виведення: початковий рядок новий рядок

Requirements:
1. Метод setPrivateParentField потрібно реалізувати згідно з умовою завдання.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Child child = Child.class.getDeclaredConstructor().newInstance();
        System.out.println(child.getPrivateField());
        setPrivateParentField(child, "privateField", "новий рядок");
        System.out.println(child.getPrivateField());
    }

    public static void setPrivateParentField(Object childObject, String fieldName, Object value) throws Exception {
        //write code here:
        Class<?> parentClass = childObject.getClass().getSuperclass();
        Field field = parentClass.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(childObject, value);
    }
}
