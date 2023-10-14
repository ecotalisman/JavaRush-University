package ua.javarush.task.jdk13.task20.task2011;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

/* 
Створення класу за рядком yaml
Віднови клас Shop за переданим рядком yaml.

Клас повинен бути в окремому файлі та містити вкладений статичний клас Goods. Для полів-колекцій використовуй List.

Метод main не бере участі в тестуванні.

Requirements:
1. Клас Shop потрібно створити в окремому файлі.
2. У класі Shop має міститися вкладений статичний клас Goods.
3. У класах Shop та Goods потрібно створити правильні поля.
4. Об'єкти типу Shop повинні коректно десеріалізуватися з yaml.
*/

public class Solution {
    public static void main(String[] args) throws JsonProcessingException {
        String yamlData =
                "---\n" +
                        "goods:\n" +
                        "  names:\n" +
                        "  - \"S1\"\n" +
                        "  - \"S2\"\n" +
                        "count: 12\n" +
                        "profit: 123.4\n" +
                        "secretData:\n" +
                        "- \"String1\"\n" +
                        "- \"String2\"\n" +
                        "- \"String3\"\n" +
                        "- \"String4\"\n" +
                        "- \"String5\"";

        ObjectMapper mapper = new YAMLMapper();
        Shop shop = mapper.readValue(yamlData, Shop.class);

        System.out.println(shop);
    }
}
