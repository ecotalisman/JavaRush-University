package ua.javarush.task.jdk13.task41.task4117;

/* 
Вітаннячка в цьому чаті
Дано: щось віддалено схоже на чат. У нинішній реалізації є недоліки, які тобі потрібно виправити: зараз користувачі
спілкуються безпосередньо з базою даних та іншими користувачами.

Використовуй патерн Посередник, щоб це виправити:

1. Створи інтерфейс Mediator з методами void sendMessage(String msg, int userId) і void register(User user).
2. Створи конкретного посередника — клас Chat:
- із класу User перемісти до Chat поле db;
- додай конструктор, який отримує екземпляр бази даних та ініціалізує поле db;
- у методі sendMessage отримай користувача з бази даних і виклич у нього метод receive;
- у методі register додай користувача до бази даних.
3. До класу User додай приватне поле Mediator mediator. Отримай та ініціалізуй його у конструкторі замість db.
4. У методі send класу User делегуй виконання посередника.

Requirements:
1. Клас UserDB не повинен змінюватись.
2. Повинен існувати інтерфейс Mediator із методами відповідно до умови завдання.
3. Має існувати клас Chat, реалізований відповідно до умови.
4. Клас User повинен бути змінений відповідно до умови.
*/

public class Solution {
    public static void main(String[] args) {
        UserDB db = new UserDB();

        // It was a condition:
//        User user1 = new User(db,1, "Льоша");
//        User user2 = new User(db,2, "Боря");
//        User user3 = new User(db,3, "Чінгіз");
//        User user4 = new User(db,4, "David");

        // Change code here:
        User user1 = new User(new Chat(db),1, "Льоша");
        User user2 = new User(new Chat(db),2, "Боря");
        User user3 = new User(new Chat(db),3, "Чінгіз");
        User user4 = new User(new Chat(db),4, "David");

        db.add(user1);
        db.add(user2);
        db.add(user3);
        db.add(user4);

        user1.send("Добрий день, Борисе Олексійовичу", 2);
        user2.send("Вітаю! Олексій Борисович", 1);
    }
}
