package ua.javarush.task.jdk13.task20.task2007;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

/* 
Серіалізація в JSON
НЕОБХІДНО: підключені бібліотеки jackson-databind та jackson-annotations версії 2.13.1.

Розстав JSON анотації таким чином, щоб результат роботи методу main був таким:

{
"wildAnimal" : "Murka",
"over" : 3
}

Requirements:
1. Поле name класу Cat потрібно позначити правильною анотацією.
2. Поле age класу Cat потрібно позначити правильною анотацією.
3. Поле weight класу Cat потрібно позначити правильною анотацією.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 3;

        System.out.println(convertToJSON(cat));
    }

    public static String convertToJSON(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper.writeValueAsString(object);
    }

    public static class Cat {
        @JsonProperty("wildAnimal")
        public String name;
        @JsonIgnore
        public int age;
        @JsonProperty("over")
        public int weight;

        Cat() {
        }
    }
}
