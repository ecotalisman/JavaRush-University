package ua.javarush.task.pro.task15.task1535;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

/* 
Розбиваємо файл на частини
У методі splitFile(String fileName, int partSize) за допомогою NIO потрібно розбити файл з ім’ям fileName на файли
розміром partSize байт.
Нові файли потрібно називати так само як fileName, додаючи в кінці імені номер:

початковий файл — file.txt
нові файли— file1.txt, file2.txt, file3.txt и т.д.
Перед створенням нових файлів потрібно перевірити, чи вони ще не існують. Якщо файли з такими іменами вже є, перезаписати їх.

Приклад: якщо початковий файл мав розмір 25 байт, а partSize дорівнював 10, то на виході має вийти два файли по 10 байт і ще один файл розміром 5 байт..

Requirements:
1. Метод splitFile не повинен змінювати вхідний файл fileName.
2. Метод splitFile не повинен створювати нові файли відповідно до умови.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        splitFile("C:\\test\\file.txt", 1024);

        // Test my file.txt in folder:
//        splitFile("1.JavaSyntax\\\\src\\\\ua\\\\javarush\\task\\pro\\task15\\task1535\\file.txt", 1024);
    }

    public static void splitFile(String fileName, int partSize) throws IOException {
        try (FileChannel inputChannel = FileChannel.open(Paths.get(fileName))) {
            //напишіть тут ваш код
            int count = 1;
            ByteBuffer buffer = ByteBuffer.allocate(partSize);
            int value = inputChannel.read(buffer);

            while (value > 0) {
                Path path = Path.of(getNewFileName(fileName, count));
                count++;
                if (Files.notExists(path)) {
                    Files.createFile(path);
                }
                try (FileChannel open = FileChannel.open(path, StandardOpenOption.WRITE)) {
                    buffer.flip();
                    open.write(buffer);
                    buffer.clear();
                    value = inputChannel.read(buffer);
                }
            }
        }
    }


    public static String getNewFileName(String oldFileName, int number) {
        int dotIndex = oldFileName.lastIndexOf(".");
        return oldFileName.substring(0, dotIndex) + number + oldFileName.substring(dotIndex);
    }
}
