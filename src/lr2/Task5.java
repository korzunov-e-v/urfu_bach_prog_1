package lr2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int num = in.nextInt();

//        first ez solution
        int result1 = (num - (num - num % 10000)) / 1000;

//        second solution
        String result2;
        String num_as_str = Integer.toString(num);

        if (num_as_str.length() >= 4) {
            char[] num_as_array = num_as_str.toCharArray();
            char thousands_char = num_as_array[num_as_array.length - 4];
            result2 = Character.toString(thousands_char);
        } else {
            result2 = "0";
        }

        System.out.println(result1);
        System.out.println(result2);
    }
}
