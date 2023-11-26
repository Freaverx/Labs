package LR1;

import java.util.Scanner;

public class example14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int num1;
        int num2;
        System.out.println("Input number: ");
        int number = in.nextInt();
        num = number - 1;
        num1 = number + 1;
        num2 = (num*num)+(number*number)+(num1*num1)+2*num*number+2*num*num1+2*number+num1;

        System.out.println("num = " + num);
        System.out.printf("number - %d ", number);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
