package lr1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input this month name: ");
        String month_name = in.nextLine();

        System.out.println("Input number of days in this month: ");
        int days_in_month = in.nextInt();

        String result = MessageFormat.format(
                "There are {0} days in {1}",
                days_in_month, month_name
        );
        System.out.println(result);

        in.close();
    }
}
