package LR1;

import java.util.Scanner;

public class example11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        int num = 2023;
        System.out.println("Input year: ");
        int year = in.nextInt();
        num = num - year;

        System.out.printf("Name: %s ", name  );
        System.out.println("age: " + num);
    }
}
