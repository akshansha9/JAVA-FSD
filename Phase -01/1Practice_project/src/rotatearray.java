public class rotatearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int steps = 5;

        System.out.println("Original Array:");
        printArray(arr);

        rightRotate(arr, steps);

        System.out.println("\nArray after right rotation by " + steps + " steps:");
        printArray(arr);
    }

    // Method to right rotate an array by 'steps' steps
    public static void rightRotate(int[] arr, int steps) {
        int length = arr.length;
        steps %= length; // Handle cases where steps > length

        // Reverse the entire array
        reverseArray(arr, 0, length - 1);

        // Reverse the first 'steps' elements
        reverseArray(arr, 0, steps - 1);

        // Reverse the remaining elements
        reverseArray(arr, steps, length - 1);
    }

    // Method to reverse a portion of an array
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
