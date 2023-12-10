package LR4;

import java.util.*;
import java.lang.*;
import java.io.*;
public class example5 {
    public static void main (String[] args) throws java.lang.Exception {
        // Создаем двумерный массив размером 3x5
        int[][] matrix = new int[3][5];

        // Заполняем массив случайными числами
        Random randomGenerator = new Random();
        for (int i=0; i<matrix.length; i++)
            for (int j=0; j<matrix[0].length; j++)
                matrix[i][j]=randomGenerator.nextInt(100);

        System.out.print("Исходный массив: ");
        printMatrix(matrix);

        transpose(matrix); // Меняем строки и столбцы местами

        System.out.print("Транспонированный массив: ");
        printMatrix(matrix);
    }
    public static int[][] transpose (int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int [cols][rows];

        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                transposedMatrix [col][row]=matrix[row][col]; // меняем строки и столбцы
            }
        }
        return transposedMatrix; // возвращаем транспонированный массив

    }

    public static void printMatrix (int [][] matrix) {
        for (int [] row : matrix){
            for (int number : row){
                System.out.print (number + " "); // выводим числа из массива
            }
            System.out.println (); // переходим на новую строку
        }
    }
}
