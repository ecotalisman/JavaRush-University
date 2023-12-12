package ua.javarush.task.jdk13.task41.task4121.support;

public class CallCenter extends TechSupport {
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(завис|зависло|глючить|глюк|гальмує|лагає|нічого не розумію|рятуйте).*")) {
            System.out.println("\t+ Спокійний як удав оператор кол-центру допоміг вирішити проблему.");
        } else {
            System.out.println("\t- Оператори кол-центру не змогли вирішити питання.");
            passAlongTheChain(problem);
        }
    }
}
