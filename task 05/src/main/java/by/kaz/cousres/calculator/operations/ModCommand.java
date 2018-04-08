package by.kaz.cousres.calculator.operations;

public class ModCommand implements Command {

    public double execute(double operand, double operand2) {
        return operand % operand2;
    }
}
