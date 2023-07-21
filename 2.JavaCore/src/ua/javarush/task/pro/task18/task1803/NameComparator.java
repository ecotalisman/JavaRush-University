package ua.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
У класі Solution є статичне поле mentors, яке заповнюється менторами JavaRush (об'єктами типу JavaRushMentor) в
методі main().
Ментор (клас JavaRushMentor) має ім'я (поле name). У програмі потрібно відсортувати менторів за довжиною імені
в порядку зростання (від найкоротшого до найдовшого).

Щоб відсортувати всіх менторів у списку mentors використовується метод
Collections.sort(ArrayList<JavaRushMentor>, Comparator<JavaRushMentor>), в який передається список
менторів mentors і компаратор сортування.

Твоє завдання — реалізувати цей компаратор. Для цього в класі NameComparator слід імплементувати
інтерфейс Comparator<JavaRushMentor> і реалізувати метод int compare(JavaRushMentor mentor1, JavaRushMentor mentor2),
який повертає числове значення згідно з такими умовами:

від'ємне число, якщо довжина імені ментора mentor1 менша за довжину імені ментора mentor2;
додатне число, якщо довжина імені ментора mentor1 перевищує довжину імені ментора mentor2;
0, якщо довжина імен менторів mentor1 і mentor2 однакова.
Метод main() під час тестування не перевіряється.

Requirements:
1. У класі NameComparator потрібно реалізувати інтерфейс Comparator<JavaRushMentor>.
2. У класі NameComparator потрібно створити публічний метод int compare(JavaRushMentor, JavaRushMentor).
3. Метод compare(JavaRushMentor, JavaRushMentor) потрібно реалізувати згідно з умовою.
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    //напишіть тут ваш код
    @Override
    public int compare(JavaRushMentor o1, JavaRushMentor o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
