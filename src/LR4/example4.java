package LR4;

import java.util.*;

public class example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту треугольника (целое число): ");
        int h = sc.nextInt();

        for (int i = h; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= h - i; k++) {
                System.out.print("△");
            }

            System.out.println(" ");
        }
    }

}
