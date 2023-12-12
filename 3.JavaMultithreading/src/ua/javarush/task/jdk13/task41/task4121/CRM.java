package ua.javarush.task.jdk13.task41.task4121;

import ua.javarush.task.jdk13.task41.task4121.support.*;

public class CRM {

    private TechSupport techSupport;

    // It was a condition:
//    public CRM() {
//        this.techSupport = new TechSupport();
//    }

    public CRM() {
        this.techSupport = new CallCenter();
        techSupport.setNextLevel(new HelpDesk())
                .setNextLevel(new SysAdmin())
                .setNextLevel(new ITDirector());

        // classic realisation Chain of Responssbility:
//        CallCenter callCenter = new CallCenter();
//        HelpDesk helpDesk = new HelpDesk();
//        SysAdmin sysAdmin = new SysAdmin();
//        ITDirector itDirector = new ITDirector();
//
//        callCenter.setNextLevel(helpDesk);
//        helpDesk.setNextLevel(sysAdmin);
//        sysAdmin.setNextLevel(itDirector);
//
//        this.techSupport = callCenter;
    }

    public void register(String problem) {
        System.out.println(problem);
        techSupport.solve(problem.trim().toLowerCase());
    }
}
