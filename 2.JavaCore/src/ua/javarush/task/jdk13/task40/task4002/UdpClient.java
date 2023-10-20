package ua.javarush.task.jdk13.task40.task4002;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

    private final DatagramSocket socket;
    private final InetAddress serverAddress;
    private final int serverPort;

    public UdpClient(int port) throws IOException {
        socket = new DatagramSocket(port);
        serverAddress = InetAddress.getByName("localhost");
        serverPort = 4445;
    }

    public String sendReceive(String message) throws IOException {
        // write code here:
        byte[] data = message.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, serverAddress, serverPort);
        socket.send(datagramPacket);

        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        socket.receive(packet);

        return new String(packet.getData(), 0, packet.getLength());
    }

    public void close() {
        socket.close();
    }
}
