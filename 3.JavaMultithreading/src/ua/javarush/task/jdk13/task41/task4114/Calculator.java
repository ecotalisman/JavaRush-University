package ua.javarush.task.jdk13.task41.task4114;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Calculator {
    private final Map<String, Operation> operationMap = new HashMap<>();

    public Calculator() {
        Processor processor = new Processor();
        operationMap.put("+", processor::plus);
        operationMap.put("-", processor::minus);
        operationMap.put("*", processor::multiply);
        operationMap.put("/", processor::divide);
    }

    public void calculate(int operand1, String operation, int operand2) {
        Operation op = operationMap.get(operation);
        if (op != null) {
            op.execute(operand1, operand2);
        } else {
            throw new IllegalStateException(String.format("no operation registered for '%s'", operation));
        }
    }
}
