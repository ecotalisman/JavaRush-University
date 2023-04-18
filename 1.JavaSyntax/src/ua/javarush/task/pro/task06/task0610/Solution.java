package ua.javarush.task.pro.task06.task0610;

/* 
Боротьба за доступ
Перед тобою програма, яка виводить інформацію про людину в консоль. На жаль, програма не компілюється.
Зміни мінімальну необхідну кількість модифікаторів доступу в класі Person, щоб код скомпілювався.


Requirements:
1. Код має компілюватися.
2. Потрібно змінити мінімальну необхідну кількість модифікаторів доступу в класі Person.
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person("Петро", "Петренко");
        System.out.println("Досьє.");
        System.out.println("Ім'я: " + person.getFirstName());
        System.out.println("Прізвище: " + person.getLastName());
        System.out.println("Повне ім'я: " + person.getFullName());
    }
}
