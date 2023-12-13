package ua.javarush.task.jdk13.task42.task4201;

import java.util.concurrent.*;

/* 
Заробити мільйон!
Одна компанія захотіла заробити мільйон. Для цього вирішили створити курси, де за 1000 можна навчитися чогось дуже
цікавого та корисного: вони найняли 10 викладачів та взяли на навчання 1000 студентів.

Але щось пішло не так, і мільйон заробити не виходить. Знайди і виправ помилку в коді, щоб компанія змогла заробити мільйон.

Requirements:
1. Клас Solution не змінюй.
2. Клас CompanyAccount повинен містити private final поле AtomicInteger totalMoney.
3. Конструктор класу CompanyAccount повинен ініціалізувати поле totalMoney значенням, яке передалося.
4. Метод int getTotalMoney() класу CompanyAccount повинен повертати значення поля totalMoney.
5. Метод void addMoney(int money) повинен збільшувати totalMoney на значення, яке передається.
6. Програма повинна виводити на екран фразу "We earned a million!".
*/

public class Solution {
    private static final int THREAD_POOL_SIZE = 10;
    private static final int TIMEOUT = 10;
    private static final int COUNT = 1_000;
    private static final int MONEY = 1_000;
    private static final int MILLION = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        CompanyAccount companyAccount = new CompanyAccount(0);
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        for (int i = 0; i < COUNT; i++) {
            Runnable task = () -> companyAccount.addMoney(MONEY);
            executor.submit(task);
        }

        executor.awaitTermination(TIMEOUT, TimeUnit.MILLISECONDS);
        executor.shutdown();

        System.out.println(companyAccount.getTotalMoney() == MILLION ? "We earned a million!" : "We couldn't make a million(((");
    }
}
