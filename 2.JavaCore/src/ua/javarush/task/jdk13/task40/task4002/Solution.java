package ua.javarush.task.jdk13.task40.task4002;

import java.io.IOException;

/* 
UDP сервер і клієнт
Реалізуй метод sendReceive(String message) у UdpClient. Він повинен: - за допомогою DatagramSocket надіслати повідомлення
message на сервер з адресою serverAddress і портом serverPort; - отримати повідомлення з того ж сервера (можна
використовувати буфер розміром 1024 байт); - повернути отримане повідомлення у вигляді рядка.

Requirements:
1. Метод sendReceive має надсилати повідомлення на сервер згідно з умовою завдання.
2. Метод sendReceive має отримувати та повертати повідомлення з сервера згідно з умовою завдання.
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        new MessageServer().start();
        UdpClient client1 = new UdpClient(4446);
        UdpClient client2 = new UdpClient(4447);

        System.out.println(client1.sendReceive("111111111"));
        System.out.println(client1.sendReceive("222222222"));
        System.out.println(client1.sendReceive("333333333"));
        System.out.println(client1.sendReceive("444444444"));

        System.out.println(client2.sendReceive("qqqqqqq"));

        System.out.println(client1.sendReceive("55555555"));
        System.out.println(client1.sendReceive("end"));

        client1.close();
        client2.close();
    }
}

/*

код у sendReceive виконує умову завдання:

1) Надсилання повідомлення на сервер:
byte[] data = message.getBytes();
DatagramPacket datagramPacket = new DatagramPacket(data, data.length, serverAddress, serverPort);
socket.send(datagramPacket);

Конвертуємо рядок message в масив байтів, створюється пакет на основі цього масиву, адреси сервера та порту сервера,
а потім надсилається цей пакет через сокет.

2) Отримання повідомлення з сервера:
DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
socket.receive(packet);

Створюємо новий пакет даних з буфером у 1024 байти для отримання відповіді від сервера. Метод socket.receive(packet)
блокується (зупиняється) до того часу, поки не отримає відповідь.

3) Повернення отриманого повідомлення у вигляді рядка:
return new String(packet.getData());

Конвертуємо масив байтів з отриманого пакета назад у рядок та повертається цей рядок.

Проте, рекомендується зробити невелике вдосконалення:
при конвертації масиву байтів в рядок, слід брати до уваги фактичну довжину отриманих даних, а не просто конвертувати
весь буфер. Це може допомогти уникнути зайвих порожніх символів на кінці рядка:

return new String(packet.getData(), 0, packet.getLength());

*/