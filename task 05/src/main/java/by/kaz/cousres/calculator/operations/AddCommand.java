package by.kaz.cousres.calculator.operations;

public class AddCommand implements Command {

    public double execute(double... operand) {
        return operand[0] + operand[1];
    }
}
