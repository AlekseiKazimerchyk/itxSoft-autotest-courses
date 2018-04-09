package by.kaz.cousres.calculator;

import java.util.Scanner;

public class StartPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        double operand = scanner.nextDouble();
        String operator = scanner.next();
        double operand2 = scanner.nextDouble();


        System.out.println(calculator.computed(operator, operand, operand2));
    }
}
