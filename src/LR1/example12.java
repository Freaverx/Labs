package LR1;

import java.util.Scanner;

public class example12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 2023;
        System.out.println("Input age: ");
        int age = in.nextInt();
        num = num - age;

        System.out.println("Birth date: " + num);
    }
}
