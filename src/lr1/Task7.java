package lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int user_age = in.nextInt();

        int current_year = Calendar.getInstance().get(Calendar.YEAR);

        int user_birth_year = current_year - user_age;

        System.out.println("Your year of birthday is " + user_birth_year + ".");

        in.close();
    }
}
