package ua.javarush.task.jdk13.task21.task2104;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Глибоке клонування карти
Потрібно забезпечити можливість клонування об'єкту класу Solution за допомогою глибокого клонування.
Дані в карті users також потрібно клонувати.
Не забудь про методи equals та hashCode для коректного додавання елементів типу User в HashMap.

Requirements:
1. Клас Solution повинен підтримувати інтерфейс Cloneable.
2. Клас User повинен підтримувати інтерфейс Cloneable.
3. У класі User потрібно коректно реалізувати метод clone.
4. У класі Solution потрібно коректно реалізувати метод clone.
*/

public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        try {
            Solution clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Solution clone = (Solution) super.clone();
        clone.users = new LinkedHashMap<>();

        for (Map.Entry<String, User> entry : users.entrySet()) {
            clone.users.put(entry.getKey(), (User) entry.getValue().clone());
        }
        return clone;
    }
    public static class User implements Cloneable {

        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (age != user.age) return false;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}


/*


@Override
    public Object clone() throws CloneNotSupportedException {
        Solution o = (Solution) super.clone();

        //clone users
        Map<String, User> newUsers = new LinkedHashMap<>();
        for (String key : o.users.keySet()) {
            User user = o.users.get(key);
            newUsers.put(key, (User) user.clone());
        }
        o.users = newUsers;

        return o;
    }

Тут реалізовано копіювання ключів та значень LinkedHashMap наступним чином:

1:
Solution o = (Solution) super.clone(); — створюється поверхнева (shallow) копія об'єкта Solution, яка включає всі
поля примітивних типів та посилання на об'єкти. Це означає, що для об'єктів, які є полями класу Solution,
не створюються нові копії, а замість цього в новий об'єкт o копіюються лише посилання на вже існуючі об'єкти.

2:
Map<String, User> newUsers = new LinkedHashMap<>(); — створюється нова порожня карта newUsers.

3:
В циклі for-each для кожного ключа в o.users.keySet() робиться наступне:

User user = o.users.get(key); — отримується значення (об'єкт User) за цим ключем у копії o.users.
(User) user.clone() — створюється нова копія об'єкта User за допомогою його методу clone().

newUsers.put(key, (User) user.clone()); — в нову карту newUsers додається пара ключ-значення,
де ключ — це оригінальний ключ з o.users, а значення — це нова копія об'єкта User.

o.users = newUsers; — посилання в o.users замінюється на нову карту newUsers, яка містить копії всіх об'єктів User.

return o; — повертається копія об'єкта Solution, яка тепер містить свою власну копію карти users.

****************************************************************************************************************************

@Override
    protected Object clone() throws CloneNotSupportedException {
        Solution clone = (Solution) super.clone();
        clone.users.putAll(users);
        return clone;
    }

Метод putAll() просто копіює всі пари ключ-значення з одної карти в іншу. Проблема полягає в тому, що він не створює
нових об'єктів для значень - він просто копіює посилання.

Це означає, що якщо ви зміните об'єкт User в оригінальному словнику users, ця зміна відобразиться і в клонованому
словнику users, оскільки обидва словники вказують на той самий об'єкт User.

Іншими словами, використання putAll() призводить до поверхневого клонування, а не глибокого.

!!!
String в Java є незмінним (immutable). Це означає, що один раз створивши об'єкт String, ви не можете його змінити.
Якщо вам потрібно змінити значення строки, Java створить новий об'єкт String.

Це дає деякі переваги. Наприклад, оскільки String є незмінним, його можна безпечно використовувати в багатопоточних
додатках без необхідності в синхронізації, тому що ви не можете змінити об'єкт String після того, як він був створений.

Крім того, Java може розмістити всі однакові об'єкти String в спеціальному пулі рядків, що допомагає зекономити
пам'ять, оскільки кожен унікальний рядок зберігається лише один раз.

Ось чому у виконаному коді використовується цикл: для того, щоб створити нові об'єкти User для клонованого
словника users, а не просто копіювати посилання.

!!!
ключі у Map-і є об'єктами типу String. Строки в Java є незмінними, що означає, що один раз створивши рядок, ви не
можете змінити його значення. Ви можете створити новий рядок, але ви не можете змінити існуючий.

Таким чином, немає потреби в клонуванні ключів строки, оскільки вони є незмінними. Будь-яка зміна "ключа" була б
насправді створенням нового об'єкта String, і оригінальний об'єкт String був би незмінним.

Відповідно, немає ризику, що зміни в оригінальному словнику users вплинуть на клоновану версію через зміни ключів,
оскільки ключі - це незмінні об'єкти.

Це відрізняється від значень User у Map, які є змінними - тому нам потрібно створити нові клони об'єктів User
для клонованого словника.


****************************************************************************************************************************


@Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution clone = (Solution) super.clone();
        clone.users = new LinkedHashMap<>();
        for (Map.Entry<String, User> entry : this.users.entrySet()) {
            clone.users.put(entry.getKey(), (User) entry.getValue().clone());
        }
        return clone;
    }

1:
clone.users = new LinkedHashMap<>(); - цей рядок коду створює новий об'єкт LinkedHashMap і присвоює його полю users
клонованого об'єкта Solution (який ми позначаємо як clone). Це забезпечує, що у нас є новий, незалежний список
користувачів для нашого клонованого об'єкта. Якщо ми не зробимо цього, то клонований об'єкт і оригінальний об'єкт
будуть посилатися на ту саму карту users, що призведе до некоректної поведінки, коли ми спробуємо модифікувати
одну з карт.

2:
this.users.entrySet() - this є ключовим словом в Java, яке вказує на поточний об'єкт. В даному контексті this.users
означає карту users поточного об'єкта Solution. this часто використовується для вказівки на поточний об'єкт для
розрізнення його властивостей від інших змінних. Однак в даному випадку this можна опустити, і код буде
виконуватися однаково.

3:
clone.users.put(entry.getKey(), (User) entry.getValue().clone()); - цей рядок коду вставляє клонованого користувача
в нову карту users клонованого об'єкта. entry.getKey() повертає ключ поточного елементу карти (це ім'я користувача),
а (User) entry.getValue().clone() клонує поточного користувача і вставляє клонованого користувача в карту.

****************************************************************************************************************************

public class Solution implements Cloneable {

    private Solution solution2;

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution solution2 = new Solution();
    }

    protected Map<String, User> users = new LinkedHashMap();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Solution clone = (Solution) super.clone();
        clone.users = new LinkedHashMap<>();

        for (Map.Entry<String, User> entry : users.entrySet()) {
            clone.users.put(entry.getKey(), (User) entry.getValue().clone());
        }
        return clone;
    }
}

В класі Solution ми оголосили поле

private Solution solution2;
Це означає, що ми створили поле, яке може зберігати посилання на інший об'єкт Solution. Це поле може бути null
(якщо воно не було ініціалізоване) або воно може посилатися на об'єкт типу Solution.

solution.solution2
це спосіб доступу до цього поля через конкретний об'єкт класу Solution. Наприклад, в рядку

solution.solution2 = new Solution();

ми створюємо новий об'єкт Solution і присвоюємо його полю solution2 об'єкта solution.

Те саме стосується clone.users в попередньому прикладі.

clone - це об'єкт класу Solution, і users - це поле цього класу. Коли ми пишемо clone.users, ми отримуємо доступ до
поля users об'єкта clone. Ми можемо присвоїти цьому полю нове значення (clone.users = new LinkedHashMap<>()) або
виконати операцію на цьому полі, як наприклад вставити нову пару ключ-значення (clone.users.put(key, value)).


*/