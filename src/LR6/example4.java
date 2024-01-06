package LR6;

public class example4 {
    public static long doubleFactorial(int n) {
        long result = 1;
        while (n > 1) {
            result *= n;
            n -= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.printf("%d!! = %d%n", n, doubleFactorial(n));
        n = 5;
        System.out.printf("%d!! = %d%n", n, doubleFactorial(n));
    }

}
