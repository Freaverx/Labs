package LR2;

import java.util.Scanner;

public class example4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Введите число: ");

        int n=sc.nextInt();

        if(n%4==0 && n>=10){

            System.out.println("Число удовлетворяет условиям.");

        }else{

            System.out.println("Число не удовлетворяет условиям.");

        }

    }

}
