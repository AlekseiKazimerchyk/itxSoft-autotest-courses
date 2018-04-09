package by.kaz.cousres.calculator.operations;

public class DivCommand implements Command {

    public double execute(double... operand) throws ArithmeticException {
        if (operand[1] == 0) {
            throw new ArithmeticException("Divide by zero");
        } else {
            return operand[0] / operand[1];
        }

    }
}
