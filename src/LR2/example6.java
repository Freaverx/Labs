package LR2;

import java.util.Scanner;

public class example6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        int thousands = 0;
        while (number != 0) {
            thousands += number % 10;
            number /= 10;
        }
        System.out.printf("Количество тысяч в числе: %d", thousands);
    }

}
