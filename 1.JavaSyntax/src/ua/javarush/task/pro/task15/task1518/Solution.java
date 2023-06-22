package ua.javarush.task.pro.task15.task1518;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
А що там у папці?
Напиши програму, яка зчитує з клавіатури шлях до директорії, отримує список файлів і директорій у вказаній директорії
та виводить в консоль інформацію про них у такому вигляді:
"<шлях до файлу> - це файл", якщо це файл,
"<шлях до директорії> - це директорія", якщо це директорія.
Кутові дужки та лапки виводити не потрібно.
Використай відповідні методи класу Files: newDirectoryStream(Path), isRegularFile(Path) і isDirectory(Path).

Уведено:
C:\javarush\

Виведено:
C:\javarush\test.txt - це файл
C:\javarush\tasks - це директорія
...

Requirements:
1. Програма має зчитувати з консолі шлях до директорії.
2. У програмі слід використати відповідні методи класу Files: newDirectoryStream(Path), isRegularFile(Path) та isDirectory(Path).
3. Програма має отримувати список файлів і директорій у вказаній директорії та виводити в консоль інформацію згідно з умовою.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());

        //напишіть тут ваш код

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) {
            for (Path path : stream) {
                if (Files.isRegularFile(path)) {
                    System.out.println(path + THIS_IS_FILE);
                } else if (Files.isDirectory(path)) {
                    System.out.println(path + THIS_IS_DIR);
                }
            }
        }
    }
}

