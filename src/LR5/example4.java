package LR5;

import java.util.Scanner;
class example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        Character character = getCharacter(input);
        int integer = getInteger(input);

        System.out.printf("Символьное поле: %c (%d год)%n", character, integer);
        System.out.println("Целочисленное поле: " + integer);
    }

    private static Character getCharacter(double input) {
        return (char) (Math.floor(input) + 64);
    }

    private static int getInteger(double input) {
        double fractionalPart = Math.floor(input * 100) % 100;
        return (int) Math.round(fractionalPart);
    }

}
