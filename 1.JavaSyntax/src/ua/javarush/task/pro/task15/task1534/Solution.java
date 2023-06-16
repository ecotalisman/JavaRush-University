package ua.javarush.task.pro.task15.task1534;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
Обрізання файлу
Реалізуй метод trimByPosition: він повинен обрізати файл, представлений каналом fileChannel, до його поточної позиції.

Requirements:
1. Метод trimByPosition повинен визначити поточну позицію fileChannel.
2. Метод trimByPosition повинен обрізати файл каналу fileChannel до поточної позиції.
*/
public class Solution {

    public static void main(String[] args) {
        try (FileChannel channel = FileChannel.open(Paths.get("c:/test/file.txt"), StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            ByteBuffer buf = ByteBuffer.allocate(64);
            channel.read(buf);
            System.out.println("У файлі повинно залишитися:\n" + new String(buf.array(), StandardCharsets.UTF_8));
            trimByPosition(channel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void trimByPosition(FileChannel fileChannel) throws IOException {
        //напишіть тут ваш код
        long position = fileChannel.position();
        fileChannel.truncate(position);
    }
}

/*

Використаємо метод truncate() класу FileChannel.

Метод truncate() використовується для зміни розміру пов'язаного з каналом файлу. Якщо поточний розмір файлу більший
за вказаний, то файл зменшується.
Якщо поточний розмір файлу менший за вказаний або дорівнює йому, то файл не змінюється.
Якщо ж позиція потоку є більшою за новий розмір, то вона змінюється і стає рівною новому розміру.

fileChannel.position() повертає поточну позицію у файлі, а fileChannel.truncate(currentPosition) зменшує розмір файлу
до цієї позиції.

*/
