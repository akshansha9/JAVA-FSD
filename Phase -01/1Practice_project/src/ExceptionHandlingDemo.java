import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers for division:");
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        try {
            // Attempt to perform division
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catch and handle the ArithmeticException
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Optional "finally" block, useful for cleanup code
            sc.close();
        }

        System.out.println("Program continues after exception handling.");
    }

    // Method to perform division and throw an exception if denominator is zero
    public static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            // Throw an ArithmeticException when attempting to divide by zero
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
