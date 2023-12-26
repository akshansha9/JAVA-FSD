import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input of elements in the array
        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input for the number of elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the range [L, R]
        System.out.print("Enter the left range (L): ");
        int L = sc.nextInt();

        System.out.print("Enter the right range (R): ");
        int R = sc.nextInt();

        if (L < 0 || R >= n || L > R) {
            System.out.println("Invalid input for the range.");
            sc.close();
            return;
        }

        // Calculate the sum of elements in the range [L, R]
        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }

        // Display the sum
        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);

        sc.close();
    }
}
