public class ArrayDemo {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and print elements in the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Modify an element in the array
        numbers[2] = 10;

        // Access and print modified array
        System.out.println("Modified array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Calculate the sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);

        // Find the maximum element in the array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }
}
