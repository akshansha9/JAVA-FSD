import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 1, 15, 8, 6, 3 ,12 };
        
        int fourthSmallest = findFourthSmallest(arr);
        
        if (fourthSmallest != Integer.MAX_VALUE) {
            System.out.println("The fourth smallest element is: " + fourthSmallest);
        } else {
            System.out.println("There are not enough elements in the array to find the fourth smallest.");
        }
    }

    public static int findFourthSmallest(int[] arr) {
        int n = arr.length;
        
        // Checking elements in the array
        if (n < 4) {
            return Integer.MAX_VALUE; // Not enough elements to find the fourth smallest
        }
        
        // Sorting in ascending order
        Arrays.sort(arr);
        
        // The fourth smallest element is at index 3 
        return arr[3];
    }
}
