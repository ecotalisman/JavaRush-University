package ua.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Переміщення файлів
Напиши програму, яка зчитує з клавіатури шляхи до двох директорій і переміщує файли з однієї директорії в іншу
(тільки файли, директорії ігноруй). Використай відповідні методи класу Files: newDirectoryStream(), isRegularFile()
або isDirectory(), move().

Requirements:
1. Програма має зчитувати з консолі шляхи до директорій.
2. У програмі слід використати відповідні методи класу Files згідно з умовою.
3. Програма має переміщати файли з однієї директорії в іншу згідно з умовою.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());

        //напишіть тут ваш код
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : stream) {
                if (Files.isRegularFile(path)) {
                    Path targetPath = targetDirectory.resolve(sourceDirectory.relativize(path));
                    Files.move(path, targetPath);
                }
            }
        }
    }
}

