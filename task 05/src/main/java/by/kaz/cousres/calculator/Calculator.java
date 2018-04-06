package by.kaz.cousres.calculator;

import by.kaz.cousres.calculator.operations.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    Map operationsMap = new HashMap<Character, Command>();
    Command command;

    private void initOperationsMap() {
        operationsMap.put('+', new AddCommand());
        operationsMap.put('-', new SubCommand());
        operationsMap.put('*', new MulCommand());
        operationsMap.put('/', new DivCommand());
    }

    public double computed(double operand, double operand2, char operator) {
        initOperationsMap();
        command = (Command) operationsMap.get(operator);
        return command.execute(operand, operand2);
    }


}
