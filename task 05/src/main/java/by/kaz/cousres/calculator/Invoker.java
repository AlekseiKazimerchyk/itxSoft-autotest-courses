package by.kaz.cousres.calculator;

public class Invoker {
    private Calculator calculator = new Calculator();
    private double result;

    public void compute(double operand, double operand2, char operator) {
        Command command = new CalculatorCommand(operator, operand, operand2, calculator);
        result = command.execute();
    }

    public double getResult() {
        return result;
    }
}
