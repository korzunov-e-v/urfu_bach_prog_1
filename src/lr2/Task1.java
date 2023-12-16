package lr2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int user_input = in.nextInt();

        boolean is_dividable_by_3 = (user_input % 3 == 0);

        if (is_dividable_by_3) {
            System.out.println("Number " + user_input + " is dividable by 3.");
        } else {
            System.out.println("Number " + user_input + " is not dividable by 3.");
        }
    }
}
