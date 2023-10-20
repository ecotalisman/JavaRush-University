package ua.javarush.task.jdk13.task40.task4001;


import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

public class Connection implements Closeable {
    private final Socket socket;
    private final ObjectInputStream in;
    private final ObjectOutputStream out;

    public Connection(Socket socket) throws Exception {
        this.socket = socket;

        // It was a condition:
//        this.in = new ObjectInputStream(socket.getInputStream());
//        this.out = new ObjectOutputStream(socket.getOutputStream());

        // change code here - first init `ObjectOutputStream`, second init - `ObjectInputStream`:
        this.out = new ObjectOutputStream(socket.getOutputStream());
        this.in = new ObjectInputStream(socket.getInputStream());
    }

    public void send(String message) throws Exception {
        out.writeObject(message);
    }

    public String receive() throws Exception {
        return (String) in.readObject();
    }

    @Override
    public void close() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}

/*

Коли клієнт і сервер з'єднуються, обидва чекають, поки другий закінчить ініціалізацію вхідного потоку, оскільки для
ініціалізації ObjectInputStream необхідно, щоб потік був вже записаний до ObjectOutputStream на іншому кінці.
Це викликає блокування обох сторін.

Щоб вирішити цю проблему, вам потрібно змінити послідовність ініціалізації в Connection:
Спочатку ініціалізуйте ObjectOutputStream, а потім ObjectInputStream.

*/