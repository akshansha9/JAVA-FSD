import java.util.Arrays;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int key) {
        int n = arr.length;

        if (arr[0] == key) {
            return 0; // Key found at the first element
        }

        int i = 1;
        while (i < n && arr[i] <= key) {
            i *= 2;
        }

        int result = Arrays.binarySearch(arr, i / 2, Math.min(i, n), key);
        return result >= 0 ? result : -1; // Return the index where the key is found, or -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int key = 30;
        int result = exponentialSearch(arr, key);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
