package ua.javarush.task.jdk13.task41.task4115.listeners;

public class FirebasePushNotificationListener implements NotificationListener {
    private String token;

    public FirebasePushNotificationListener(String token) {
        this.token = token;
    }

    @Override
    public void update(NotificationType notificationType, String chainStoreName) {
        System.out.printf("\tНадіслано пуш-повідомлення в андроїд-додаток по токену %s про %s в %s\n", token, notificationType, chainStoreName);
    }
}
