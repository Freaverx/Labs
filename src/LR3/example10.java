package LR3;

import java.util.Random;
import java.util.Arrays;

public class example10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt();
        Arrays.sort(arr);
        for (int num : arr)
            System.out.println(num);
    }
}
