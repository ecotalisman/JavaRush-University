package ua.javarush.task.jdk13.task20.task2011;

import java.util.List;

public class Shop {
    public Goods goods;
    public int count;
    public double profit;
    public List<String> secretData;
    public static class Goods {
        public List<String> names;
    }
}
