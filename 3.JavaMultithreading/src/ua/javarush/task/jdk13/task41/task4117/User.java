package ua.javarush.task.jdk13.task41.task4117;

public class User {

    // It was a condition:
//    private UserDB db;

    // Change code here:
    private Mediator mediator;
    private int id;
    private String name;

    // It was a condition:
//    public User(UserDB db, int id, String name) {
//        this.db = db;
//        this.name = name;
//        this.id = id;
//    }

    // Change code here:
    public User(Mediator mediator, int id, String name) {
        this.mediator = mediator;
        this.name = name;
        this.id = id;
        this.mediator.register(this);
    }

    public int getId() {
        return id;
    }

    public void send(String msg, int userId) {
        System.out.println(name + " :: вихідне повідомлення : " + msg);

        // It was a condition:
//        User user = db.getById(userId);
//        user.receive(msg);

        // Change code here:
        mediator.sendMessage(msg, userId);
    }

    public void receive(String msg) {
        System.out.println(name + " :: вхідне повідомлення : " + msg);
    }
}