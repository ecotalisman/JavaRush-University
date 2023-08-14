package ua.javarush.task.jdk13.task17.task1706;

/* 
Синхронізований президент
І знову Singleton патерн - синхронізація в статичному блоці.
Всередині класу OurPresident у статичному блоці створи синхронізований блок.
Всередині синхронізованого блоку ініціалізуй president.

Requirements:
1. Клас OurPresident має містити приватне статичне поле OurPresident president.
2. Клас OurPresident повинен містити публічний статичний метод OurPresident getOurPresident().
3. Клас OurPresident має містити приватний конструктор.
4. Клас OurPresident повинен містити статичний блок.
5. Всередині статичного блоку класу OurPresident має бути синхронізований блок.
6. Всередині синхронізованого блоку має бути проініціалізовано поле president.
*/

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }
}

/*

реалізуємо Singleton паттерн з синхронізацією в статичному блоці для класу OurPresident.

Для цього:
1) Додамо статичний блок, де створимо синхронізований блок.
2) В синхронізованому блоку ініціалізуємо змінну president.

ми синхронізуємо доступ до класу OurPresident під час створення єдиного екземпляра president. Також важливо відзначити,
що при цьому способі ініціалізації потреби в додатковій синхронізації немає, оскільки статичний блок виконується лише
один раз під час завантаження класу.

****************************************************************************************************************************

В даному коді реалізовано паттерн Singleton для класу OurPresident. Це означає, що можна створити лише один екземпляр
об'єкта OurPresident, незалежно від того, скільки разів ви будете викликати метод getOurPresident().

Ось детальний розбір коду:

1) Приватне статичне поле president: Це поле зберігає єдиний екземпляр класу OurPresident.

2) Статичний блок ініціалізації: У цьому блоку створюється єдиний екземпляр класу OurPresident. Синхронізований блок
використовується для забезпечення потокової безпеки, але в даному контексті це зайве, так як статичний блок завжди
виконується один раз при завантаженні класу.

3) Приватний конструктор: Завдяки приватному конструктору неможливо створити екземпляр класу OurPresident поза класом.

4) Метод getOurPresident(): Цей публічний статичний метод дозволяє отримати доступ до єдиного екземпляра класу OurPresident.

У класі Solution:

- В методі main двічі викликається метод getOurPresident(), і результати зберігаються в двох різних змінних:
expectedPresident і ourPresident.

- За допомогою System.out.println(expectedPresident == ourPresident); порівнюється, чи вказують ці дві змінні на один
і той же об'єкт у пам'яті. І якщо паттерн Singleton правильно реалізовано, цей вираз завжди повертає true, оскільки
expectedPresident і ourPresident будуть вказувати на один і той же єдиний екземпляр OurPresident.

Singleton використовується тут для того, щоб гарантувати, що у програмі існує лише один президент (OurPresident).

****************************************************************************************************************************

У даному випадку, якщо використати код:

{
    synchronized (OurPresident.class) {
        president = new OurPresident();
    }
}

Це буде нестатичний ініціалізаційний блок, який виконується кожного разу, коли створюється новий об'єкт класу.
Проблема тут полягає в тому, що такий блок спробує ініціалізувати president кожного разу, коли буде створюватися новий
об'єкт OurPresident.

Оскільки конструктор OurPresident є приватним, додаткові об'єкти можуть бути створені тільки в межах цього класу.
Але ви все одно зіткнетеся з рекурсивною проблемою: кожний раз при створенні нового об'єкта OurPresident, ви знову
викликаєте ініціалізаційний блок, який знову створює новий об'єкт, і так далі.

Тому коректно використовувати статичний блок для ініціалізації, оскільки він виконується лише один раз при завантаженні
класу, гарантуючи правильну реалізацію паттерну Singleton.

****************************************************************************************************************************

Singleton паттерн (або "Одиночка") - це структурний паттерн проектування, який гарантує, що даний клас має тільки один
екземпляр і забезпечує точку доступу до цього екземпляра.

Основна мета Singleton - контролювати доступ до ресурсу, який є обмеженим або дорогоцінним. Це може бути, наприклад,
підключення до бази даних або конфігураційний об'єкт.

Основні характеристики Singleton паттерну:

Один екземпляр: Гарантується, що клас має лише один екземпляр.
Глобальний доступ: Є глобальна точка доступу до цього єдиного екземпляра.
Лінива ініціалізація: Єдина інстанція створюється лише при першому виклику, а не при завантаженні програми або класу
(хоча це залежить від реалізації).
Приклад простого Singleton у Java:

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {} // конструктор робимо приватним, щоб запобігти створенню інших екземплярів

    public static Singleton getInstance() {
        if (uniqueInstance == null) { // Лінива ініціалізація
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

Зверніть увагу, що цей підхід може бути не ефективним у багатопоточних додатках через можливість одночасного доступу
до методу getInstance(). Є різні варіанти реалізації Singleton, що забезпечують потокову безпеку, включаючи використання
блоків synchronized, внутрішніх статичних класів та інших.

Також важливо зауважити, що, хоча Singleton є корисним паттерном у певних ситуаціях, його слід використовувати обережно,
так як він може призводити до проблем із тестуванням, зв'язністю та залежностями у програмі.

*/