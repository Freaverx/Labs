package LR3;

import java.util.Scanner;

public class example4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        for (int current = num1; current <= num2; current++) {
            System.out.printf("%d ", current);

        }

    }
}
