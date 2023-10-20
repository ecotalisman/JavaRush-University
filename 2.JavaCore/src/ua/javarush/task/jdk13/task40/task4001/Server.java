package ua.javarush.task.jdk13.task40.task4001;

import java.net.ServerSocket;
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

public class Server {

    public static void main(String[] args) {
        int port = 4444;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket socket = serverSocket.accept();
                new Handler(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (Connection connection = new Connection(socket)) {
                while (true) {
                    String message = connection.receive();

                    if (message.equals("exit")) {
                        break;
                    }

                    System.out.println(message);

                    connection.send("Echo: " + message);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
