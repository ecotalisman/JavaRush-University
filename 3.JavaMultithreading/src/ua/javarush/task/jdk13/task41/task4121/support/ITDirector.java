package ua.javarush.task.jdk13.task41.task4121.support;

public class ITDirector extends TechSupport {
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(договір поставки|аутсорс|аутстафф|корпоратив|премія).*")) {
            System.out.println("\t+ Директор департаменту ІТ все розглянув та погодив.");
        } else {
            System.out.println("\t- Директор департаменту ІТ вирішив відправити весь департамент на курси підвищення кваліфікації.");
        }
    }
}
