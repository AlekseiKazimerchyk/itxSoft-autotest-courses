package by.kaz.cousres.calculator;

import java.util.Scanner;

public class StartPoint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Invoker invoker = new Invoker();

        double operand = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double operand2 = scanner.nextDouble();

        invoker.compute(operand, operand2, operator);
        System.out.println(invoker.getResult());
    }
}
