package lr1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input this weekday: ");
        String weekday = in.nextLine();

        System.out.println("Input this month name: ");
        String month_name = in.nextLine();

        System.out.println("Input this day of month: ");
        int day_of_month = in.nextInt();

        String result = MessageFormat.format(
                "Today is {0} {1} of {2}",
                weekday, day_of_month, month_name
        );
        System.out.println(result);

        in.close();
    }
}
