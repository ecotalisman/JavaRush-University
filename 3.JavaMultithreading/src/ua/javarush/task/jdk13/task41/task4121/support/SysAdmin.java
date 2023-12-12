package ua.javarush.task.jdk13.task41.task4121.support;

public class SysAdmin extends TechSupport {
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(системна помилка|доменна політика|база даних|резервна копія|сервер).*")) {
            System.out.println("\t+ Бородатий адмін вислухав проблему і від цього вона вирішилася сама собою.");
        } else {
            System.out.println("\t- Сисадмін походив з бубном навколо проблеми і продовжив плювати в стелю.");
            passAlongTheChain(problem);
        }
    }
}
