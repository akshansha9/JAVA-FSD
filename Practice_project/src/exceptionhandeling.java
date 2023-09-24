class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class exceptionhandeling {
    public static void main(String[] args) throws CustomException {
        try {
            // Example of throwing a custom exception
            int result = divideNumbers(10, 0);
            System.out.println("Result of division: " + result);
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            // Example of throwing a built-in exception (ArithmeticException)
            int result = divideNumbers(20, 5);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int divideNumbers(int numerator, int denominator) throws CustomException {
        try {
            if (denominator == 0) {
                // Throw a built-in exception (ArithmeticException)
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return numerator / denominator;
        } catch (ArithmeticException e) {
            // Re-throw a custom exception with a different message
            throw new CustomException("Custom Exception: " + e.getMessage());
        }
    }
}
