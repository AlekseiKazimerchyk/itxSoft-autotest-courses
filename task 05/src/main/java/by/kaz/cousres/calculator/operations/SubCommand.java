package by.kaz.cousres.calculator.operations;

public class SubCommand implements Command {

    public double execute(double... operand) {
        return operand[0] - operand[1];
    }
}
