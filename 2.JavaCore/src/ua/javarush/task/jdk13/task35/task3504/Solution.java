package ua.javarush.task.jdk13.task35.task3504;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* 
Простий generics
Параметризуй клас Solution, щоб він міг працювати зі всіма класами, які успадковуються від HashMap.
Метод getMap має повертати тип поля map.

Requirements:
1. Клас Solution має бути параметризовано типом, який є нащадком HashMap.
2. У класі Solution має існувати поле map.
3. У класі Solution має існувати метод getMap.
4. Метод main повинен виводити дані на екран.
*/

public class Solution <T extends HashMap> {
    private HashMap map;

    public Solution(HashMap map) {
        this.map = map;
    }

    public HashMap getMap() {
        return map;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("string", 4);
        Solution solution = new Solution(hashMap);
        HashMap mapFromSolution = solution.getMap();
        System.out.println(mapFromSolution.getClass());


        LinkedHashMap<Solution, Solution> hashMap2 = new LinkedHashMap<>();
        hashMap2.put(solution, solution);
        Solution solution2 = new Solution(hashMap2);
        LinkedHashMap mapFromSolution2 = (LinkedHashMap) solution2.getMap();   //need to cast  :(
        System.out.println(mapFromSolution2.getClass());
    }
}
