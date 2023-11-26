package LR1;

import java.util.Scanner;

public class example13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input num1: ");
        int num1 = in.nextInt();

        int num;
        System.out.println("Input num2: ");
        int num2 = in.nextInt();
        num = num1 + num2;

        System.out.println("sum = " + num);
    }
}
