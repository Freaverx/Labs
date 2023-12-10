package LR3;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += calculateSum(i);
        }
        System.out.println("Сумма чисел: " + sum);
    }

    private static int calculateSum(int number){
        if(number % 5 == 2 || number % 3 == 1)
            return number;
        else
            return 0;
    }
}
