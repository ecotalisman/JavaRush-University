package ua.javarush.task.pro.task16.task1615;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

/* 
Ой, як багато методів!
У класі Solution реалізуй шість методів: - у методі plusMinutes потрібно збільшити параметр instant на minutes хвилин
і повернути результат; - у методі plusHours потрібно збільшити параметр instant на hours годин і повернути результат;
- у методі plusDays потрібно збільшити параметр instant на days днів і повернути результат; - у методі minusMinutes
потрібно зменшити параметр instant на minutes хвилин і повернути результат; - у методі minusHours потрібно зменшити
параметр instant на hours годин і повернути результат; - у методі minusDays потрібно зменшити параметр instant на
days днів і повернути результат.

Requirements:
1. Метод plusMinutes потрібно реалізувати згідно з умовою.
2. Метод plusHours потрібно реалізувати згідно з умовою.
3. Метод plusDays потрібно реалізувати згідно з умовою.
4. Метод minusMinutes потрібно реалізувати згідно з умовою.
5. Метод minusHours потрібно реалізувати згідно з умовою.
6. Метод minusDays потрібно реалізувати згідно з умовою.
*/

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        //напишіть тут ваш код
        return instant.plus(Duration.ofMinutes(minutes));
    }

    static public Instant plusHours(Instant instant, long hours) {
        //напишіть тут ваш код
        return instant.plus(Duration.ofHours(hours));
    }

    static public Instant plusDays(Instant instant, long days) {
        //напишіть тут ваш код
        return instant.plus(Duration.ofDays(days));
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        //напишіть тут ваш код
        return instant.minus(Duration.ofMinutes(minutes));
    }

    static public Instant minusHours(Instant instant, long hours) {
        //напишіть тут ваш код
        return instant.minus(Duration.ofHours(hours));
    }

    static public Instant minusDays(Instant instant, long days) {
        //напишіть тут ваш код
        return instant.minus(Duration.ofDays(days));
    }
}


/*

Клас java.time.Duration в Java 8 використовується для представлення тривалості часу між двома моментами у часі в рамках
днів, годин, хвилин і секунд. Він може бути використаний для вимірювання тривалості, для додавання та вирахування часу,
і для роботи з декількома іншими операціями, пов'язаними з часом.

Ось деякі приклади:

// вимірюємо тривалість між двома моментами у часі
Instant start = Instant.now();
// Ваш код тут
Instant end = Instant.now();
Duration duration = Duration.between(start, end);
System.out.println("Duration: " + duration.getSeconds());

// додаємо 5 днів до даного моменту у часі
Instant now = Instant.now();
Instant afterFiveDays = now.plus(Duration.ofDays(5));
System.out.println("After five days: " + afterFiveDays);

// вираховуємо 3 години з даного моменту у часі
Instant now = Instant.now();
Instant minusThreeHours = now.minus(Duration.ofHours(3));
System.out.println("Three hours ago: " + minusThreeHours);

Клас Duration дуже корисний, коли потрібно працювати з часовими інтервалами, додавати або вираховувати час або
вимірювати тривалість виконання деяких операцій.

*/