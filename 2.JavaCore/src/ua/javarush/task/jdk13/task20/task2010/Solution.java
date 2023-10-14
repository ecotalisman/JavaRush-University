package ua.javarush.task.jdk13.task20.task2010;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/* 
Дата в JSON
За допомогою анотації JsonFormat зроби так, щоб JSON, що містить дату в форматі (dd-MM-yyyy hh:mm:ss), десеріалізувався
в об'єкт типу Event.

Requirements:
1. Поле eventDate у класі Event потрібно позначити анотацією @JsonFormat.
2. Об'єкти типу Event повинні коректно десеріалізуватися з JSON згідно з умовою завдання.
*/

public class Solution {

    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = "{\"name\":\"event#1\",\"eventDate\":\"11-02-2022 09:18:34\"}";
        Event event = new ObjectMapper().readValue(jsonString, Event.class);
        System.out.println(event);
    }
}

/**
 * Анотація @JsonFormat має кілька параметрів для детального настроювання форматування. Ось деталі про кожен з параметрів:
 *
 * 1. shape:
 * Тип: JsonFormat.Shape
 * Визначає форму значення JSON. Для дат це може бути, наприклад, рядком (STRING), масивом (ARRAY) або числом (NUMBER).
 * Значення по замовчуванню — ANY, яке вказує на використання типу за замовчуванням для даного типу даних.
 *
 * 2. pattern:
 * Тип: String
 * Визначає шаблон для форматування дат та чисел. Наприклад, для дати це може бути "yyyy-MM-dd".
 *
 * 3. locale:
 * Тип: String
 * Визначає локаль для форматування дати, яка може впливати на порядок елементів дати, місяці, дні тижня тощо.
 * Це строкове значення, наприклад "en_US" або "uk_UA".
 *
 * 4. timezone:
 * Тип: String
 * Визначає часовий пояс, в якому дата повинна бути серіалізована чи десеріалізована. Це може бути, наприклад, "GMT" або "UTC".
 *
 * 5. lenient:
 * Тип: OptBoolean (це перелічення, яке визначає TRUE, FALSE або DEFAULT)
 * Визначає, чи повинен бути формат дати послабленим. Якщо встановлено значення FALSE, то строгі вимоги до формату дати
 * будуть застосовані під час парсингу.
 *
 * 6. with та without:
 * Тип: JsonFormat.Feature[]
 * Ці параметри дозволяють вказати функції форматування, які слід включити (with) або виключити (without). Наприклад,
 * можна використовувати JsonFormat.Feature.WRITE_DATES_WITH_ZONE_ID для того, щоб включити інформацію про часовий пояс
 * при записі дати.
 *
 * Ця анотація дуже корисна, коли вам потрібно налаштувати детальне форматування дати, числа або інших типів даних при
 * серіалізації або десеріалізації JSON.*/
