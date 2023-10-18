package ua.javarush.task.jdk13.task34.task3410;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* 
Обнулення об'єкту
Метод reset класу Solution повинен "обнулити" (присвоїти null) усі приватні/не статичні/не примітивні поля об'єкту object.
Скажімо, у прикладі в методі main повинні "обнулитися" поля email і friends.

Requirements:
1. Метод reset потрібно реалізувати згідно з умовою завдання.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User(28219, "Paulo", 40, 9999, "paulo@javarush.com");
        System.out.println(user);
        reset(user);
        System.out.println(user);
    }

    public static void reset(Object object) throws Exception {
        //напишіть тут ваш код
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {

            if (Modifier.isPrivate(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) &&
                    !field.getType().isPrimitive()) {

                field.setAccessible(true);
                field.set(object, null);
            }
        }
    }
}

/**
 * Return {@code true} if the integer argument includes the
 * {@code private} modifier, {@code false} otherwise.
 *
 * @param   mod a set of modifiers
 * @return {@code true} if {@code mod} includes the
 * {@code private} modifier; {@code false} otherwise.
 *
 *
 * В документації, яку ви навели, mod - це набір модифікаторів. В Java, модифікатори (такі як public, private, static,
 * final тощо) можуть бути представлені як цілі числа за допомогою бітової маски.
 *
 * Кожен модифікатор представлений окремим бітом в цьому числі. Тому, щоб перевірити, чи присутній певний модифікатор
 * в наборі модифікаторів, можна використовувати бітові операції. У вказаному вами методі використовується бітова
 * операція & для перевірки, чи присутній біт private в mod.
 *
 * Метод field.getModifiers() повертає ціле число (int), яке представляє набір модифікаторів даного поля field.
 * Це число можна потім використовувати з методами класу Modifier (такими як isPrivate(int mod), isStatic(int mod) тощо),
 * щоб визначити, які саме модифікатори встановлені для даного поля.
 *
 */
