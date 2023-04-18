package ua.javarush.task.pro.task09.task0911;

/* 
Привітання
Ініціалізуй статичні змінні такими значеннями:

partyFace — "\uD83E\uDD73"
balloon — "\uD83C\uDF88"
gift — "\uD83C\uDF81"
partyPopper — "\uD83C\uDF89"
cake — "\uD83C\uDF82"
Щоб переглянути привітання, запусти метод main().


Requirements:
1. Змінна partyFace під час оголошення має бути ініціалізована значенням "\uD83E\uDD73".
2. Змінна balloon під час оголошення має бути ініціалізована значенням "\uD83C\uDF88".
3. Змінна gift під час оголошення має бути ініціалізована значенням "\uD83C\uDF81".
4. Змінна partyPopper під час оголошення має бути ініціалізована значенням "\uD83C\uDF89".
5. Змінна cake під час оголошення має бути ініціалізована значенням "\uD83C\uDF82".
*/

public class Solution {
    public static String partyFace = "\uD83E\uDD73";
    public static String balloon = "\uD83C\uDF88";
    public static String gift = "\uD83C\uDF81";
    public static String partyPopper = "\uD83C\uDF89";
    public static String cake = "\uD83C\uDF82";

    public static void main(String[] args) {
        printCongratulation();
    }

    public static void printCongratulation() {
        String happyBirthday = "З днем народження!";
        String congratulation = partyFace + balloon + partyPopper + cake + gift;
        System.out.println(happyBirthday + congratulation);
    }
}
