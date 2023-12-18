package lr3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите номер дня недели (число от 1 до 7): ");
        Scanner in = new Scanner(System.in);
        int num_of_weekday = in.nextInt();

        if (num_of_weekday < 1 | num_of_weekday > 7) {
            System.out.println("Введено некорректное значение.");
            System.exit(1);
        }

        switch (num_of_weekday) {
            case (1):
                System.out.println("Это понедельник.");
                break;
            case (2):
                System.out.println("Это вторник.");
                break;
            case (3):
                System.out.println("Это среда.");
                break;
            case (4):
                System.out.println("Это четверг.");
                break;
            case (5):
                System.out.println("Это пятница!");
                break;
            case (6):
                System.out.println("Это суббота!");
                break;
            case (7):
                System.out.println("Это воскресенье!");
                break;
        }
    }
}
