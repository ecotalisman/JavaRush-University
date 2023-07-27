package ua.javarush.task.jdk13.task21.task2101;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
У класі Solution потрібно виправити пару методів equals/hashCode згідно з правилами реалізації цих методів
(деталі з'ясуй у своєї улюбленої пошукової системи).
Обидва рядки first та last повинні брати участь у порівнянні за допомогою методу equals та обчислення hashcode.
Метод main не бере участі в тестуванні.

Requirements:
1. Хешкоди однакових об'єктів мають бути рівні.
2. Метод equals повинен перевіряти, чи об'єкт, що передається, дорівнює поточному (порівняння через ==).
3. Метод equals повинен перевіряти, чи об'єкт, що передається, є об'єктом класу Solution.
4. Метод equals повинен повертати true, якщо поля first та last рівні в об'єкта, що передається, і поточного об'єкта
(не забудь, що вони можуть дорівнювати null).
5. Потрібно забезпечити коректну поведінку HashSet з типом елементів Solution.
*/

public class Solution {
    private final String first;
    private final String last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {

        // It was a condition:
//        return n.first.equals(first) && n.last.equals(last);

        // Change code here:
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solution solution = (Solution) o;

        if (!Objects.equals(first, solution.first)) return false;
        return Objects.equals(last, solution.last);
    }

    public int hashCode() {

        // It was a condition:
//        return 31 * first.hashCode() + last.hashCode();

        // Change code here:
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }



    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}

/*

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solution solution = (Solution) o;

        if (!Objects.equals(first, solution.first)) return false;
        return Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }


Метод equals()

1:
if (this == o) return true;
Ця строка перевіряє, чи об'єкт o є самим об'єктом this. Тобто, чи o та this посилаються на одну й ту саму
область пам'яті. Якщо так, то повертаємо true, оскільки об'єкт, безумовно, дорівнює самому собі.

2:
if (o == null) return false;
Ця строка перевіряє, чи об'єкт o є null. Якщо так, то повертаємо false, оскільки об'єкт this не може бути рівним null.

3:
if (getClass() != o.getClass()) return false;
Ця строка перевіряє, чи об'єкт o належить до того ж класу, що і this. Якщо o належить до іншого класу, то повертаємо
false, оскільки в нашому контексті об'єкти різних класів не можуть бути рівними.

4:
Solution solution = (Solution) o;
Тут ми приводимо o до типу Solution, що дозволяє нам далі безпечно працювати з o як з об'єктом класу Solution.

5:
if (!Objects.equals(first, solution.first)) return false;
Цей рядок перевіряє, чи поля first у this та o є рівними. Якщо вони не рівні, то повертаємо false, оскільки у
нашому контексті об'єкти Solution вважаються рівними, якщо їхні поля first та last рівні.

6:
return Objects.equals(last, solution.last);
Цей рядок перевіряє, чи поля last у this та o є рівними. Якщо вони рівні, то повертаємо true, оскільки ми вже
перевірили, що поля first теж рівні, а тому об'єкти Solution є рівними. Якщо поля last не рівні, то повертаємо false.

**************************************************************************************************************************

Метод hashCode()

1:
int result = first != null ? first.hashCode() : 0;
Ця строка створює змінну result і присвоює їй хеш-код поля first, якщо first не є null, або 0, якщо first є null.

2:
result = 31 * result + (last != null ? last.hashCode() : 0);
Ця строка перезаписує result, множачи поточне значення result на 31 (це стандартна практика, щоб досягти хорошого
розподілу хеш-кодів) і додаючи до нього хеш-код поля last, якщо last не є null, або 0, якщо last є null.

3:
return result;
Цей рядок повертає обчислений хеш-код об'єкта Solution.

**************************************************************************************************************************

Objects це утилітний клас в Java, що входить до стандартного пакету java.util. У нього немає приватного конструктора,
тому ви не можете створити екземпляр цього класу. Усі методи в цьому класі є статичними, що робить його дуже зручним
для виконання декількох операцій, наприклад порівняння, генерації хешкоду, перевірки на null, тощо.

Метод Objects.equals() використовується для перевірки рівності двох об'єктів. Він враховує ситуації, коли об'єкти
можуть бути null, тому ви не отримаєте NullPointerException, якщо один з об'єктів дорівнює null.

Наприклад, Objects.equals(obj1, obj2) поверне true, якщо obj1 і obj2 обидва дорівнюють null або якщо obj1.equals(obj2)
повертає true. У протилежному випадку, він поверне false.

Це робить метод Objects.equals() більш безпечним для використання, порівняно з безпосереднім викликом obj1.equals(obj2),
де можна отримати NullPointerException, якщо obj1 є null.

**************************************************************************************************************************

solution.first тут відноситься до поля first об'єкта solution, який був переданий у якості аргумента в метод equals().

Давайте детальніше проаналізуємо цей рядок:

if (!Objects.equals(first, solution.first)) return false;

В цьому виразі використовується метод Objects.equals(), який приймає два об'єкта як параметри і порівнює їх.
Якщо об'єкти рівні, то метод повертає true, інакше - false.

first - це поле поточного об'єкта (this.first), що викликає метод equals().

solution.first - це поле first об'єкта solution, який був переданий в метод equals() як параметр o і потім був
приведений до типу Solution.

Отже, цей рядок порівнює поле first поточного об'єкта (this) з полем first об'єкта solution, переданого в
метод equals(). Якщо вони не рівні, він повертає false, що означає, що об'єкти не рівні.

**************************************************************************************************************************

Оператор ! використовується для заперечення логічного виразу. Тому, вираз:

if (!Objects.equals(first, solution.first)) return false;

можна перефразувати як:

if (Objects.equals(first, solution.first) != true) return false;

Обидва вирази означають одне й те саме. Вони перевіряють, чи не рівні об'єкти first і solution.first. Якщо вони
не рівні, виконується return false;, що означає, що об'єкти не є однаковими.

**************************************************************************************************************************

у контексті this є ключовим словом у Java, яке посилається на поточний об'єкт, тобто об'єкт, в контексті якого
виконується поточний метод (в даному випадку - метод equals()).

o - це об'єкт, який передається в метод equals() для порівняння з поточним об'єктом (this).

Отже, вираз this == o перевіряє, чи посилаються this та o на одну й ту саму область в пам'яті. Якщо вони посилаються
на одну й ту саму область в пам'яті, це означає, що this та o є одним і тим же об'єктом, і тому вираз повертає true.

*/