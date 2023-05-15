package ua.javarush.task.pro.task13.task1324;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* 
Зарплати та позиції
Хоча HashMap і проста у використанні реалізація Map і гарантує швидкий доступ до даних, але трапляються випадки,
коли необхідно зберігати дані в структурованому вигляді з можливістю навігації за ними.

Метод getJobTitle отримує як параметр TreeMap, в якій значення — це посада, а ключ — мінімальна зарплата для відповідної
посади. Метод повинен повернути посаду (значення в TreeMap), яка відповідає зарплаті, переданій другим параметром в getJobTitle.

Наприклад, якщо передати в метод getJobTitle(map, 300) або getJobTitle(map, 400)), або getJobTitle(map, 799), то має
повернутися рядок "Trainee". А якщо передати getJobTitle(map, 900), — рядок "Junior".

З урахуванням того, що TreeMap реалізує інтерфейс vNavigableMap, це завдання можна вирішити, використовуючи метод(и)
з цього інтерфейсу.


Requirements:
1. Сигнатуру і тип значення, що повертається, методу getJobTitle(Integer) не змінюй.
2. Метод getJobTitle повинен повернути посаду з переданої TreeMap, яка відповідає переданій зарплаті.
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(0, "Newbie");
        map.put(200, "Trainee");
        map.put(800, "Junior");
        map.put(1200, "Strong Junior");
        map.put(2700, "Middle");
        map.put(3500, "Strong Middle");
        map.put(5000, "Senior");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int salary = random.nextInt(50) * 100;
            String position = getJobTitle(map, salary);
            System.out.printf("Зарплатні $%d відповідає позиція %s%n", salary, position);
        }
    }

    public static String getJobTitle(TreeMap<Integer, String> map, Integer salary) {
        //напишіть тут ваш код
        Map.Entry<Integer, String> entry = map.floorEntry(salary);

        return (entry != null) ? entry.getValue() : "No job for this salary";
    }
}

