package Task5;

public class Calculator {

    private double firstNumber;
    private double secondNmuber;
    private String operation;

    public Calculator(double firstNumber, double secondNmuber, String operation) {
        this.firstNumber = firstNumber;
        this.secondNmuber = secondNmuber;
        this.operation = operation;
    }

    public double calculateNumbers() {
        double result = 0;
        switch (operation) {
            case ("+"):
                result = sum();
                break;
            case ("-"):
                result = subtract();
                break;
            case ("*"):
                result = multiply();
                break;
            case ("/"):
                result = divide();
                break;
        }
        return result;
    }

    private double sum() {
        return firstNumber + secondNmuber;
    }

    private double subtract() {
        return firstNumber - secondNmuber;
    }

    private double multiply() {
        return firstNumber * secondNmuber;
    }

    private double divide() {
        return firstNumber / secondNmuber;
    }
}
