package ua.javarush.task.jdk13.task41.task4109;

public abstract class RequisitionBase extends AbstractEntity {
    public User user;
    public String name;
    public String mail;
    public String utmMark;
    public String webinarType;
    public String promoCode;

    public RequisitionBase() {
    }

    public RequisitionBase(RequisitionBase requisitionBase) {
        super(requisitionBase);
        if (requisitionBase != null) {
            this.user = requisitionBase.user != null ? (User) requisitionBase.user.clone() : null;
            this.name = requisitionBase.name;
            this.mail = requisitionBase.mail;
            this.utmMark = requisitionBase.utmMark;
            this.webinarType = requisitionBase.webinarType;
            this.promoCode = requisitionBase.promoCode;
        }
    }
}
