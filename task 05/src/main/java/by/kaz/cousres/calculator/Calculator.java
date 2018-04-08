package by.kaz.cousres.calculator;

import by.kaz.cousres.calculator.operations.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<Character, Command> operationsMap = new HashMap();

    public Calculator() {
        operationsMap.put('+', new AddCommand());
        operationsMap.put('-', new SubCommand());
        operationsMap.put('*', new MulCommand());
        operationsMap.put('/', new DivCommand());
        operationsMap.put('^', new PowCommand());
        operationsMap.put('%', new ModCommand());
    }

    public double computed(double operand, double operand2, char operator) {
        Command command = operationsMap.get(operator);
        return command.execute(operand, operand2);
    }


}
