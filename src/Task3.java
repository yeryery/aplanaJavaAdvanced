import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input '1' to calculate numbers or '2' to search max in array");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("--------Calculate numbers-----------");
            System.out.println("Enter the first number:");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double secondNumber = scanner.nextDouble();
            System.out.println("Select operation: '+', '-', '*' or '/'");
            String operation = scanner.next();
            scanner.close();

            double result = calculateNumbers(firstNumber, secondNumber, operation);
            System.out.printf("Result is: %.4f", result);
        } else {
            System.out.println("--------Find max in array-----------");
            System.out.println("Input length of your array");
            int arrayLength = scanner.nextInt();
            String[] array = new String[arrayLength];

            for (int i = 0; i < arrayLength; i++) {
                System.out.println("Input word for array");
                array[i] = scanner.next();
            }

            String longestWord = findLongestWord(array);
            System.out.println("The longest word in array is " + longestWord);
        }
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

    /**Finds the longest word in an array
     *
     * @author Denis Nikonorov
     * @param array array with string elements
     * @return string in array with maximum length
     */
    private static String findLongestWord(String[] array) {
        int index = 0;
        int elementLength = array[0].length();
        for(int i=1; i< array.length; i++) {
            if(array[i].length() > elementLength) {
                index = i; elementLength = array[i].length();
            }
        }
        return array[index];
    }
}

