package ua.javarush.task.pro.task14.task1416;

/* 
Трасування стека
У методі main перехопи виняток і виведи трасу його стека.

Requirements:
1. Метод main має викликати метод dangerousMethod.
2. Метод dangerousMethod має кидати Exception.
3. Метод main має виводити на екран трасу стека перехопленого винятку.
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
