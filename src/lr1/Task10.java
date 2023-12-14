package lr1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int a = in.nextInt();

        System.out.println("Input second number: ");
        int b = in.nextInt();

        int sum = a + b;
        int sub = a - b;

        String result = "Sum=" + sum + ". Sub=" + sub + ".";

        System.out.println(result);

        in.close();
    }
}
