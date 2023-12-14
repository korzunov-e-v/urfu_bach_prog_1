package lr1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first name: ");
        String first_name = in.nextLine();

        System.out.println("Input second name: ");
        String second_name = in.nextLine();

        System.out.println("Input third name: ");
        String last_name = in.nextLine();

        String greeting = MessageFormat.format("Hello, {0} {1} {2}", first_name, second_name, last_name);
        System.out.println(greeting);

        in.close();
    }
}
