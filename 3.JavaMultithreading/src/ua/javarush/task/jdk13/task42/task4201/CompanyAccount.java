package ua.javarush.task.jdk13.task42.task4201;

import java.util.concurrent.atomic.AtomicInteger;

public class CompanyAccount {

    private final AtomicInteger totalMoney;

    public CompanyAccount(int totalMoney) {
        this.totalMoney = new AtomicInteger(totalMoney);
    }

    public int getTotalMoney() {
        return totalMoney.get();
    }

    public void addMoney(int money) {
        totalMoney.getAndAdd(money);
    }

    // It was a condition:
//    private Integer totalMoney;
//
//    public CompanyAccount(int totalMoney) {
//        this.totalMoney = totalMoney;
//    }
//
//    public int getTotalMoney() {
//        return totalMoney;
//    }
//
//    public void addMoney(int money) {
//        totalMoney += money;
//    }
}
