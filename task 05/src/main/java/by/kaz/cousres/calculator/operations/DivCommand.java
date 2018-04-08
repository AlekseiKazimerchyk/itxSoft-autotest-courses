package by.kaz.cousres.calculator.operations;

public class DivCommand implements Command {

    public double execute(double operand, double operand2) throws ArithmeticException {
        if (operand2 == 0) {
            throw new ArithmeticException("Divide by zero");
        } else {
            return operand / operand2;
        }

    }
}
