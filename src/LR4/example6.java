package LR4;

import java.util.*;
public class example6 {
    public static void main(String args[]) {
        int rows = 5;
        int cols = 10;

        int[][] matrix = createMatrix(rows, cols);

        System.out.print("Original matrix:");
        displayMatrix(matrix);

        removeRowAndColumn(matrix, rows, cols);

        System.out.print("\nModified matrix:");
        displayMatrix(matrix);
    }

    private static int[][] createMatrix(int rows, int cols) {
        Random random = new Random();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt();
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%3d", num);
            }
            System.out.println("");
        }
    }

    private static void removeRowAndColumn(int[][] matrix, int rows, int cols) {

        int randomRowIndex = new Random().nextInt(rows);
        int randomColumnIndex = new Random().nextInt(cols);


        matrix[randomRowIndex] = new int[cols - 1];
        System.arraycopy(matrix[0], 0, matrix[randomRowIndex], 0, randomRowIndex);
        System.arraycopy
                (matrix[randomRowIndex + 1], 0, matrix[randomRowIndex], randomColumnIndex
                        + 1, rows - randomRowIndex - 1
                );

    }
}
