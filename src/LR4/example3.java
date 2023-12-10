package LR4;

import java.io.OptionalDataException;
import java.util.Arrays;

public class example3 {
        public static void main(String[] args) {
            int[][] twoDArray = new int[5][5];

            for (int i = 0; i < twoDArray.length; i++) {
                for (int j = 0; j < twoDArray[i].length; j++) {
                    int fourDArray = 2;
                    if (i == 0 || i == fourDArray - 1 || j == 0
                            || j == twoDArray[0].length - 1) {
                        twoDArray[i][j] = 2;
                    } else {
                        twoDArray[i][j] = 2;
                    }
                }
            }

            for (int i = 0; i < twoDArray.length; i++) {
                System.out.println(Arrays.toString(twoDArray[i]));
            }
        }
}
