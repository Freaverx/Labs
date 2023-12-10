package LR3;

import java.util.Scanner;

public class example2_1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня: ");
        String dayName = scanner.nextLine();

        int dayNumber = -1;

        if("Понедельник".equals(dayName)){
            dayNumber = 1;
        }else if("Вторник".equals(dayName)) {
            dayNumber = 2;
        } else if ("Среда".equals(dayName) ) {
            dayNumber = 3;
        } else if("Четверг".equals(dayName)) {
            dayNumber = 4;
        } else if ("Пятница".equals(dayName)) {
            dayNumber = 5;
        } else if ("Суббота".equals(dayName)) {
            dayNumber = 6;
        } else if ("Воскресенье".equals(dayName)) {
            dayNumber = 7;
        } else{
            System.out.println("Такого дня нет.");
        }

        if (dayNumber != -1) {
            System.out.println("Порядковый номер дня: " + dayNumber);
        } else {
            System.out.println("Ошибка ввода данных.");
        }

    }
}
