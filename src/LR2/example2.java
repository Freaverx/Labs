package LR2;

import java.util.Scanner;

public class example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scanner.nextInt();

        if (num % 3 == 0) {

            System.out.println(num + " делится на 3.");

        } else {

            System.out.println(num + " не делится 3.");

        }

    }

}