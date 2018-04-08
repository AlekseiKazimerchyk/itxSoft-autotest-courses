package by.kaz.cousres.calculator.operations;

public class PowCommand implements Command {
    public double execute(double operand, double operand2) {
        return Math.pow(operand, operand2);
    }
}
