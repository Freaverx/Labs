package LR4;

public class example7 {
    public static void main(String[] args) {
        int[][] snakeArray = createSnakeArray(5, 5);
        printArray(snakeArray);
    }

    private static int[][] createSnakeArray(int rows, int columns) {
        int[][] result = new int[rows][columns];
        fillSnakeArray(result, 0, 0, result.length - 1, result[0].length - 1);
        return result;
    }

    private static void fillSnakeArray(int[][] array, int x, int y, int endX, int endY) {
        if (x < endX && y >= 0 && y < endY) {
            array[x][y] = 1;


            fillSnakeArray(array, x + 1, y - 1, endX, endY);
            fillSnakeArray(array, x, y + 1, endX, endY);
        }
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num);
            }
            System.out.println("");
        }
    }
}
