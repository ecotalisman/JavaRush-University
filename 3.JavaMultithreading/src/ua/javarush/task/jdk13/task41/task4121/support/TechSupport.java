package ua.javarush.task.jdk13.task41.task4121.support;

public abstract class TechSupport {
    private TechSupport nextLevel;

    public TechSupport setNextLevel(TechSupport nextLevel) {
        this.nextLevel = nextLevel;
        return nextLevel;
    }

    protected void passAlongTheChain(String problem) {
        if (nextLevel != null) {
            nextLevel.solve(problem);
        }
    }

    public abstract void solve(String problem);

    // It was a condition and nothing else:
//    public void solve(String problem) {
//        if (problem.matches(".*(завис|зависло|глючить|глюк|гальмує|лагає|нічого не розумію|рятуйте).*")) {
//            System.out.println("\t+ Спокійний як удав оператор кол-центру допоміг вирішити проблему.");
//        } else {
//            System.out.println("\t- Оператори кол-центру не змогли вирішити питання.");
//            if (problem.matches(".*(миша|мишка|клавіатура|монітор|принтер|картридж|катридж|гудить|дзижчить|скрипить).*")) {
//                System.out.println("\t+ Юркі хелпдески в польових умовах виправили все, що зламалося.");
//            } else {
//                System.out.println("\t- Хлопцям з хелпдеску не вдалося подолати проблему.");
//                if (problem.matches(".*(системна помилка|доменна політика|база даних|резервна копія|сервер).*")) {
//                    System.out.println("\t+ Бородатий адмін вислухав проблему і від цього вона вирішилася сама собою.");
//                } else {
//                    System.out.println("\t- Сисадмін походив з бубном навколо проблеми і продовжив плювати в стелю.");
//                    if (problem.matches(".*(договір поставки|аутсорс|аутстафф|корпоратив|премія).*")) {
//                        System.out.println("\t+ Директор департаменту ІТ все розглянув та погодив.");
//                    } else {
//                        System.out.println("\t- Директор департаменту ІТ вирішив відправити весь департамент на курси підвищення кваліфікації.");
//                    }
//                }
//            }
//        }
//    }
}
