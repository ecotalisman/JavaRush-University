package ua.javarush.task.jdk13.task28.task2806;

import java.util.*;
import java.util.concurrent.FutureTask;

/* 
Паралельний парсинг
Преретвори програму, скориставшись інтерфейсом Callable замість Runnable:

у класі ParseLinkTask заміни інтерфейс Runnable на Callable<Link>;
метод run переназви в call;
видали поле link та його геттер, а замість нього в методі call створи, заповни та поверни локальну змінну типу Link.

Requirements:
1. Клас ParseLinkTask повинен реалізувати інтерфейс Callable<Link> і його метод call.
2. У класі ParseLinkTask не повинно бути поля link і методу getLink.
3. Метод call повинен повертати об'єкт Link, сформований на основі рядка line.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            lines.add(scanner.nextLine());
        }

        // Change code here:
        List<FutureTask<Link>> futureTasks = new ArrayList<>();

        for (String line : lines) {
            ParseLinkTask parseLinkTask = new ParseLinkTask(line);
            FutureTask<Link> futureTask = new FutureTask<>(parseLinkTask);
            futureTasks.add(futureTask);
            new Thread(futureTask).start();
        }

        for (FutureTask<Link> futureTask : futureTasks) {
            System.out.println(futureTask.get()); // get() блокується, поки завдання не буде виконано
        }

        // It was a condition:
//        Map<Thread, ParseLinkTask> tasks = new HashMap<>();
//        for (String line : lines) {
//            ParseLinkTask parseLinkTask = new ParseLinkTask(line);
//            Thread thread = new Thread(parseLinkTask);
//            tasks.put(thread, parseLinkTask);
//            thread.start();
//        }
//
//        for (Map.Entry<Thread, ParseLinkTask> entry : tasks.entrySet()) {
//            entry.getKey().join();
//            System.out.println(entry.getValue().getLink());
//        }
    }
}

/*

що потрібно зробити:

1. Клас ParseLinkTask: Ви вже правильно замінили реалізацію Runnable на Callable<Link>, і також змінили run на call.
Але потрібно також видалити усі посилання на змінну link, як вказано в умові завдання.

2. Метод main в класі Solution: Тут вам потрібно замінити створення і запуск потоків на використання FutureTask
(оскільки Callable повертає результат, вам потрібно зберігати цей результат у FutureTask).

2.1 Створіть об'єкт FutureTask для кожного об'єкта ParseLinkTask.
2.2 Замість використання Thread для запуску завдань використовуйте ExecutorService або просто Thread, але в якості
завдання передавайте FutureTask.

2.3 Щоб отримати результат, використовуйте метод get() з FutureTask.

Отже, основна ідея в тому, щоб замінити поточний спосіб створення і запуску потоків на використання FutureTask, який
дозволяє вам отримувати результат виконання завдань Callable.

Зверніть увагу, що видалення поля link і методу getLink() в класі ParseLinkTask є необхідним, оскільки зараз ви
повертаєте об'єкт Link прямо з методу call().

****************************************************************************************************************************

Тому давайте зосередимось на наступному пункті: роботі з Callable у методі main.

Наразі ви використовуєте потоки для виконання завдань, що базуються на Runnable. Але з появою Callable у вас є
можливість отримати результат з виконання завдання. Щоб це реалізувати, вам потрібно використовувати FutureTask,
який є реалізацією інтерфейсу Future, дозволяючи отримати результат після виконання.

Тому ось кроки, які ви повинні виконати:

1. Замість зберігання пари (Thread, ParseLinkTask) у Map, зберігайте FutureTask у списку.
2. Створіть FutureTask для кожного екземпляру ParseLinkTask.
3. Запустіть кожен FutureTask у новому потоці.
4. Після того, як усі завдання буде запущено, отримайте результат виконання для кожного FutureTask і виведіть його.

Ось приклад того, як це можна зробити:

List<FutureTask<Link>> futureTasks = new ArrayList<>();

for (String line : lines) {
    ParseLinkTask parseLinkTask = new ParseLinkTask(line);
    FutureTask<Link> futureTask = new FutureTask<>(parseLinkTask);
    futureTasks.add(futureTask);
    new Thread(futureTask).start();
}

for (FutureTask<Link> futureTask : futureTasks) {
    System.out.println(futureTask.get()); // get() блокується, поки завдання не буде виконано
}

Таким чином, ви зможете отримати результат виконання для кожного завдання і вивести його.

****************************************************************************************************************************

Код розроблено для паралельного парсингу URL-посилань. Ось що він робить:

1. ParseLinkTask: Цей клас реалізує інтерфейс Callable, який призначений для парсингу URL-посилань та створення об'єкта
Link, що містить розділені елементи URL (протокол, адресу та параметри).

2. Link: Цей клас представляє собою структуру даних, що містить елементи URL-посилання.

3. Solution: Головний клас, де користувач вводить 4 URL-посилання. Для кожного URL створюється завдання ParseLinkTask,
яке запускається у власному потоці. Після завершення виконання завдань результати виводяться на екран.

Для того щоб отримати результат, вам потрібно ввести чотири URL-посилання, коли програма цього попросить. Ось формат,
який ви повинні слідувати:

http://example.com
http://google.com/search?q=openai
https://openai.com/about/
ftp://files.openai.com/data.txt

Програма аналізує кожне посилання, визначає протокол (http, https, ftp тощо), основну адресу та параметри запиту
(якщо є), а потім виводить результати.

Зверніть увагу, що цей код обробляє лише прості URL-посилання та може не правильно працювати зі складними URL або тими,
які не відповідають зазначеному формату.

Output:
Link{protocol='http', address='example.com', parameters={}}
Link{protocol='http', address='google.com/search', parameters={q=openai}}
Link{protocol='https', address='openai.com/about/', parameters={}}
Link{protocol='ftp', address='files.openai.com/data.txt', parameters={}}

****************************************************************************************************************************

FutureTask - це клас, який реалізує інтерфейси Runnable та Future. Він часто використовується для представлення
обчислювальних операцій, які виконуються асинхронно.

Ось декілька ключових моментів про FutureTask:

1. Асинхронність: Коли ви створюєте об'єкт FutureTask, ви передаєте йому об'єкт, що реалізує інтерфейс Callable.
Цей Callable буде виконуватися асинхронно, коли ви запустите FutureTask у потоці.

2. Отримання результату: FutureTask дозволяє вам отримати результат виконання Callable за допомогою методу get().
Якщо Callable ще не завершив виконання, get() блокується, поки результат не стане доступним.

3. Запуск: FutureTask можна запустити, використовуючи екземпляр Thread або використовуючи ExecutorService.

Тепер, щодо List<FutureTask<Link>> futureTasks = new ArrayList<>();:

Цей рядок коду створює список об'єктів FutureTask, де кожен FutureTask повертає об'єкт типу Link після завершення свого
виконання. Generic <Link> вказує, що кожен FutureTask в списку використовує Callable, який повертає Link.

Використання такого generic допомагає забезпечити типову безпеку, тобто коли ви працюєте з об'єктами цього списку,
компілятор Java знає, що кожен FutureTask повертає об'єкт типу Link, і це допомагає уникнути типових помилок під
час компіляції.

****************************************************************************************************************************

Коли ви створюєте List<FutureTask<Link>> futureTasks = new ArrayList<>();, ви створюєте список (List), кожен елемент
якого є об'єктом типу FutureTask<Link>. Тобто це список задач, де кожна задача, коли вона завершиться, поверне
результат типу Link.

Тепер, коли ви хочете пройтися по всіх цих задачах, ви може використовувати цикл foreach для ітерації по елементах
цього списку. В контексті цього циклу:

for (FutureTask<Link> futureTask : futureTasks) {
    System.out.println(futureTask.get());
}

futureTask є одним з елементів списку futureTasks. Кожна ітерація циклу foreach "витягує" один FutureTask<Link> зі
списку futureTasks і працює з ним. Тому всередині циклу ви може використовувати метод get() для отримання результату
цієї конкретної задачі.

Тому, коли ви використовуєте конструкцію:

for (FutureTask<Link> futureTask : futureTasks)

Ви говорите: "Для кожної задачи (FutureTask<Link> futureTask) в списку задач (futureTasks), я хочу зробити певні дії."

****************************************************************************************************************************

List<FutureTask<Link>> futureTasks = new ArrayList<>();

for (FutureTask<Link> futureTask : futureTasks) {
    System.out.println(futureTask.get());
}

Давайте спростимо це на прикладі.

Уявіть собі, що у вас є коробка з м'ячиками (це наш List). Кожен м'ячик в коробці — це FutureTask<Link>. Коли ви
створюєте список (List), ви фактично створюєте коробку для м'ячиків. А коли ви додаєте FutureTask<Link> до futureTasks,
ви кладете м'ячик до цієї коробки.

Тепер, коли ви проходитеся по futureTasks за допомогою циклу foreach, ви, по суті, берете кожен м'ячик з коробки по
черзі і робите з ним певні дії. В нашому випадку, ви чекаєте, поки задача завершиться (futureTask.get()), і потім
виводите результат на екран.

Отже, List (або коробка) — це просто контейнер, що зберігає об'єкти (у нашому випадку — м'ячики або FutureTask<Link>).
І коли ми ітеруємо по списку, ми працюємо з окремими об'єктами, що знаходяться всередині цього списку (або м'ячиками
з коробки).

Список (або будь-яка інша колекція) — це просто структура даних для зберігання і організації об'єктів. І коли ми
"проходимося" по такому списку, ми насправді працюємо з окремими об'єктами всередині цього списку.
*/