/*

Метод getJobTitle повинен повертати значення з TreeMap, яке відповідає переданій зарплаті. Для цього ви можете
використати метод floorEntry() з інтерфейсу NavigableMap, який повертає найближчий ключ, що менший або рівний даному ключу.

Метод floorEntry() повертає найближчий ключ, що менший або рівний даному ключу, в цьому випадку - зарплаті. Якщо такого
ключа немає, метод повертає null. Тому використовується умовний оператор для перевірки, чи entry не дорівнює null.
Якщо entry не дорівнює null, метод повертає значення, яке відповідає цьому ключу (тобто посаду). Якщо entry дорівнює
null, метод повертає рядок "No job for this salary".

*************************************************************************************************************************************

NavigableMap це інтерфейс в Java, який наслідує інтерфейс SortedMap та додає декілька навігаційних методів, які
забезпечують ефективний пошук та ітерацію крізь підмножини елементів в мапі. Він також дозволяє робити зворотні ітерації,
що недоступно в SortedMap.

Ось декілька основних методів NavigableMap:

- lowerEntry(K key): повертає елемент з найбільшим ключем, меншим за заданий. Якщо такого елементу немає, повертає null.
- floorEntry(K key): повертає елемент з найбільшим ключем, меншим або рівним заданому. Якщо такого елементу немає, повертає null.
- ceilingEntry(K key): повертає елемент з найменшим ключем, більшим або рівним заданому. Якщо такого елементу немає, повертає null.
- higherEntry(K key): повертає елемент з найменшим ключем, більшим за заданий. Якщо такого елементу немає, повертає null.
- descendingMap(): повертає NavigableMap в зворотному порядку.

Одним з основних класів, які реалізують NavigableMap, є TreeMap.

*************************************************************************************************************************************

В контексті даної задачі, floorEntry(K key) було використано тому, що він повертає елемент з найбільшим ключем, меншим
або рівним ( <= ) заданому.

До прикладу, у нас є карта з позиціями та зарплатами:

* Trainee: 200
* Junior: 800
* Middle: 1200

Якщо ми шукаємо позицію для зарплати 900, floorEntry(900) поверне "Junior" (800), оскільки це найбільше значення,
що не перевищує 900. Це відповідає логіці задачі: людина з зарплатою 900 ще не досягла рівня "Middle", але вже перевищила
рівень "Junior".

З іншого боку, ceilingEntry(900) поверне "Middle" (1200), оскільки це найменше значення, що більше або рівне 900.
Це не відповідає логіці задачі, оскільки людина з зарплатою 900 ще не досягла рівня "Middle".

*************************************************************************************************************************************

System.out.printf() - це метод для форматованого виводу тексту. Цей метод дозволяє виводити дані в заданому форматі.
Ось що робить кожна частина цієї команди:

"Зарплатні $%d відповідає позиція %s%n" - це рядок формату. Він визначає, як виводити аргументи, які передаються в
метод printf().

%d - це місце для вставки цілого числа (salary).
%s - це місце для вставки рядка (position).
%n - це символ нового рядка, що відповідає символу \n у рядках.
salary - це значення, яке підставляється на місце %d у рядку формату.

position - це значення, яке підставляється на місце %s у рядку формату.

Отже, цей рядок коду виводить рядок у форматі "Зарплатні $[зарплата] відповідає позиція [позиція]", де [зарплата] і
[позиція] - це значення змінних salary та position, відповідно.

Наприклад, якщо salary = 800 і position = "Junior", то виведеться рядок "Зарплатні $800 відповідає позиція Junior".


'%d' та '%s' є специфікаторами формату в методі printf у мові програмування Java. Ці специфікатори вказують, як аргументи,
що передаються в метод printf, повинні бути відформатовані та виведені.

- %d використовується для виведення десятичних цілих чисел (decimal integer). Це не має ніякого відношення до data science.
- %s використовується для виведення рядків (String).

Ось декілька прикладів інших специфікаторів формату:

- %f використовується для виведення чисел з плаваючою комою.
- %c використовується для виведення символів.
- %b використовується для виведення булевих значень (true або false).

Ці специфікатори формату схожі на ті, що використовуються в мові програмування C, і вони були взяті на зброю в Java
для забезпечення єдиної нотації форматування рядків.

*******************************************************************************************************************************

TreeMap<Integer, String> map = new TreeMap<>();
Map.Entry<Integer, String> entry = map.floorEntry(salary);

Розберемося з ієрархією класів в Java, особливо в контексті Map інтерфейсу.

1. Map є основним інтерфейсом для роботи з колекціями пар "ключ-значення". Він включає базові методи, які використовуються
для отримання, додавання, видалення та перевірки елементів.

2. SortedMap - це підінтерфейс Map, який гарантує, що ключі в колекції зберігаються у впорядкованому вигляді.

3. NavigableMap - це підінтерфейс SortedMap, який включає ряд додаткових методів для навігації по мапі. Методи, як-от
floorEntry, ceilingEntry, higherEntry та інші, дозволяють швидко знайти найближчі ключі до заданого значення.

4. TreeMap - це реалізація NavigableMap (і відповідно SortedMap і Map). Це означає, що він включає всі методи,
що визначені в цих інтерфейсах.

5. Map.Entry - це вкладений (nested) інтерфейс у інтерфейсі Map, який визначає пару "ключ-значення". Він використовується
для роботи з парою "ключ-значення" в мапі. Він використовується в методах, як-от map.entrySet(), для роботи з множинами
пар "ключ-значення".
Коли ми використовуємо методи, як-от map.entrySet(), ми отримуємо множину об'єктів Map.Entry, кожен з яких відповідає
парі "ключ-значення" в мапі.

Цей вкладений інтерфейс Map.Entry дозволяє працювати з ключем та значенням як з єдиною одиницею, що може бути корисним
в деяких сценаріях. Наприклад, ми можемо використовувати його для ітерації по мапі та виконання операцій на основі
ключа та значення одночасно.


Отже, у нашому прикладі ми створюємо об'єкт TreeMap, який реалізує інтерфейси Map, SortedMap і NavigableMap.
Тоді ми використовуємо метод floorEntry з інтерфейсу NavigableMap для отримання об'єкта Map.Entry, який представляє
пару "ключ-значення".

*/

