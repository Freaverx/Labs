package LR1;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day: ");
        String day = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input date: ");
        int date = in.nextInt();

        System.out.printf("Day: %s Month: %s Date: %s", day, month, date);
        in.close();
    }
}
