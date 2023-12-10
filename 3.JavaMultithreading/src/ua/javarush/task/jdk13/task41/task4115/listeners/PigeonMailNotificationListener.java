package ua.javarush.task.jdk13.task41.task4115.listeners;

public class PigeonMailNotificationListener implements NotificationListener {
    private String fullAddress;

    public PigeonMailNotificationListener(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public void update(NotificationType notificationType, String chainStoreName) {
        System.out.printf("\tНадіслано поштового голуба з буклетом на адресу %s про %s в %s\n", fullAddress, notificationType, chainStoreName);
    }
}
