package by.kaz.cousres.calculator.operations;

public class LogCommand implements Command {
    public double execute(double... operand) {
        return Math.log(operand[0]);
    }
}
