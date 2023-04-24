package ua.javarush.task.pro.task07.task0715;

/* 
Успадкування методів
Правильно успадкуй класи:

людину — від істоти;
Java-девелопера — від людини.
Видали дублікати методів.

Requirements:
1. Клас Human має успадковуватися від класу Entity.
2. Клас JavaDeveloper має успадковуватися від класу Human.
3. Методи не повинні мати дублікатів.
*/

public class Entity {
    public void move(){
        System.out.println("Я рухаюся.");
    }

    public void eat(){
        System.out.println("Я їм.");
    }
}
