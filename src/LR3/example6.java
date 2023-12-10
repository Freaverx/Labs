package LR3;

import java.util.Arrays;
import java.util.Scanner;

public class example6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массимва: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.err.println("Неверный ввод! Пожалуйста введите положительное число.");
        } else {
            int[] arr = new int[n]; //
            for (int i = 0; i < n; i++) {
                arr[i] = i * 5 + 2;
            }
            System.out.println("Массив: " + Arrays.toString(arr));
        }
    }
}