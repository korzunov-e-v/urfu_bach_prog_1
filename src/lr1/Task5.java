package lr1;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input year of your birthday: ");
        int user_year = in.nextInt();

        int current_year = Calendar.getInstance().get(Calendar.YEAR);

        int user_age = current_year - user_year;

        String result = MessageFormat.format(
                "You are {0} years old.",
                user_age
        );
        System.out.println(result);

        in.close();
    }
}
