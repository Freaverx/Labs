package LR3;

import java.util.Scanner;

public class example3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;
        System.out.println("Последовательность чисел Фибоначчи до " + n + ":");

        while (n-- > 0) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
