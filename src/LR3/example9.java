package LR3;

import java.util.Random;

public class example9 {
    public static void main(String[] args) {

        int[] array;
        array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив:");
        for (int number : array) {
            System.out.print(number + " ");
        }

        int min = array[0];
        int indexMin = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }

        System.out.println(" ");
        System.out.println("Минимальное значение: " + min);
        System.out.println("Индекс минимального значения: " + indexMin);
    }
}
