package ua.javarush.task.pro.task09.task0903;

/* 
Рядкові літерали
У класі Solution оголошено та ініціалізовано публічне рядкове поле. Однак рядок задовгий, і його незручно читати.
Для зручнішого читання його потрібно розділити на 5 підрядків, з'єднавши їх оператором "+" (конкатенація рядків) таким чином:

перший рядок: "Завжди пишіть код так, "
другий рядок: "ніби його буде супроводжувати "
третій рядок: "схильний до насильства психопат, "
четвертий рядок: "який знає вашу адресу. "
п'ятий рядок: "Martin Golding"

Requirements:
1. Змінити поле text згідно з умовою.
*/

public class Solution {
    public String text = "Завжди пишіть код так, " +
            "ніби його буде супроводжувати " +
            "схильний до насильства психопат, " +
            "який знає вашу адресу. " +
            "Martin Golding";
}