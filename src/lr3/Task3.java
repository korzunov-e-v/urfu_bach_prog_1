package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел для вывода последовательности Фибоначчи: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        if (count < 1) {
            System.out.println("Введено некорректное количество.");
            System.exit(1);
        }

        long[] result_while = fib_while(count);
        String result_for = fib_for(count);

        System.out.println("Цикл while: " + Arrays.toString(result_while));
        System.out.println("Цикл for: " + result_for);

    }

    public static long[] fib_while(int count) {
        long[] result = new long[count];

        int i = 0;
        long prev1 = 1;
        long prev2 = 1;
        while (i < count) {
            long num = prev1 + prev2;
            result[i] = prev1;
            prev1 = prev2;
            prev2 = num;
            i++;
        }
        return result;
    }

    public static String fib_for(int count) {
        StringBuilder result_b = new StringBuilder();

        long prev1 = 1;
        long prev2 = 1;
        for (int i = 0; i < count; i++) {
            long num = prev1 + prev2;
            result_b.append(prev1).append(" ");
            prev1 = prev2;
            prev2 = num;
        }
        return result_b.toString();
    }
}
