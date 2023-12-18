package lr3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите название дня недели полностью: ");
        Scanner in = new Scanner(System.in);
        String weekday = in.nextLine();

        weekday = weekday.toLowerCase();

        switch (weekday) {
            case ("понедельник") -> System.out.println("Номер дня недели: 1");
            case ("вторник") -> System.out.println("Номер дня недели: 2");
            case ("среда") -> System.out.println("Номер дня недели: 3");
            case ("четверг") -> System.out.println("Номер дня недели: 4");
            case ("пятница") -> System.out.println("Номер дня недели: 5");
            case ("суббота") -> System.out.println("Номер дня недели: 6");
            case ("воскресенье") -> System.out.println("Номер дня недели: 7");
            default -> System.out.println("Это не день недели.");
        }
    }
}
