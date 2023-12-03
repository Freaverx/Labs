package LR2;

import java.util.Scanner;

public class example5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int number = scanner.nextInt();

        if (number >= 5 && number <= 10) {

            System.out.println("Число попадает в указанный диапазон.");

        } else {

            System.out.println("Число не попадает в указанный диапазон.");

        }

    }

}
