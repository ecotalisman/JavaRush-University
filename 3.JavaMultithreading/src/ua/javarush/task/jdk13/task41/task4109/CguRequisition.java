package ua.javarush.task.jdk13.task41.task4109;

public class CguRequisition extends RequisitionWithPhone {
    public String requestedSubscriptionType;
    public String language;

    public CguRequisition() {
    }

    @Override
    public AbstractEntity clone() {
        return new CguRequisition(this);
    }

    public CguRequisition(CguRequisition cguRequisition) {
        super(cguRequisition);
        if (cguRequisition != null) {
            this.requestedSubscriptionType = cguRequisition.requestedSubscriptionType;
            this.language = cguRequisition.language;
        }
    }
}
