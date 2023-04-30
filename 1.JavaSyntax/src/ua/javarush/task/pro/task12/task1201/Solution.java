package ua.javarush.task.pro.task12.task1201;

/* 
Автоматичне пакування
У класі Solution є 8 змінних примітивних типів з іменами формату типValue.
Для кожної з цих змінних потрібно створити об'єкти-обгортки та присвоїти їм імена, що мають формат типValueBox.
Для створення об'єктів-обгорток використовуй метод Тип.valueOf(примітив).

Приклад змінної об'єкта-обгортки: Integer integerValueBox = ....;


Requirements:
1. Клас Solution має містити 8 змінних примітивних типів даних з іменами формату типValue.
2. Клас Solution має містити 8 об'єктів типу клас-обгортка примітивного типу з іменами формату ValueBox.
3. Під час створення об'єктів-обгорток потрібно використовувати наявні змінні примітивних типів і метод Тип.valueOf(примітив).
*/

public class Solution {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    //напишіть тут ваш код
    Byte byteValueBox = Byte.valueOf(byteValue);
    Short shortValueBox = Short.valueOf(shortValue);
    Integer integerValueBox = Integer.valueOf(intValue);
    Long longValueBox = Long.valueOf(longValue);
    Float floatValueBox = Float.valueOf(floatValue);
    Double doubleValueBox = Double.valueOf(doubleValue);
    Character characterValueBox = Character.valueOf(charValue);
    Boolean booleanValueBox = Boolean.valueOf(booleanValue);
}
