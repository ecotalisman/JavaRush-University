package ua.javarush.task.jdk13.task27.task2707;

/* 
Розстав wait-notify.

Приклад виведення:
Thread-0 MailServer received: [Person [Thread-1] wrote an email 'AAA'] in 1001 ms after start

Requirements:
1. Об'єкти класу MailServer повинні працювати коректно у багатопотоковому середовищі.
2. Об'єкти класу Person повинні працювати коректно у багатопотоковому середовищі.
3. У методі run класу MailServer має бути synchronized блок, монітор - mail.
4. У методі run класу Person має бути synchronized блок, монітор - mail.
*/

public class Solution {
    public static void main(String[] args) {
        Mail mail = new Mail();
        Thread server = new Thread(new MailServer(mail));
        Thread amigo = new Thread(new Person(mail));

        server.start();
        amigo.start();
    }
}

/*

Ідея:
- Є спільний ресурс - це Mail.
- У нас є два потоки: один (Person) відправляє листа, а інший (MailServer) приймає його.

Як це працює:

1. MailServer (потік прийому):
Завдання: Прийняти листа від Person, але тільки коли листа буде готово.

Коли run() метод MailServer виконується, він перевіряє, чи є лист (mail.getText()) від Person. Якщо немає, він починає
чекати (wait()) в synchronized блоку на ресурсі mail.

synchronized(mail) гарантує, що в один і той же час тільки один потік може мати доступ до mail.

while (mail.getText() == null) { mail.wait(); } - Цикл while використовується для перевірки, чи є лист готовий
до прийому. Якщо ні, MailServer "спить" до тих пір, поки Person не відправить листа.

2. Person (потік відправки):
Завдання: Відправити листа на MailServer.

Коли run() метод Person виконується, він спить 1 секунду (Thread.sleep(1000)), що імітує певну затримку перед
відправкою листа. Після цього в synchronized блоку на ресурсі mail, він встановлює текст листа (mail.setText(...)) і
сповіщає всі чекаючі потоки (mail.notifyAll()) про те, що лист готовий до прийому.

synchronized(mail) знову ж таки гарантує, що в один і той же час тільки один потік може мати доступ до mail.

mail.notifyAll() - викликає прокидає всі потоки, які використовують ресурс mail і зараз в режимі очікування
через wait(). У нашому випадку це MailServer.

Покроково:
1. MailServer перевіряє, чи є лист. Немає – починає чекати.
2. Person спить 1 секунду, потім відправляє листа і сповіщає MailServer.
3. MailServer прокидається, бачить готовий лист і продовжує свою роботу.

Чому так:
- Ми використовуємо synchronized блоки, щоб гарантувати, що тільки один потік має доступ до спільного ресурсу mail в один час.
- MailServer використовує wait(), щоб "спати" до тих пір, поки лист не буде готовий.
- Person використовує notifyAll(), щоб "прокинути" MailServer після відправки листа.

*/