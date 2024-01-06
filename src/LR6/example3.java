package LR6;

import java.util.Arrays;
import java.util.stream.Stream;

public class example3 {

public static void main (String[] args){
    int[] arr = {1, 2, 3, 4, 5};

    System.out.println("Maximum: " + max(arr));
    System.out.println("Minimum: " + min(arr));
    System.out.println("Average: " + average(arr));
}
    public static int[] max(int[] arr) { return Stream.of(arr).max(null).get(); }
    public static int min(int[] arr) { return Arrays.stream(arr).min().getAsInt(); }
    public static double average(int[] arr) { double sum = Arrays.stream(arr).mapToDouble(i -> i).sum();
    return sum / arr.length; } }
