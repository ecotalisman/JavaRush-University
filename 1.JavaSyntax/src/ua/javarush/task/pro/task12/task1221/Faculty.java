package ua.javarush.task.pro.task12.task1221;

import java.util.ArrayList;

/* 
Узагальнення і студенти
У класі Faculty є метод printStudentNames(ArrayList), який отримує список об'єктів і виводить їхні імена. Однак наразі
програма не компілюється.
Твоє завдання — виправити цей баг. Для цього потрібно виправити сигнатуру методу printStudentNames(ArrayList) так, щоб
він отримував список об'єктів лише типу Student(використовуй узагальнення).
Метод main у перевірці не використовується.


Requirements:
1. Виправ сигнатуру методу printStudentNames так, щоб він отримував список лише студентів.
2. Реалізацію методу printStudentNames не змінювати.
*/

public class Faculty {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Акакій"));
        students.add(new Student("Любослав"));

        printStudentNames(students);
    }

    // It was a condition:
//    public static void printStudentNames(ArrayList students) {

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}


/*

метод printStudentNames(ArrayList students) приймав список без вказівки типу елементів, які він містить. Це означає,
що список міг містити об'єкти будь-якого типу, і компілятор не міг гарантувати, що він буде працювати з об'єктами класу Student.

Коли ви використовуєте список без узагальнень, компілятор не знає, який саме тип даних буде зберігатися в цьому списку.
В результаті, ви можете отримати ClassCastException у випадку, якщо елемент списку не є типом Student.

У попередньому варіанті, коли ми намагалися отримати ім'я студента, ми викликали метод getName() на об'єкті, який
береться зі списку:

System.out.println(students.get(i).getName());

Оскільки список міг містити об'єкти будь-якого типу, компілятор не міг бути впевнений, що students.get(i) належить
до класу Student і має метод getName(). Тому компіляція не вдалась.

Щоб виправити сигнатуру методу printStudentNames(ArrayList) так, щоб він приймав список лише з об'єктами типу Student,
потрібно використати узагальнення (Generics). Змінити сигнатуру методу, використовуючи параметризований тип ArrayList<Student>

Тепер метод printStudentNames приймає список, який містить лише об'єкти типу Student. Це гарантує, що всі елементи
списку належать до класу Student, і програма компілюється правильно.

*/