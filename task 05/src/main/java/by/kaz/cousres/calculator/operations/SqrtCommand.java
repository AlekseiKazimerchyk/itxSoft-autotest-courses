package by.kaz.cousres.calculator.operations;

public class SqrtCommand implements Command {

    public double execute(double... operand) {
        return Math.sqrt(operand[0]);
    }
}
