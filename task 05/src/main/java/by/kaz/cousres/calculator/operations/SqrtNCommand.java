package by.kaz.cousres.calculator.operations;

public class SqrtNCommand implements Command {

    public double execute(double... operand) {
        return Math.pow(operand[0], 1 / operand[1]);
    }
}
