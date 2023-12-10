package LR3;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.printf("Числа в возрастающем порядке от %d до %d :", num1, num2);

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int current = num1;

        while (current <= num2) {
            System.out.printf("%d ", current);
            current++;
        }
    }
}
