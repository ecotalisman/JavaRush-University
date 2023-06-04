package ua.javarush.task.pro.task14.task1412;

/* 
Групування винятків
Об'єднай блоки catch з однаковим кодом.

Requirements:
1. Кількість блоків catch має бути мінімальною.
*/

public class Solution {

    public static void main(String[] args) {
        // It was a condition:
//        try {
//            System.out.println("Програма працює від паркану");
//            Thread.sleep(1000);
//            System.out.println("до обіду");
//        } catch (NullPointerException e) {
//            System.out.println("Стався виняток на літеру N");
//        } catch (NumberFormatException e) {
//            System.out.println("Стався виняток на літеру N");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Стався виняток на літеру I");
//        } catch (IllegalStateException e) {
//            System.out.println("Стався виняток на літеру I");
//        } catch (ClassCastException e) {
//            System.out.println("Стався виняток на літеру C");
//        } catch (InterruptedException e) {
//            System.out.println("Стався виняток на літеру I");
//        }

        // Write code here:
        try {
            System.out.println("Програма працює від паркану");
            Thread.sleep(1000);
            System.out.println("до обіду");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Стався виняток на літеру N");
        } catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
            System.out.println("Стався виняток на літеру I");
        } catch (ClassCastException e) {
            System.out.println("Стався виняток на літеру C");
        }
    }
}
