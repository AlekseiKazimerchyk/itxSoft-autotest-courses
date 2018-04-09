package by.kaz.cousres.calculator.operations;

public class Log10Command implements Command {
    public double execute(double... operand) {
        return Math.log10(operand[0]);
    }
}
