package ua.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортування за віком
У класі Solution є статичне поле students, яке заповнюється студентами (об'єктами типу Student) у методі main().
Студент (клас Student) має ім'я (поле name) і вік (поле age). У програмі потрібно відсортувати студентів за віком у
порядку спадання (від найстаршого до наймолодшого).
Для цього використовується метод Collections.sort(ArrayList<Student>, Comparator<Student>), в який передається список
студентів students і компаратор сортування за спаданням значень віку.

Твоє завдання — реалізувати цей компаратор. Для цього в класі AgeComparator слід імплементувати інтерфейс
Comparator<Student> і реалізувати метод int compare(Student student1, Student student2), який повертає числове значення
згідно з такими умовами:

від'ємне число, якщо вік студента student1 перевищує вік студента student2;
додатне число, якщо вік студента student1 менший за вік студента student2;
0, якщо вік студентів student1 і student2 однаковий.
Метод main() під час тестування не перевіряється.

Requirements:
1. У класі AgeComparator потрібно реалізувати інтерфейс Comparator<Student>.
2. У класі AgeComparator потрібно створити публічний метод int compare(Student, Student).
3. Метод compare(Student, Student) потрібно реалізувати згідно з умовою.
*/

public class AgeComparator implements Comparator<Student> {

    //напишіть тут ваш код
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    }

}
