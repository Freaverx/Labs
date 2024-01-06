package LR6;

public class example10 {
    public static void main (String[] args){
        System.out.println (getMaxMin (10, -5, 7));
    }

    public static int[] getMaxMin(int... args){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int a : args) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }

        return new int[]{max, min};
    }
}
