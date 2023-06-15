package ua.javarush.task.pro.task15.task1514;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Усе відносне
Напиши програму, яка зчитує з клавіатури два шляхи й виводить у консоль відносний шлях між цими шляхами, якщо він існує.
В іншому випадку нічого виводити не потрібно.

Підказка: якщо не вдалося знайти відносний шлях між шлях1 і шлях2, спробуй знайти відносний шлях між шлях2 і шлях1.

Requirements:
1. Програма має зчитувати з консолі два шляхи.
2. Програма має виводити в консоль відносний шлях між уведеними шляхами, якщо він існує.
3. Для обчислення відносного шляху слід використати метод relativize() класу Path.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишіть тут ваш код
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);

        try {
            Path result1 = path1.relativize(path2);
            System.out.println(result1);
        } catch (IllegalArgumentException e) {
            try {
                Path result2 = path2.relativize(path1);
                System.out.println(result2);
            } catch (IllegalArgumentException ignore) {
            }
        }
    }
}

/*

Path relativize(Path other);

Метод relativize(Path other) у java.nio.file.Path використовується для побудови відносного шляху між поточним шляхом і
заданим шляхом.

Він спробує побудувати відносний шлях так, що коли цей відносний шлях буде доданий (або "розв'язаний") до поточного
шляху, він вкаже на той же файл, що й заданий шлях. Наприклад, на UNIX, якщо поточний шлях (this path) – це "/a/b",
а заданий шлях (other) – це "/a/b/c/d", то результуючий відносний шлях буде "c/d".

Відносний шлях можна побудувати, якщо обидва шляхи не мають кореневої компоненти (тобто вони не починаються з "/").
Якщо тільки один з шляхів має кореневу компоненту, відносний шлях побудувати не можна. Якщо обидва шляхи мають кореневу
компоненту, то чи можна побудувати відносний шлях, залежить від реалізації.

Якщо поточний шлях і заданий шлях однакові, повертається порожній шлях.

Коли підтримуються символічні посилання, то чи результуючий шлях, коли він доданий до поточного шляху, вкаже на той же
файл, що і заданий шлях, також залежить від реалізації.

У разі, якщо заданий шлях (other) не є шляхом, який може бути віднесений до поточного шляху (this path), цей метод
викидає IllegalArgumentException.

*/