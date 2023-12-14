package lr1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input age: ");
        int age = in.nextInt();

        String result = MessageFormat.format("Your name: {0}. Your age {1}.", name, age);
        System.out.println(result);

        in.close();
    }
}
