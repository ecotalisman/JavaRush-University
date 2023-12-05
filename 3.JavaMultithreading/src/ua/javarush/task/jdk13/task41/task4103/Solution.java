package ua.javarush.task.jdk13.task41.task4103;

import ua.javarush.task.jdk13.task41.task4103.blood.BloodDBProxy;
import ua.javarush.task.jdk13.task41.task4103.blood.BloodSample;
import ua.javarush.task.jdk13.task41.task4103.blood.DB;

import java.util.List;
import java.util.Scanner;

import static java.util.Objects.nonNull;

/* 
Surprise, анонімус!
У цій програмі ми маємо банк крові, за яким можна здійснювати пошук. Ознайомся, як усе працює.

Завдяки BloodDB доступ до бази даних відкритий для всіх. Тобі потрібно обмежити доступ, використовуючи систему безпеки.
Оскільки все має пройти максимально прозоро з боку користувача, скористаємося патерном Замісник.
У пакеті blood створи клас BloodDBProxy, який буде реалізовувати той самий інтерфейс, що і BloodDB.
У класі створи три поля:

1) private final SecuritySystem security — за допомогою нього можна буде звертатися до системи безпеки;
2) private BloodDB db — власне об'єкт, для якого ми робимо замісника;
3) private final BloodSample denied — його можна одразу ініціалізувати значенням new BloodSample(0, "access", "denied",
    null, null, null ).

У класі BloodDBProxy створи конструктор без параметрів, який:

1) ініціалізує поле security;
2) зчитує з консолі два рядки — логін та пароль;
3) намагатиметься авторизуватися в системі безпеки за допомогою методу authorize;
4) перевірить, чи успішно пройшла авторизація, і якщо успішно — ініціалізує поле db.

Реалізуй у BloodDBProxy методи getById та find. Вони повинні перевірити авторизацію в системі безпеки.
Якщо з авторизацією все добре, треба перенаправити виклик об'єкту db.
Якщо користувач не авторизований, методи повинні повернути об'єкт denied.

І, нарешті, у методі main в ініціалізації змінної database заміни BloodDB на BloodDBProxy.

Подумай, як іще можна підвищити безпеку або оптимізувати систему, додавши проксі, що кешує.

Requirements:
1. Не можна змінювати класи BloodDB, BloodSample, DB, SecuritySystem, User.
2. У пакеті blood має бути клас BloodDBProxy, що реалізує інтерфейс DB.
3. У класі BloodDBProxy має бути три поля згідно з умовою завдання.
4. У класі BloodDBProxy має бути конструктор без параметрів, реалізований згідно з умовою.
5. У класі BloodDBProxy мають бути реалізовані методи getById та find згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        DB database = new BloodDBProxy();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Make request: ");
        String request = scanner.nextLine();

        if (request.matches("\\d+")) {
            BloodSample result = database.getById(Integer.parseInt(request));
            printSample(result);
        } else {
            List<BloodSample> results = database.find(request);
            printSamples(results);
        }
    }

    private static void printSample(BloodSample sample) {
        System.out.println(nonNull(sample) ? sample : "No results.");
    }

    private static void printSamples(List<BloodSample> samples) {
        if (samples.isEmpty()) {
            System.out.println("No results.");
        } else {
            samples.forEach(System.out::println);
        }
    }
}
