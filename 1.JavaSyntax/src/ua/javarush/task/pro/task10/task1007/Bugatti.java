package ua.javarush.task.pro.task10.task1007;

/* 
Чи з дахом, чи без нього — от питання
Ти зробив попереднє замовлення на новеньку Bugatti рівно пів року тому. Зараз червень, саме час їздити на кабріолеті.
Але ти забув, який тип кузова вибрав під час замовлення.
Твоє завдання — додати функціональність для отримання поточної конфігурації та для її зміни в разі потреби.
Для цього створи гетери й сетери.


Requirements:
1. Клас Bugatti має містити три поля: String color, int year, String body.
2. Клас Bugatti має містити публічний гетер getBody для поля body.
3. Клас Bugatti має містити публічний сетер setBody(String) для поля body.
*/

public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    //напишіть тут ваш код

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
