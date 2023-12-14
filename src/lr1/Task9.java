package lr1;

import java.util.Scanner;
import java.lang.Math;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int a = in.nextInt();

        int a0 = a - 1;
        int a2 = a+1;
        int a3 = (int)Math.pow(a0+a, 2);

        String result = a0 + " " + a + " " + a2 + " " + a3;

        System.out.println(result);

        in.close();
    }
}
