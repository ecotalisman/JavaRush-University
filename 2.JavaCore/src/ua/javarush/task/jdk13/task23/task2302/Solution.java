package ua.javarush.task.jdk13.task23.task2302;

/* 
Як обрати потрібне?
У методі main присвой об'єкту Object obj екземпляр класу TEST.
Не змінюй нічого, окрім методу main.

Requirements:
1. У класі Solution має бути поле TEST.
2. У класі Solution має бути клас TEST.
3. У класі Solution має існувати поле obj.
4. У методі main в поле obj потрібно зберегти об'єкт типу TEST(екземпляр класу TEST).
*/

public class Solution {
    public static final String TEST = "test";
    static Object obj;

    public static void main(String[] args) {
        // It was a condition:
//        obj = Solution.TEST;
//        System.out.println(obj);

        // Change code here:
        obj = new TEST();
        System.out.println(obj);
    }

    public static class TEST {
        @Override
        public String toString() {
            return "test class";
        }
    }
}
