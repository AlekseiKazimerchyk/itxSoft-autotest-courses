package by.kaz.cousres.calculator;

import java.util.Scanner;

public class StartPoint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        double operand = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double operand2 = scanner.nextDouble();

        calculator.computed(operand, operand2, operator);
    }
}
