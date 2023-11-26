package LR1;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input days: ");
        int days = in.nextInt();

        System.out.printf("Month: %s, Days: %s", month, days);
        in.close();
    }
}
