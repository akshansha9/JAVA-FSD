public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index where the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int key = 30;
        int result = linearSearch(arr, key);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
