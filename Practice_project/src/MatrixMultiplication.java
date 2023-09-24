import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of the first matrix (A)
        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = sc.nextInt();

        // Input dimensions of the second matrix (B)
        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = sc.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Columns of A must equal rows of B.");
            sc.close();
            return;
        }

        // Create matrices A and B
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];

        // Input elements of matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input elements of matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices A and B
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Display the result matrix
        System.out.println("Resultant Matrix (A x B):");
        displayMatrix(resultMatrix);

        sc.close();
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
