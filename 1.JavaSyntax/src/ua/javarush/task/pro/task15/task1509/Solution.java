package ua.javarush.task.pro.task15.task1509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/* 
Ще раз читаємо з консолі
Програма зчитує з консолі рядок і виводить перелік літер, з яких складається введений рядок.
Не змінюючи функцій програми, перепиши код із використанням Scanner для читання з консолі.

Requirements:
1. Програма має зчитати з консолі рядок і вивести на екран перелік літер, з яких складається введений рядок.
2. Для читання з консолі в програмі слід використати Scanner замість BufferedReader.
*/

public class Solution {
    public static void main(String[] args) {

        // It was a condition:
//        try (InputStream stream = System.in;
//             InputStreamReader reader = new InputStreamReader(stream);
//             BufferedReader buff = new BufferedReader(reader)) {
//        String line = buff.readLine();
//        char[] chars = line.toCharArray();
//        Set<Character> characters = new HashSet<>();
//        for (char aChar : chars) {
//            if (Character.isAlphabetic(aChar)) {
//                characters.add(Character.toLowerCase(aChar));
//            }
//        }
//        System.out.println(characters);
//    } catch (IOException e) {
//        System.out.println("Something went wrong : " + e);
//    }

        // Change a code:
        try (InputStream stream = System.in;
             Scanner console = new Scanner(stream)) {
            String line = console.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

