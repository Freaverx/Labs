package LR6;

import java.util.Arrays;
public class example8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double average = getAverage(numbers);
        System.out.println("Среднее значение: " + average);
    }

    public static double getAverage(int[] numbers) {
        double sum = 0.0;
        for(int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

}
