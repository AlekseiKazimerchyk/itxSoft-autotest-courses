package by.kaz.cousres.calculator;

public class CalculatorCommand implements Command {
    private char operator;
    private double operand;
    private double operand2;
    private Calculator calculator;

    public CalculatorCommand(char operator, double operand, double operand2, Calculator calculator) {
        this.operator = operator;
        this.operand = operand;
        this.operand2 = operand2;
        this.calculator = calculator;
    }

    public double execute() {
            return calculator.operation(operator, operand, operand2);
    }
}
