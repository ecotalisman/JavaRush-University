package ua.javarush.task.pro.task15.task1513;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Дивися в корінь
Напиши програму, в якій користувач уводить з клавіатури шлях до файлу або папки, після чого в консоль виводиться шлях
до диска (корінь для шляху в стилі Unix), на якому розташовано цей файл (або папку).
Для розв'язання задачі використовуй Path і його методи.

Requirements:
1. Програма має зчитувати з консолі шлях до файлу/папки.
2. Програма має виводити в консоль шлях до диска, на якому розташовано цей файл або папку.
3. Для отримання шляху до диска з переданого шляху потрібно використати метод getRoot() класу Path.
4. Не використовуй такі класи пакету java.io: File, FileInputStream, FileOutputStream, FileReader, FileWriter.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишіть тут ваш код
        Path path = Path.of(str);
        System.out.println(path.getRoot());
    }
}

