package ua.javarush.task.jdk13.task28.task2805;

import java.util.concurrent.Callable;

public class CalculateFactorial implements Callable<Long> {

    // Add code here:
    private Long number;

    public CalculateFactorial(Long number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        long result = 1L;
        while (number > 1) {
            result *= number;
            number--;
        }
        return result;
    }

    // It was a condition:
//    public static Long calculate(Long number) {
//        long result = 1L;
//        while (number > 1) {
//            result *= number;
//            number--;
//        }
//        return result;
//    }

}
