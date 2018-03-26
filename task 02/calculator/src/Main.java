import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        String operation = scn.next();
        int b = scn.nextInt();
        System.out.println(a + " " + operation + " " + b + " = " + calculate(operation, a, b));

    }


    public static int calculate(String operation, int a, int b) {

        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.out.println("Неверная операция");
                break;
        }
        return 0;
    }
}
