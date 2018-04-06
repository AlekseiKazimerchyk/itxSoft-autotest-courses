package by.kaz.cousres.calculator;

public class Calculator {

    public double operation(char operator, double operand, double operand2) {
        switch (operator) {
            case '+':
                return operand + operand2;
            case '-':
                return operand - operand2;
            case '*':
                return operand * operand2;
            case '/':
                return operand / operand2;
            default:
                return 0;
        }
    }
}
