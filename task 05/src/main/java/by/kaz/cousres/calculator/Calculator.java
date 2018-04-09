package by.kaz.cousres.calculator;

import by.kaz.cousres.calculator.operations.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<String, Command> operationsMap = new HashMap();

    public Calculator() {
        operationsMap.put("+", new AddCommand());
        operationsMap.put("-", new SubCommand());
        operationsMap.put("*", new MulCommand());
        operationsMap.put("/", new DivCommand());
        operationsMap.put("^", new PowCommand());
        operationsMap.put("%", new ModCommand());
        operationsMap.put("log", new LogCommand());
        operationsMap.put("log10", new Log10Command());
        operationsMap.put("sqrt", new SqrtCommand());
        operationsMap.put("sqrtn", new SqrtNCommand());
    }

    public double computed(String operator, double... operand) {
        Command command = operationsMap.get(operator);
        return command.execute(operand);
    }


}
