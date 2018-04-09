package by.kaz.cousres.calculator.operations;

public class PowCommand implements Command {

    public double execute(double... operand) {
        return Math.pow(operand[0], operand[1]);
    }
}
