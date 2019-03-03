package Task7;

import java.util.InputMismatchException;

public class Calculator {

    public Calculator() {
    }

    public double findResult(double firstNumber, double secondNmuber, String operation) {
        double result = 0;
        switch (operation) {
            case ("+"):
                result = sum(firstNumber, secondNmuber);
                break;
            case ("-"):
                result = subtract(firstNumber, secondNmuber);
                break;
            case ("*"):
                result = multiply(firstNumber, secondNmuber);
                break;
            case ("/"):
                result = divide(firstNumber, secondNmuber);
                break;
            default:
                throw new InputMismatchException("Please input the correct operation: '+', '-', '*' or '/'");
        }
        return result;
    }

    private double sum(double firstNumber, double secondNmuber) {
        return firstNumber + secondNmuber;
    }

    private double subtract(double firstNumber, double secondNmuber) {
        return firstNumber - secondNmuber;
    }

    private double multiply(double firstNumber, double secondNmuber) {
        return firstNumber * secondNmuber;
    }

    private double divide(double firstNumber, double secondNmuber) {
        if (secondNmuber == 0) {
            throw new ArithmeticException("Error! Division by zero!");
        }
        return firstNumber / secondNmuber;
    }
}
