package LR1;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input lastname: ");
        String lastname = in.nextLine();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input sur_name: ");
        String sur_name = in.nextLine();

        System.out.printf("Hello %s %s %s", lastname, name, sur_name);
        in.close();
    }
}
