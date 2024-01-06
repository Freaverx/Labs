package LR6;

import java.util.Arrays;
public class example7 {
    public static void main(String[] args) {
        char[] input = "Hello, World!".toCharArray();
        int[] output = getCodes(input);
        System.out.println(Arrays.toString(output));
    }

    public static int[] getCodes(char[] input) {
        int[] codes = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            codes[i] = input[i];
        }
        return codes;
    }

}
