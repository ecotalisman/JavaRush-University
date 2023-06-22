package ua.javarush.task.pro.task15.task1519;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхневе копіювання
Напиши програму, яка зчитує з клавіатури шляхи до двох директорій і копіює файли з однієї директорії в іншу
(тільки файли, директорії ігноруй).
Використай відповідні методи класу Files: newDirectoryStream(), isRegularFile() або isDirectory(), copy().

Requirements:
1. Програма має зчитувати з консолі шлях до директорії.
2. У програмі слід використати відповідні методи класу Files: newDirectoryStream(), isRegularFile() або isDirectory(),
copy().
3. Програма має копіювати файли з однієї директорії в іншу згідно з умовою.
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
                    Files.copy(path, targetPath);
                }
            }
        }
    }
}

