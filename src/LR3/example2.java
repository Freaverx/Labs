package LR3;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня: ");
        String dayName = scanner.nextLine();

        int dayNumber = -1;
        switch (dayName) {
            case "Понедельник":
                dayNumber = 1;
                break;
            case "Вторник":
                dayNumber = 2;
                break;
            case "Среда":
                dayNumber = 3;
                break;
            case "Четверг":
                dayNumber = 4;
                break;
            case "Пятница":
                dayNumber = 5;
                break;
            case "Суббота":
                dayNumber = 6;
                break;
            case "Воскресенье":
                dayNumber = 7;
                break;
            default:
                System.out.println("Такого дня нет.");
        }

        if (dayNumber != -1) {
            System.out.println("Порядковый номер дня: " + dayNumber);
        } else {
            System.out.println("Ошибка ввода данных.");
        }
    }
}