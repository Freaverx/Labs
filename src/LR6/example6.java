package LR6;

import java.util.Arrays;

public class example6 {
    public static int[] takeFirstElements(int[] array, int n) {
        if(n > array.length)
            return Arrays.copyOf(array, array.length);
        else
            return Arrays.copyOfRange(array, 0, n);
    }

    public static void main(String[] args) {
        int[] originalArray = {0, 1, 2 ,3 ,4};
        System.out.println("Original array: " + Arrays.toString(originalArray));
        takeFirstElements(originalArray, 3);

        int[] anotherArray = {-1,-2,-3,-4,-5};
        anotherArray = takeFirstElements(anotherArray, 7);
        System.out.println("Another array: " + Arrays.toString(anotherArray));

    }

}
