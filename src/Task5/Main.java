package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Select operation: '+', '-', '*' or '/'");
        String operation = scanner.next();
        scanner.close();

        Calculator calculator = new Calculator(firstNumber, secondNumber, operation);
        double result = calculator.calculateNumbers();
        System.out.printf("Result is: %.4f", result);
    }
}
