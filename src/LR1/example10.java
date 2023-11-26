package LR1;

import java.util.Scanner;

public class example10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 2023;
        System.out.println("Input year: ");
        int year = in.nextInt();
        num = num - year;

        System.out.println("age: " + num);
    }
}
