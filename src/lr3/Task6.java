package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел массива (число больше нуля): ");
        String user_input = in.nextLine();

        int num = validate_and_parse_user_input(user_input);

        int[] result_seq = make_seq(num);
        System.out.println("Последовательность: " + Arrays.toString(result_seq));
    }

    public static int[] make_seq(int count) {
        int[] result = new int[count];
        int i = 0;
        int curr_num = 0;
        do {
            boolean cond_1 = (curr_num % 5 == 2);
            if (cond_1) {
                result[i] = curr_num;
                i++;
            }
            curr_num++;
        } while (i < count);

        return result;
    }

    public static Integer validate_and_parse_user_input(String input) {
        int num = 0;
        try {
            num = Integer.parseInt(input);
            if (num < 0) {
                throw new Exception("Меньше нуля");
            }
        } catch (Exception e) {
            System.out.println("Введено некорректное значение");
            System.exit(1);
        }
        return num;
    }
}
