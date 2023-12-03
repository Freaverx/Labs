package LR2;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if ((number % 5 == 2) && (number % 7 == 1)) {
            System.out.println(number + " удовлетворяет критериям.");
        } else {
            System.out.println(number + " не удовлетворяет критериям.");
        }
    }

}
