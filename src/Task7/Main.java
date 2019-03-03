package Task7;

import java.util.InputMismatchException;
import java.util.Scanner;

//Задание №7
//Добавить обработку исключений в задание с ООП калькуляторам (например, исключение может возникнуть при делении на ноль)
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

        try {
            Calculator calculator = new Calculator();
            double result = calculator.findResult(firstNumber, secondNumber, operation);
            System.out.printf("Result is: %.4f", result);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
