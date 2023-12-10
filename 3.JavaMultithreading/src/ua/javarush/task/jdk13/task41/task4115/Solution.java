package ua.javarush.task.jdk13.task41.task4115;

/* 
У вас є знижка!

Об'єкти ChainStore — це мережі супермаркетів, в яких регулярно проводяться різноманітні акції та заходи, а також діють
гнучкі системи знижок.

Тобі потрібно реалізувати для покупців можливість підписуватися на ці події, щоб нічого не пропустити. У цьому тобі
допоможе патерн Спостерігач, який вже практично реалізовано в пакетах publisher та listeners.

Залишилося тільки зв'язати їх з ChainStore:

- Додай у ChainStore публічне поле notifications типу NotificationManager.
- До конструктора ChainStore додай ініціалізацію notifications, передавши до конструктора NotificationManager усі
можливі NotificationType.
- У відповідних методах ChainStore виклич у notifications метод notify з відповідними параметрами.
- Розкоментуй код у класі Solution і перевір, що механізм передплат/повідомлень працює.

Requirements:
1. Класи в пакетах publisher та listeners не повинні змінюватися.
2. У класі ChainStore має бути поле notifications відповідно до умови.
3. Конструктор ChainStore повинен ініціалізувати notifications відповідно до умови.
4. Методи класу ChainStore повинні викликати метод notify відповідно до умови.
*/

import ua.javarush.task.jdk13.task41.task4115.listeners.EmailNotificationListener;
import ua.javarush.task.jdk13.task41.task4115.listeners.FirebasePushNotificationListener;
import ua.javarush.task.jdk13.task41.task4115.listeners.PigeonMailNotificationListener;

import static ua.javarush.task.jdk13.task41.task4115.listeners.NotificationType.*;

public class Solution {

    public static ChainStore atb = new ChainStore("АТБ");
    public static ChainStore lidl = new ChainStore("Lidl");
    public static ChainStore walmart = new ChainStore("Walmart");

    public static void main(String[] args) {
        subscribeAll();

        lunchAll(atb);
        lunchAll(lidl);
        lunchAll(walmart);
    }

    public static void subscribeAll() {
        atb.notifications.subscribe(EVENT, new EmailNotificationListener("diego@javarush.co"));
        atb.notifications.subscribe(EVENT, new EmailNotificationListener("imyarek@javarush.co"));
        atb.notifications.subscribe(SALE, new FirebasePushNotificationListener("123456789"));
        atb.notifications.subscribe(SALE, new FirebasePushNotificationListener("562346245626"));
        atb.notifications.subscribe(SALE, new FirebasePushNotificationListener("234534565636787689"));
        atb.notifications.subscribe(SALE, new FirebasePushNotificationListener("2345245763537"));

        lidl.notifications.subscribe(EVENT, new EmailNotificationListener("diego@javarush.co"));

        walmart.notifications.subscribe(EVENT, new EmailNotificationListener("diego@javarush.co"));
        walmart.notifications.subscribe(PROMO, new PigeonMailNotificationListener("Лондон, Бейкер-стріт, 221b"));
    }

    public static void lunchAll(ChainStore store) {
        store.launchEvent();
        store.launchPromo();
        store.launchPersonalOffer();
        store.launchSale();
    }
}
