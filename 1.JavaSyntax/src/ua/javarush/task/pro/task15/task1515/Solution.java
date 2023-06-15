package ua.javarush.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютний шлях
Напиши код, який буде зчитувати з клавіатури шлях і виводити його в консоль. Якщо шлях не є абсолютним, то перед
виведенням його потрібно перетворити на абсолютний.

Requirements:
1. Програма має зчитувати з консолі шлях до файлу/папки.
2. Програма має виводити в консоль цей шлях і за потреби перетворювати його на абсолютний.
3. Для перевірки й перетворення шляху на абсолютний слід використати методи isAbsolute() і toAbsolutePath() класу Path.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишіть тут ваш код
        Path path = Path.of(str);
        if (!(path.isAbsolute())) {
            System.out.println(path.toAbsolutePath());
        } else {
            System.out.println(path);
        }
    }
}

