package ua.javarush.task.jdk13.task40.task4001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/* 
Сокетний сервер і клієнт
Є сервер, він приймає вхідні повідомлення від клієнтів і відповідає їм echo.
Є клієнти, вони зчитують повідомлення з клавіатури і надсилають їх серверу.
Програма запускається, але не працює.
Розберися в чому проблема, внеси мінімальні зміни до коду, щоб усе запрацювало.

Requirements:
1. Клас Client не змінюй.
2. Клас Server не змінюй.
3. Внеси потрібні зміни до класу Connection.
4. Поля в класі Connection не змінюй.
*/

public class Client {
    private Connection connection;

    private String getServerAddress() {
        return "localhost";
    }

    private int getServerPort() {
        return 4444;
    }

    public void run() {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        try {
            connection = new Connection(new Socket(getServerAddress(), getServerPort()));

            SocketThread socketThread = new SocketThread();
            socketThread.setDaemon(true);
            socketThread.start();

            while (true) {
                String text = bis.readLine();
                if ("exit".equalsIgnoreCase(text))
                    break;
                connection.send(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public class SocketThread extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    String message = connection.receive();
                    System.out.println(message);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
