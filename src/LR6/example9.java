package LR6;

import java.util.Arrays;

public class example9 {
    public static void main(String[]args){
        char[]array={'H','e','l','l','o','W','o','r','l','d'};
        System.out.println("Initial array: "+ Arrays.toString(array));
        swapPairs(array);
        System.out.println("Swapped array: "+Arrays.toString(array));
    }
    public static void swapPairs(char[]arr){
        int len = arr.length;
        for(int i=0; i<len/2; i++){
            char temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-i-1] = temp;
        }
        System.out.println("Swapped pairs: "+Arrays.toString(arr));
    }
}
