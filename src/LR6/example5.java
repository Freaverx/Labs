package LR6;

import java.util.Scanner;
public class example5 {
    public static void main(String[] args) {
        System.out.print("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = calculateSumOfSquares(n);
        double formula = getFormulaValue(n);

        System.out.format("Сумма квадратов натуральных чисел от 1 до %d: %s%n",
                n, sum);
        System.out.format("Значение по формуле: %f%n", formula);
        if (Math.abs(formula - (double) sum) < 0.0001) {
            System.out
                    .format("Проверка по формуле выполняется: разница между значениями меньше 0.0001%n");
        } else {
            System.out.format(
                    "Проверка по формуле не выполняется: разница между значениями равна %f%n",
                    formula - (double) sum);
        }

    }

    private static double getFormulaValue(int n) {
        return 0;
    }

    private static long calculateSumOfSquares(int n) {
        return 0;
    }
}
