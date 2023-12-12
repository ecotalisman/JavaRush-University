package ua.javarush.task.jdk13.task41.task4121.support;

public class HelpDesk extends TechSupport {
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(миша|мишка|клавіатура|монітор|принтер|картридж|катридж|гудить|дзижчить|скрипить).*")) {
            System.out.println("\t+ Юркі хелпдески в польових умовах виправили все, що зламалося.");
        } else {
            System.out.println("\t- Хлопцям з хелпдеску не вдалося подолати проблему.");
            passAlongTheChain(problem);
        }
    }
}
