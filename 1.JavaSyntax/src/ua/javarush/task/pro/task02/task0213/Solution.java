package ua.javarush.task.pro.task02.task0213;

/* 
«Причешемо» резюме
Метод main виводить на екран чотири рядки. Усі вони — яскравий приклад зловживання великими літерами.
Зміни код так, щоб усі літери в цих рядках стали малими.


Requirements:
1. Не змінюй значення змінних title, degree і career.
2. Для чотирьох рядків, переданих у метод println, потрібно викликати метод toLowerCase.
3. Програма повинна виводити чотири рядки.
*/

public class Solution {

    public static void main(String[] args) {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        //напишіть тут ваш код
        System.out.println("RESUME".toLowerCase());
        System.out.println(("TITLE: " + title).toLowerCase());
        System.out.println(("DEGREE: " + degree).toLowerCase());
        System.out.println(("CAREER: " + career).toLowerCase());
    }
}
