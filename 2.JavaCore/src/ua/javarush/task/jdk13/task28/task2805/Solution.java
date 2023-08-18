package ua.javarush.task.jdk13.task28.task2805;

import java.util.concurrent.FutureTask;

/* 
Багатопотоковий факторіал
Перетвори програму таким чином, щоб вона обчислювала факторіал у паралельному потоці:

додай класу CalculateFactorial реалізацію інтерфейсу Callable<Long>;
метод calculate перероби в call, а замість параметра number створи в CalculateFactorial поле number;
до класу CalculateFactorial додай конструктор з одним параметром Long який ініціалізує поле number.
У класі Solution є код, який повинен працювати з оновленим класом CalculateFactorial.

Можеш розкоментувати його та перевірити роботу програми.

Requirements:
1. Клас CalculateFactorial повинен реалізувати інтерфейс Callable<Long> та його метод call.
2. Тіло методу call має залишитися таким самим, яким було в методі calculate.
3. У класі CalculateFactorial має бути приватне не статичне поле number.
4. У класі CalculateFactorial має бути конструктор, який ініціалізує поле number.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
//        System.out.println(CalculateFactorial.calculate(35L));

        FutureTask<Long> future1 = new FutureTask<>(new CalculateFactorial(3L));
        FutureTask<Long> future2 = new FutureTask<>(new CalculateFactorial(10L));
        FutureTask<Long> future3 = new FutureTask<>(new CalculateFactorial(35L));
        new Thread(future1).start();
        new Thread(future2).start();
        new Thread(future3).start();
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
    }
}

/*

Що виконано:

1) Додали інтерфейс Callable<Long> до класу CalculateFactorial: Інтерфейс Callable використовується для створення
завдань, які можуть виконуватися паралельно і повертати результат (у вас це Long). Runnable не може повертати результат,
тому Callable є більш потужним.

2) Додали поле number: Це потрібно, щоб визначити, яке число буде використовуватися для розрахунку факторіалу.

3) Додали конструктор: Цей конструктор приймає число і встановлює його у поле number.

4) Замінили метод calculate() на метод call(): Метод call() є методом інтерфейсу Callable і він буде виконаний, коли
ви викликаєте FutureTask.get() в головному методі. Ви просто використовуєте раніше написаний метод calculate() всередині
методу call().

5) Використовували FutureTask для виконання завдань в паралельних потоках: Коли ви створюєте новий об'єкт FutureTask,
ви передаєте новий екземпляр CalculateFactorial з числом, для якого потрібно розрахувати факторіал. Потім ви створюєте
новий потік, передаєте йому FutureTask і запускаєте потік. Коли потік виконаний, ви можете отримати результат факторіалу,
викликавши future.get().

Тепер ваш код здатний обчислювати факторіали чисел паралельно в різних потоках, і ви можете отримати результати цих
обчислень за допомогою об'єктів FutureTask.

*/