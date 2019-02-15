import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Select operation: '+', '-', '*' or '/'");
        String operation = scanner.next();
        scanner.close();

        double result = calculateNumbers(firstNumber, secondNumber, operation);
        System.out.printf("Result is: %.4f", result);
    }

    /**
     * Calculates the result of operation with two numbers
     *
     * @author Denis Nikonorov
     * @param firstNumber value of first number
     * @param secondNumber  value of second number
     * @param operation operation with two numbers
     * @return  result of operation
     */
    private static double calculateNumbers(double firstNumber, double secondNumber, String operation) {
        double result = 0;
        switch (operation) {
            case ("+"):
                result = firstNumber + secondNumber;
                break;
            case ("-"):
                result = firstNumber - secondNumber;
                break;
            case ("*"):
                result = firstNumber * secondNumber;
                break;
            case ("/"):
                result = firstNumber / secondNumber;
                break;
        }
        return result;
    }
}
