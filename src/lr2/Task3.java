package lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int user_input = in.nextInt();

        boolean cond_1 = (user_input % 4 == 0);
        boolean cond_2 = (user_input >= 10);

        if (cond_1 & cond_2) {
            System.out.println("Number " + user_input + " is accepted.");
        } else {
            System.out.println("Number " + user_input + " is not accepted.");
        }
    }
}
