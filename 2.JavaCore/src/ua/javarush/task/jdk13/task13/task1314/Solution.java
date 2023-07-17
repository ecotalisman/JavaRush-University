package ua.javarush.task.jdk13.task13.task1314;

import java.util.ArrayList;
import java.util.List;

/* 
Ріпа
Давай напишемо програму за мотивами казки "Ріпа":

Реалізуй інтерфейс RepkaItem у класі Person.
У класі Person реалізуй метод pull(Person person), який виводить фразу на кшталт '<name> за <person>'.
Пример:
Баба за Діда
Дід за Ріпу

Виправ логічну помилку циклу в методі tell класу RepkaStory.
Виконай метод main та насолоджуйся казкою!

Requirements:
1. Інтерфейс RepkaItem потрібно реалізувати в класі Person.
2. У класі Person потрібно реалізувати метод pull() з одним параметром типу Person.
3. Метод pull у класі Person має виводити на екран фразу типу '<name> за <person>'. Наприклад: Баба за Діда.
4. У результаті виконання методу main() на екран має виводитися короткий варіант казки про Ріпу.
*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Ріпка", "Ріпку"));
        plot.add(new Person("Дід", "Діда"));
        plot.add(new Person("Баба", "Бабу"));
        plot.add(new Person("Онучка", "Онучку"));
        RepkaStory.tell(plot);
    }
}


/*

Добре, почнемо з початку. Ми маємо список items, в якому зберігаються наступні об'єкти:

0: Person{name='Ріпка', namePadezh='Ріпку'}
1: Person{name='Дід', namePadezh='Діда'}
2: Person{name='Баба', namePadezh='Бабу'}
3: Person{name='Онучка', namePadezh='Онучку'}

для виконання RepkaStory.java в методі tell в циклі записуємо - second.pull(first):

В методі tell ітерація починається з кінця списку, тому i починається з 3.

Перша ітерація (i=3):
first = items.get(i - 1), тому first вказує на об'єкт Person{name='Баба', namePadezh='Бабу'}
second = items.get(i), тому second вказує на об'єкт Person{name='Онучка', namePadezh='Онучку'}

Викликається second.pull(first), тому виводиться Онучка за Бабу.

Друга ітерація (i=2):
first = items.get(i - 1), тому first вказує на об'єкт Person{name='Дід', namePadezh='Діда'}
second = items.get(i), тому second вказує на об'єкт Person{name='Баба', namePadezh='Бабу'}

Викликається second.pull(first), тому виводиться Баба за Діда.

Третя ітерація (i=1):
first = items.get(i - 1), тому first вказує на об'єкт Person{name='Ріпка', namePadezh='Ріпку'}
second = items.get(i), тому second вказує на об'єкт Person{name='Дід', namePadezh='Діда'}

Викликається second.pull(first), тому виводиться Дід за Ріпку.

Після цього i стає 0, тому цикл припиняється, оскільки умова циклу i > 0 вже не виконується.

Console print:

Онучка за Бабу
Баба за Діда
Дід за Ріпку

*/